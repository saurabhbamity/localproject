package com.test.java8.lambda.function;

/*
 * this is the alternative to lambda Expression.
 * and the argument must be mached.
 * the return type and access modifier can be different.
 */
public class MethodConstructorReference {
    
    public static void m1(){
        for (int i = 0; i < 10; i++){
            System.out.println("child method my method Reference static ");
        }
    }
    
    
    public  void m2(){
        for (int i = 0; i < 10; i++){
            System.out.println("child method my method Reference non static");
        }
    }
    
    
    public static void main(String[] args) {

        Runnable r=()->{
            
            for(int i=0;i<10;i++)
            {
                System.out.println("child Thread");
            }
            
        };
        
        // normal way to start a thread
        Thread t= new Thread(r);
        t.start();
        
        
        //Start a Thread by method reference
        Runnable r2= MethodConstructorReference:: m1;
        Thread t2= new Thread(r2);
        t2.start();
        
        for(int i=0;i<10;i++)
        {
            System.out.println("parent");
        }
        MethodConstructorReference mr= new MethodConstructorReference();
        Runnable r3= mr :: m2;
        Thread t3= new Thread(r3);
        t3.start();
    }

}
