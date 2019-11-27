
/**
 * waiting for main Thread untill child thread completes Example . 
 */
 
package com.test.mutithrading;

public class joinExample4 {

    public static void main(String[] args) {
        
        ChildThread2 ct2= new ChildThread2();
        ct2.setName("child Thread2");
        
        ct2.start();
        
        try{
            ct2.join();
            // it says, as this is called from main Thread, ct2.join.main, main with join ct2 will complete.
            //ct2.join.main, first ct2 will complete its execution, than main will start.
            //the Thread from which Join is called, will finish first joined child Thread will complete.
        
        }catch(InterruptedException ie)
        {
            System.out.println("ex is "+ie.getLocalizedMessage());
        }
        
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thead running: "+Thread.currentThread().getName());
            
        }
    }
}


class ChildThread2 extends Thread {
    
    @Override
    public void run(){
        
        for(int i=0;i<10;i++)
        {
            System.out.println("child Thread 2 for Thead: "+Thread.currentThread().getName());
            //Thread.yield();
            try{
            Thread.sleep(2000);
            }catch(Exception ex)
            {
                System.out.println("Exception is: "+ex.getLocalizedMessage());
            }
        }
    }
}
