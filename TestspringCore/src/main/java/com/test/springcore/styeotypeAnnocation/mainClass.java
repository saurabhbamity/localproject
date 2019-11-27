package com.test.springcore.styeotypeAnnocation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationcontext.xml");
        //ComponentClass component= (ComponentClass)ctx.getBean("ComponentClass");
        Controllerclass controller =(Controllerclass)ctx.getBean("controllerclass");
        //ComponentClasses component= (ComponentClasses)ctx.getBean("ComponentClasses");
        ServiceClass service =(ServiceClass)ctx.getBean("serviceClass");
        
        
        //component.componentMethod();
        controller.controllerServicecall();
        
        System.out.println("value of repository: "+service.repository);
        
        System.out.println("value of repository: "+service.repository1);
        
        

    }

}
