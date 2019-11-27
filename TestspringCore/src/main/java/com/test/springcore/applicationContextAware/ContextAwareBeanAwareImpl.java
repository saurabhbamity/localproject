package com.test.springcore.applicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextAwareBeanAwareImpl {
    
    public static void main(String[] args) {
        
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationcontext.xml");
        
        //calling this bean will call its lifecycle methods, and will be printed in console.
        ContextAwareBeanAware lifecycle=(ContextAwareBeanAware)ctx.getBean("aware");
        
    }

}
