package com.test.springcore.sample;

import org.springframework.beans.factory.annotation.Value;

public class HelloWorldSample {

    
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
 
    public String sayHello() {
        return "Hello! " + name;
    }
    
}
