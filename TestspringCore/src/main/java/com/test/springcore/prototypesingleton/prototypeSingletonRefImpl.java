package com.test.springcore.prototypesingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class prototypeSingletonRefImpl {
    
    public static void main(String[] args) {
        
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        Human human1=(Human)ctx.getBean("human");
        Human human2=(Human)ctx.getBean("human");
        
        System.out.println("hascode Human");
        System.out.println("first Human"+human1.hashCode());
        System.out.println("Second Human"+human2.hashCode()+"\n");
        
        System.out.println("hascode Human organs");
        
        System.out.println("first Human Organ"+human1.getOrgan().hashCode());
        System.out.println("Second Human"+human2.getOrgan().hashCode());
        
    }

}
