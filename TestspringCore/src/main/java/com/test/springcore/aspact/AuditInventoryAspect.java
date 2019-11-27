package com.test.springcore.aspact;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class AuditInventoryAspect {

    final static Logger logger = Logger.getLogger(AuditInventoryAspect.class);
    
    @Pointcut("execution(* com.test.springcore.aspact.*.*(..))")
    public void serviceMethods() {
    }
    
    @Before("serviceMethods()")
    public void beforeMethod() {
        logger.info("before method:Audit aspact");
    }

    @Around("serviceMethods()")
    public Object aroundMethod(ProceedingJoinPoint joinpoint) {
        try {
            long start = System.nanoTime();
            Object result = joinpoint.proceed();
            long end = System.nanoTime();
            logger.info(String.format("%s took %d ns", joinpoint.getSignature(), (end - start)));
            return result;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @After("serviceMethods()")
    public void afterMethod() {
        logger.info("after method");
    } 
}
