package com.test.aop.understandaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) {


        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        ShapeService shapeservice=(ShapeService)ctx.getBean("shapeService");
        
        
        System.out.println("Circle name :->"+shapeservice.getCircle().getName());
        System.out.println("Tringle name :->"+  shapeservice.getTringle().getName());

    }

}
