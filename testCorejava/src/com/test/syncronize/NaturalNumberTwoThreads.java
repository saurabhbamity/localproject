package com.test.syncronize;

public class NaturalNumberTwoThreads {

    static Object lock = new Object();

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            public void run() {

                for (int i = 1; i < 100; i = i + 2) {
                    synchronized (lock) {
                        System.out.println("name:" + Thread.currentThread().getName() + "count: " + i);
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });

        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int i = 2; i <= 100; i = i + 2) {
                    synchronized (lock) {
                        System.out.println("name:" + Thread.currentThread().getName() + "count: " + i);
                        try {
                            lock.notify();
                            if(i==100) {break;}
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });

        try {
            t.setName("odd Number Thead");
            t1.setName("even Number Thead");
            t.start();
            t1.start();
            t.join();
            t1.join();
            System.err.println("this is main thread closed by: -> "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
