package com.test.springcore.applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextAwareBeanAware  implements ApplicationContextAware, BeanNameAware{

    public void setBeanName(String name) {
       
        System.out.println("I have set bean method during initialization of the bean: "+name);
        
    }

    public void setApplicationContext(
            ApplicationContext ctx) throws BeansException {
       System.out.println("I have applicationContect during initialization of the bean : "+ctx.getApplicationName()+"id is :"+ctx.getId());
        
    }

}
