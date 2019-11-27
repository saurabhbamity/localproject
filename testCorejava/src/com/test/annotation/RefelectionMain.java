package com.test.annotation;

public class RefelectionMain {
    
    public static void main(String[] args) {
        
        try {
            Class.forName("com.test.annotation.Reflectiontest").newInstance();
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}



class Reflectiontest{
    
    public Reflectiontest(String test){
        System.out.println("constructor test");
    }
    
}