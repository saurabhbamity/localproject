package com.test.springcore.aspact.Logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectJoinPoints {
    
    
    // Requirement is to print set if setter called and get if getter called in circle.
    /*@Before("allgettersSettersCircle()")
    public void printAllmethodCircle(JoinPoint jp)
    {
        System.out.println("join points is"+jp.toString());
        if (jp.getSignature().toString().contains("get")) {
            System.out.println("Print Circle getter");
        } else {
            System.out.println("Print Circle setter");
        }
    }
    
    @Before("args(name) && allgettersSettersCircle()")
    public void allmethodwithStringArgument(String name){
        System.out.println("argument value that is been passed is . code of AOP before: "+name);
    }
  
    //pointcut Expression
    @Pointcut("within(com.test.aop.understandaop.Circle)")
    public void allgettersSettersCircle(){
        
    }*/
    
    @After("within (com.test.aop.understandaop.Circle)")
    public void AfterAdviceCircleSetter(){
        System.out.println("after Advice for circle setter is excuted");
    }
    
    @AfterThrowing("within (com.test.aop.understandaop.Circle)")
    public void AfterAdviceThrowsCircleGetter(){
        System.out.println("after Advice throws for circle getter is excuted ,it runs only when exceptions occours");
    }
    
    @AfterReturning("within (com.test.aop.understandaop.Circle)")
    public void AfterAdviceRerurningCircleGetter(){
        System.out.println("after Advice throws for circle getter is excuted ,it will run for sure");
    }
    
    @AfterReturning(pointcut="tringlegetterMethod()", returning="returningString")
    public void AfterAdviceRerurningTringleGetter(String returningString){
        System.out.println("after Advice throws for Tringle getter is excuted ,and the return type is "+returningString+"<- here it is ");
    }
    
    @Pointcut("execution (public * com.test.aop.understandaop.Tringle.getName())")
    public void tringlegetterMethod()
    {    
    }
    
    @Around("execution (public * com.test.aop.understandaop.Tringle.getName())")
    public void AroundAdviceMethod(ProceedingJoinPoint proceedingJointPoints){
        
        Object returnvalue=null;
        
        System.out.println("th is before the actual code running!!!!!!!!!!!!");
        try{
            //this proceed can be avoided if the use wanted, based on some condition.
          returnvalue=   proceedingJointPoints.proceed();
          
          System.out.println("return value from the proceeding joint point is ->"+returnvalue+"!!!!!!!!!!!");
          
        }catch(Throwable ex){
            ex.printStackTrace();
        }
        System.out.println("th is after the actual code running!!!!!!!!!!!!");
    }
    
    
    @Around("@annotation(com.test.aop.customannotation.Loggable)")
    public void AroundAdviceMethodcustomAnnotaion(ProceedingJoinPoint proceedingJointPoints){
        
        Object returnvalue=null;
        
        System.out.println("the custom annotation before the actual code running!!!!!!!!!!!!");
        try{
            //this proceed can be avoided if the use wanted, based on some condition.
          returnvalue=   proceedingJointPoints.proceed();
          
          System.out.println("return value from the proceeding joint point is ->"+returnvalue+"!!!!!!!!!!!");
          
        }catch(Throwable ex){
            ex.printStackTrace();
        }
        System.out.println("the custom annotation  after the actual code running!!!!!!!!!!!!");
    }
}
