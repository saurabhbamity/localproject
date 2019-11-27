package com.test.executorFramework;

public class THreadLocalExample8 {

    
    public static void main(String[] args) {
        
        
        ThreadLocal tl= new ThreadLocal() {
            
            @Override
            public Object initialValue()
            {
                return "intialvalue";
            }
        };
        tl.set("testObject");
        System.out.println("thread Local value : "+tl.get());
        tl.set("anotherValue");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }
}
