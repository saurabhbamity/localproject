package com.test.springcore.beanpostprocessor;

public class HelloWorld {

    private String message;

    public void setMessage(String message){
       this.message  = message;
    }
    public void getMessage(){
       System.out.println("Your Message : " + message);
    }
    public void myInit(){
       System.out.println("Bean is going through MyInit method.**************");
    }
    
    public void defalutInit(){
        System.out.println("Bean is going through defalut init.************");
     }
    
    public void myDestroy(){
       System.out.println("Bean will MyDestroy now.****************");
    }
    
    public void defaultDestroy(){
        System.out.println("Bean will default destroy now.****************");
     }
}
