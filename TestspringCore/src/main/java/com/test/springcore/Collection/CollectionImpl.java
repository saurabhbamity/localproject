package com.test.springcore.Collection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionImpl {
    
    public static void main(String[] args) {
        
        AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        //Tringle t=(Tringle)ctx.getBean("tringle");
        //Tringle t=(Tringle)ctx.getBean("tringlename");//trialias
        Tringle t=(Tringle)ctx.getBean("trialias");
        List<Point> pointList=t.getPoints();
        for (Point p: pointList)
        {
            System.out.println("x coordinate is "+p.getXcordinate()+"and y cordinate is "+p.getYcordinate());
        }
        ctx.registerShutdownHook();
        ctx.close();
        
    }

}
