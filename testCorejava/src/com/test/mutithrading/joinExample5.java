
/**
 * waiting for child Thread until main  thread completes Example . 
 */
 
package com.test.mutithrading;

public class joinExample5 {

    public static void main(String[] args) {
        
        //ChildThread1.tempThead= Thread.currentThread(); 
        ChildThread1 ct1= new ChildThread1();
        ct1.tempThead1=Thread.currentThread();
        ct1.setName("child Thread1");
        ct1.start();
        
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thead running: "+Thread.currentThread().getName());
            
        }
    }
}


class ChildThread1 extends Thread {
    
    //public static Thread tempThead;
    public Thread tempThead1;
    @Override
    public void run(){
        try{
            System.out.println("child Thread join called");
            tempThead1.join();
            
        }catch(InterruptedException ex)
        {
          System.out.println(ex.getLocalizedMessage());    
        }
        
        for(int i=0;i<10;i++)
        {
            System.out.println("child Thread1  for Thead: "+Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
