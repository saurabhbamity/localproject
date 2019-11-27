package com.test.camel.route;

import org.apache.camel.builder.RouteBuilder;

public class SampleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C:/inputFolder").to("file:C:/outputFolder2");
    }
}
