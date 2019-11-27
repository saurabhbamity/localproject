package com.test.executorFramework;

import java.util.concurrent.locks.ReentrantLock;

public class LockVsSyncronization5 {

    public static void main(String[] args) {
        
        // modern Way of doing syncronization
        Display d= new Display();
        MyThread mt1= new MyThread(d, "dhoni");
        mt1.setName("Dhoni\n");
        MyThread mt2= new MyThread(d, "yuvraj");
        mt2.setName("Yuvraj\n");
        mt1.start();
        mt2.start();
        
     // traditional Way of doing syncronization
        DisplaySynTrdtn d1= new DisplaySynTrdtn();
        MyThreadSynTradn mt3= new MyThreadSynTradn(d1, "dhoni");
        mt3.setName("sachin\n");
        MyThreadSynTradn mt4= new MyThreadSynTradn(d1, "yuvraj");
        mt4.setName("sahwag\n");
        //mt3.start();
        //mt4.start();
    
    }
}

class Display {

    ReentrantLock l= new ReentrantLock();
    public  void  wish(String name) {
        
        l.lock();
        for (int i = 0; i < 5; i++) {
                System.out.print("hello Mr/Mrs: ");
                System.out.print("running by: "+Thread.currentThread().getName());
                
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interuption Exception"+name);
                l.unlock();
            }
        }
        l.unlock();
    }
}


class DisplaySynTrdtn {

    public  void  wish(String name) {
        
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.print("hello Mr/Mrs by TraditionSyn: ");
                System.out.print("running by TraditionSyn : "
                        + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(name);
                }
            }
        }
        
    }
}

class MyThread extends Thread {

    Display d;
    String  name;

    public MyThread(Display d, String name) {

        this.d = d;
        this.name = name;
    }
    
    public void run() {
        d.wish(name);
    }
}

class MyThreadSynTradn extends Thread {

    DisplaySynTrdtn dtn;
    String  name;

    public MyThreadSynTradn(DisplaySynTrdtn d, String name) {

        this.dtn = d;
        this.name = name;
    }
    
    public void run() {
        dtn.wish(name);
    }
}