
/**
 * dead lock example.
 * waiting for child Thread until main  thread completes Example and  waiting for main Thread until child  thread completes Example 
 * hence deadlock. 
 */
 
package com.test.mutithrading;

public class joinExample6 {

    public static void main(String[] args) throws InterruptedException {
        
        ChildThread6.tempThead= Thread.currentThread(); 
        ChildThread6 ct6= new ChildThread6();
        ct6.setName("child Thread1");
        ct6.start();
        ct6.join();
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thead running: "+Thread.currentThread().getName());
            
        }
    }
}


class ChildThread6 extends Thread {
    
    public static Thread tempThead;
    @Override
    public void run(){
        try{
            System.out.println("child Thread join called");
            tempThead.join();
            
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
