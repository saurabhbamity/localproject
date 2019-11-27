package com.test.camel.main;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import com.test.camel.route.SampleRouteBuilder;
import com.test.camel.route.SimpleRouteBuilder;

public class MainClass1 {
    
    public static void main(String[] args) {
        /*SampleRouteBuilder routeBuilder = new SampleRouteBuilder();
        CamelContext ctx = new DefaultCamelContext();
        try {
            ctx.addRoutes(routeBuilder);
            ctx.start();
            Thread.sleep(5 * 60 * 1000);
            ctx.stop();
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/
        
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
        CamelContext ctx = new DefaultCamelContext();
        try {
            ctx.addRoutes(routeBuilder);
            ctx.start();
            //Thread.sleep(5 * 60 * 1000);
            //ctx.stop();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
