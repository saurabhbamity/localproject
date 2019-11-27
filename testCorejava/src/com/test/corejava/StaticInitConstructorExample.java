package com.test.corejava;

public class StaticInitConstructorExample {

    static{
        System.out.println("static block");
        }
    
        {
        System.out.println("init block");
        }
        
       public  StaticInitConstructorExample()  {
           System.out.println("constructor call");
       }
       
       public void m1(){
           System.out.println("m1 called");
       }
       
       public static void main(String[] args) {
        
           StaticInitConstructorExample st= new StaticInitConstructorExample();
           st.m1();
           
           System.out.println("************************");
           StaticInitConstructorExample st1= new StaticInitConstructorExample();
           st1.m1();
           
           
    }
}


