package com.test.camel.route;

import org.apache.camel.builder.RouteBuilder;

import com.test.camel.processsor.MyProcessor;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        
        from("file:C:/inputFolder?noop=true").process(new MyProcessor()).to("file:C:/outputFolder");
    }
}
