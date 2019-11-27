package com.test.springcore.aspact.Logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    
    @Before("execution(* com.test.springcore.aspact.CustomerBoImpl.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }
    
    @After("execution(* com.test.springcore.aspact.CustomerBoImpl.addCustomer(..))")
    public void logAfter(JoinPoint joinPoint) {

        System.out.println("logAfter() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");

    }
    
    @Before("execution(public String com.test.aop.understandaop.Circle.getName())")
    public void logBefore() {
            System.out.println("logBefore() is running!##############");
    }
    
    
    @Before("firstPointcutAllgetters() && allCircleMethodPointcut()")
    public void logBeforeStar() {
            System.out.println("logBefore() is running for All gettersNames* * loging!##############");
    }
    
   /* @Before("allCircleMethodPointcut()")
    public void logAfterStar() {
            System.out.println("logbeforestart() is running for all method in side aop.understandaop!$$$$$$$");
    }*/
    
    @Pointcut("execution(* getName(..))")
    public void firstPointcutAllgetters(){
        
    }
    
    //.. understand/covers all subpackages.
    @Pointcut("within(com.test.aop.understandaop..*)")
    public void allCircleMethodPointcut(){
        
    }
}
