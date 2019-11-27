package com.test.syncronize;



public class SleepNWait {

    public static Object lock= new Object();
    public static int i;
    
    public static void main(String[] args) {

        MyThread mt1 = new MyThread();
        mt1.setName("first");
        MyThread2 mt2 = new MyThread2();
        mt2.setName("second");
        mt1.start();
        mt2.start();
        //sleep(100);
    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (SleepNWait.lock) {
                try {
                    System.out.println("name : " + Thread.currentThread().getName()+"\n value: "+SleepNWait.i++);
                    //Thread.sleep(2000);
                    SleepNWait.lock.notify();
                    SleepNWait.lock.wait();
                    //Thread.currentThread().wait(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread22 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (SleepNWait.lock) {
                try {
                    System.out.println("name : " + Thread.currentThread().getName()+"\n value: "+SleepNWait.i++);
                    //Thread.sleep(2000);
                    SleepNWait.lock.notify();
                    SleepNWait.lock.wait();
                    //Thread.currentThread().wait(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}