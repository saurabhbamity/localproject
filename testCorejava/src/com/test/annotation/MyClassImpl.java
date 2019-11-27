package com.test.annotation;
import java.net.Socket;

public class MyClassImpl {

    @Developer("droy")
    public static void connect2Exchange(Socket sock) {
        // do something here
        System.out.println("Demonstration example for Runtime annotations");
    }
}