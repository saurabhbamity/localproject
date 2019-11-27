package com.test.aop.understandaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMainJoinPoints {

    public static void main(String[] args) {


        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        ShapeService shapeservice=(ShapeService)ctx.getBean("shapeService");
        
        
        shapeservice.getCircle().setRadious(5);
        System.out.println("Circle name :->"+shapeservice.getCircle().getName());
       
        System.out.println("Tringle name :->"+  shapeservice.getTringle().getName());
        
        shapeservice.getTringle().setArea(1456);
        
        System.out.println("Tringle name :->"+  shapeservice.getTringle().getArea());

    }

}
