package com.test.camel.processsor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessortest implements Processor {
    
    public void process(Exchange exchange) throws Exception {
        System.out.println("hello");
    }

}
