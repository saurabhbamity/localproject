package com.test.mutithrading;

public class BestDeadLockExample {

    public static void main(String[] args) {
        
        try{
        //here the main Thread waitin to complete himself first, to start its own executing, 
        //this is deadlock state
        Thread.currentThread().join();
        }
        catch(InterruptedException ie)
        {
            System.out.println("interupted Exception : "+ie.getLocalizedMessage());
        }
        
    }
    
}
