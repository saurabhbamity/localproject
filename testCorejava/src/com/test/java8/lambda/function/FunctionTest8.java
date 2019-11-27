package com.test.java8.lambda.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest8 {
    
    public static int squareit(int num)
    {
        return num*num;
    }
    
    /** 
     * simple method convert in lamda Expresion:
     * no name
     * no return type
     * no access modifier
     */
    public static  void m1()
    {
        System.out.println("inside m1 method");
    }
    
    
    
   
    public static void main(String[] args) {
        
        /**
         * Function usinh java 8.
         */
        Function<Integer, Integer> f=number->number*number;
        
        
        Predicate<Integer> p=i->i%2==0;
        
        System.out.println("square of 5:->"+ squareit(5));
        System.out.println("square of 6:->"+ squareit(6));
        
        System.out.println("square of 7 by functional programing: ->"+ f.apply(7));
        System.out.println("square of 8 by functional programing: ->"+ f.apply(8));    
    
       
    }
    
    

}
