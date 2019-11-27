package com.test.syncronize;

public class MutlipleConsumer {
    
    public static Object lock= new Object();

    public static void main(String[] args) {
        
        producer p= new producer();
        p.setName("producer Thread");

        consumer1 c1= new consumer1();
        c1.setName("consumer1");
        
        consumer2 c2= new consumer2();
        c2.setName("consumer2");
        
        //start these consumer and producers
        
        p.start();
        c1.start();
        c2.start();
    }
}

class producer extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (MutlipleConsumer.lock) {
                try {
                    System.out.println("name : " + Thread.currentThread().getName()+"\n value: "+SleepNWait.i++);
                    //Thread.sleep(2000);
                    MutlipleConsumer.lock.notifyAll();
                    MutlipleConsumer.lock.wait();
                    //Thread.currentThread().wait(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class consumer1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (SleepNWait.lock) {
                try {
                    System.out.println("name : " + Thread.currentThread().getName()+"\n value: "+SleepNWait.i);
                    //Thread.sleep(2000);
                    MutlipleConsumer.lock.notify();
                    MutlipleConsumer.lock.wait();
                    //Thread.currentThread().wait(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class consumer2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (SleepNWait.lock) {
                try {
                    System.out.println("name : " + Thread.currentThread().getName()+"\n value: "+SleepNWait.i);
                    //Thread.sleep(2000);
                    MutlipleConsumer.lock.notify();
                    MutlipleConsumer.lock.wait();
                    //Thread.currentThread().wait(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}