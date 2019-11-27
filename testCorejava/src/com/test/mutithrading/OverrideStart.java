package com.test.mutithrading;


/*
 * if we override start method or create start method , this will not run run method on 
 *  
 */
public class OverrideStart {
    
    public static void main(String[] args) {
        MyThread mt= new MyThread();
        mt.start();
    }

}


class MyThread extends Thread
{

   /* public void start(){
        System.out.println("its overrided start method");
    }*/
    
    public void run(){
        
        System.out.println("iit is run mey=thod");
    }
}