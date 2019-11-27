package com.test.springcore.RequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredExampleImpl {
    
    public static void main(String[] args) {
        
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        Baby baby=(Baby)ctx.getBean("babyonboard");
        Parents parents=(Parents)ctx.getBean("parentsonboard");
        
        System.out.println("baby on borad value clothes: "+baby.getNappy().getBabyCloths());
        System.out.println("parents on borad value clothes: "+parents.getNappy());//it should be null as it is not required so not initialized
        
        
    }

}
