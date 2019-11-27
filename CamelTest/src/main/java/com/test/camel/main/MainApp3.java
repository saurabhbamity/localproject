package com.test.camel.main;

import javax.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import com.test.camel.route.SimpleRouteBuilder3;

public class MainApp3 {
    
    
    public static void main(String[] args) {
        
       
            SimpleRouteBuilder3 routeBuilder = new SimpleRouteBuilder3();
            CamelContext ctx = new DefaultCamelContext();
            
            //configure jms component        
            ConnectionFactory  connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:6161");
            ctx.addComponent("jms", JmsComponent.jmsComponentClientAcknowledge(connectionFactory));
            
            try {
                ctx.addRoutes(routeBuilder);
                ctx.start();
                Thread.sleep(5 * 60 * 1000);
                ctx.stop();
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }
}
