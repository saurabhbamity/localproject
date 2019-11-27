package com.test.springcore.collections.autowired;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CollectionAutowiredImpl {
    
    public static void main(String[] args) {
        
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        TringleAuto t=(TringleAuto)ctx.getBean("tringleAuto");
        
        Point pa=t.getPointAA();
        Point pb=t.getPointBB();
        Point pc=t.getPointCC();
       
        System.out.println("x coordinate is "+pa.getXcordinate()+"and y cordinate is "+pa.getYcordinate());
        System.out.println("x coordinate is "+pb.getXcordinate()+"and y cordinate is "+pb.getYcordinate());
        System.out.println("x coordinate is "+pc.getXcordinate()+"and y cordinate is "+pc.getYcordinate());
        
    }

}
