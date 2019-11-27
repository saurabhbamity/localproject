package com.test.springcore.beandefinitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefinitionInheritanceImpl {
    
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        Line line=(Line)ctx.getBean("trigleInherited");
        System.out.println("point 2 value of the xaxis in line is "+line.getPoint2().getXaxis());
        System.out.println("point 2 value of the yaxis in line is "+line.getPoint2().getYaxis());
        
        Ractangle ract= (Ractangle)ctx.getBean("ractangle");
        
        System.out.println("point 1 value of the xaxis in ractangle is "+ract.getPoint1().getXaxis());
        System.out.println("point 1 value of the yaxis in ractangle is "+ract.getPoint1().getYaxis());
        System.out.println("point 4 value of the xaxis in ractangle is "+ract.getPoint4().getXaxis());
        System.out.println("point 4 value of the yaxis in ractangle is "+ract.getPoint4().getYaxis());
        
    }

}
