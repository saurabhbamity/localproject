package com.test.camel.route;

import org.apache.camel.builder.RouteBuilder;

import com.test.camel.processor.SampleProcessor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SimpleRouteBuilder3 extends RouteBuilder{
    
    @Override
    public void configure() throws Exception {
        //splitter pattern 
     /*   from("file:C:/inputFolder").split().tokenize("\n").to("jms:queue:javainuse");*/
        
 //-----------------------------------------------------------      
       /* //content based route
        from("file:C:/inputFolder").split().tokenize("\n").to("direct:test");
        
      //Content Based routing- Route the message based on the token it contains.
              from("direct:test"). 
              choice().
              when(body().contains("javainuse1"))
              .to("jms:queue:javainuse1").
              when(body().contains("javainuse2"))
              .to("jms:queue:javainuse2")
              .when(body().contains("javainuse3"))
              .to("jms:queue:javainuse3").
              otherwise().
              to("jms:queue:otherwise");
       */       
  //------------------------------------------------------------------
              
              /*from("file:C:/inputFolder").split().tokenize("\n").to("direct:test");
              
            //Recipient List- Dynamically set the recipients of the exchange 
                     //by creating the queue name at runtime
                    from("direct:test")
                    .process(new Processor() {
                        public void process(Exchange exchange) throws Exception {
                           String recipient = exchange.getIn().getBody().toString();
                           String recipientQueue="jms:queue:"+recipient;
                           exchange.getIn().setHeader("queue", recipientQueue);
                  }
                  }).recipientList(header("queue"));*/
                    
                    
    //--------------------------------------------------------------
                    
                    
                    
                    from("file:C:/inputFolder").split().tokenize("\n").to("direct:test1");
                    
                    from("jms:queue:DeadLetterQueue1")
                    //Wire Tap:Suppose get some error so send seperate copies of the message to 
                    //DeadLetter queue and also to direct:test2 
                    .process(new SampleProcessor())
                    .wireTap("jms:queue:DeadLetterQueue")
                    .to("direct:test2");
                    
                    from("direct:test2")
                    .process(new Processor() {
                        public void process(Exchange arg0) throws Exception {
                          
                            System.out.println("msg from queue after wairetab is "+arg0.getIn().getBody().toString());
                        }
                  });
             
          
    }

}
