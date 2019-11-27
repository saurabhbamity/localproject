package com.test.springcore.autowiredRequire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredImpl {

   
    /*
     * main Method.
     * 
     */
    public static void main(final String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Malik malik = (Malik) ctx.getBean("malik");

        System.out.println("Autowired happen :" + malik.getSyaamu().getName());
        System.out.println("@resouce happen same like autowired:"
                + malik.getdriver().getName());
        
        System.out.println("************************************");
        System.out.println("malik autoA "+malik.getA());  
       
    }

}
