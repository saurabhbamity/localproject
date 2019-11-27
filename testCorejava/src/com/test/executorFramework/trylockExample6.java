package com.test.executorFramework;

import java.util.concurrent.locks.ReentrantLock;

public class trylockExample6 {
    
    public static void main(String[] args) {
        
        MyThread1 mt1= new MyThread1();mt1.setName("first");
        MyThread1 mt2= new MyThread1();mt2.setName("second");
        mt1.start();
        mt2.start();
    }
    
}

class MyThread1 extends Thread{
    
    static ReentrantLock l= new ReentrantLock();
    public void run()
    {
        if(l.tryLock()){
            
            System.out.println("Thread name: "+Thread.currentThread().getName()+" executed in if");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println("doing unlock for : "+Thread.currentThread().getName());
                l.unlock();
            }
            
        }else{
            System.out.println("Thread name: "+Thread.currentThread().getName()+" executed in else");
        }
    }
}
