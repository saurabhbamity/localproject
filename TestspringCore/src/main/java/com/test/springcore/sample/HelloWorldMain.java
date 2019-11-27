package com.test.springcore.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldMain {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        System.out.println("staring main......");
        
     // loading the definitions from the given XML file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 
        HelloWorldSample service = (HelloWorldSample) context.getBean("helloWorldSample");
        String message = service.sayHello();
        System.out.println(message);
 
        //set a new name
        service.setName("Spring");
        message = service.sayHello();
        System.out.println(message);
    }

}
