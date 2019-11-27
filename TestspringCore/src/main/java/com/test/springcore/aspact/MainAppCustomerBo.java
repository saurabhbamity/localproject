package com.test.springcore.aspact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppCustomerBo {

    public static void main(String[] args) {
        
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerBo customerBo= (CustomerBo)ctx.getBean("customerBoImpl");
        
        customerBo.addCustomer();
        
    }
}
