package com.test.springcore.beanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String args[])
    {
        // Read the Configuration file using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Get the JDBC_Example class instance
        JDBCExample je = (JDBCExample) applicationContext.getBean("jdbc");
        // Call the connect() method
        je.connect();
        //
        //je.pprintValues
    }

}
