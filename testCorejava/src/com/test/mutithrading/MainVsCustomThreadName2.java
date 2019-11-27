package com.test.mutithrading;

public class MainVsCustomThreadName2 {

    public static void main(String[] args) {
        
        //Thread.currentThread().setPriority(7);
        MyCustomThread mct= new MyCustomThread();
        System.out.println("child Thread Priority : "+Thread.currentThread().getPriority());
        mct.setName("MyCustomThread");
        mct.setPriority(7);
        
        MyCustomThread2 mct2= new MyCustomThread2();
        mct2.setName("MyCustomThread2");
        mct2.setPriority(3);
        
        mct.start();
        mct2.start();
        Thread.currentThread().setName("main Thread");
        System.out.println("main Thread s.o.p "+Thread.currentThread().getName());
    }
}


class MyCustomThread extends Thread{
    
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("count: "  +i +" and run method executed by MyCustomThread: "+Thread.currentThread().getName());
            
        }    
    }
}

class MyCustomThread2 extends Thread{
    
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("count: "  +i +" and run method executed by MyCustomThread2: "+Thread.currentThread().getName());
            
        }  
    }
}
