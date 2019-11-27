package com.test.jms;
 
import java.net.URI;
import java.net.URISyntaxException;
 
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.JMSException;
import javax.jms.MessageListener;

 
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

 
//syncronous type of communication using active mq jms broker
public class JmsMessageQueueExample {
    public static void main(String[] args) throws URISyntaxException, Exception {
        BrokerService broker = BrokerFactory.createBroker(new URI("broker:(tcp://localhost:61616)"));
        broker.start();
        Connection connection = null;
        try {
            // Producer
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                    "tcp://localhost:61616");
            connection = connectionFactory.createConnection();
            Session session = connection.createSession(false,
                    Session.AUTO_ACKNOWLEDGE);
            Queue queue1 = session.createQueue("customersyncronousQueue");
            Queue queue2 = session.createQueue("customerAsyncronousQueue");
            String payload = "Important Task";
            Message msg1 = session.createTextMessage(payload);
            Message msg2 = session.createTextMessage("Important Task for asyncronous");
            MessageProducer producer1 = session.createProducer(queue1);
            MessageProducer producer2 = session.createProducer(queue2);
            System.out.println("Sending text '" + payload + "'");
            producer1.send(msg1);
            producer2.send(msg2);
 
            // Consumer
            MessageConsumer consumer1 = session.createConsumer(queue1);
            MessageConsumer consumer2 = session.createConsumer(queue2);
            consumer2.setMessageListener(new ConsumerMessageListener("Consumer"));
            connection.start();
            Thread.sleep(8000);
            TextMessage textMsg1 = (TextMessage) consumer1.receive();
            TextMessage textMsg2 = (TextMessage) consumer2.receive();
            System.out.println(textMsg1);
            System.out.println("Received: " + textMsg1.getText());
            
            //System.out.println(textMsg2);
            //System.out.println("Received asyncronous: " + textMsg2.getText());
            session.close();
        } finally {
            if (connection != null) {
                connection.close();
            }
        broker.stop();
        }
    }
 
}



 
class ConsumerMessageListener implements MessageListener {
    private String consumerName;
    public ConsumerMessageListener(String consumerName) {
        this.consumerName = consumerName;
    }
 
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println(consumerName + " received " + textMessage.getText());
        } catch (JMSException e) {          
            e.printStackTrace();
        }
    }
 
}