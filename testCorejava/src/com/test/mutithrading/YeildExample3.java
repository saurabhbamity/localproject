package com.test.mutithrading;

public class YeildExample3 {

    public static void main(String[] args)  {
        
        ChildThreaded ct= new ChildThreaded();
        ct.setName("child Thread");
        System.out.println("priority of  main Thread"+Thread.currentThread().getPriority());
        ct.setPriority(4);
        ct.start();
        
        
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thead running: "+Thread.currentThread().getName()+"value of i is : "+i);
        }
    }
}


class ChildThreaded extends Thread {
    
    @Override
    public void run(){
        
        for(int i=0;i<10;i++)
        {
            System.out.println("priority of  child Thread"+Thread.currentThread().getPriority());
            System.out.println("i value child thread:"+i);
            Thread.yield();
            System.out.println("Exmaple for Thead: "+Thread.currentThread().getName());
           
            
        }
    }
}
