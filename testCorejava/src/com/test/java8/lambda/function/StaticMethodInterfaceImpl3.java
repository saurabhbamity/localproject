package com.test.java8.lambda.function;

public class StaticMethodInterfaceImpl3 implements StaticMethodInterface, Right {

    public static void main(String[] args) {
        
        StaticMethodInterface.m1();
        //m1(); // wrong
        //StaticMethodInterfaceImpl.m1(); // wrong
        //StaticMethodInterfaceImpl st= new StaticMethodInterfaceImpl(); 
        //st.m1(); // wrong
       new  StaticMethodInterfaceImpl3().m1();
        
    }
    
    @Override
    public void m1(){
        System.out.println("right m1 by StaticMethodInterfaceImpl");
    }

}
