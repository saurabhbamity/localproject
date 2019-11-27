package com.test.mutithrading;

public class WaitNotifyExample12 {

    public static void main(String[] args) {

        ThreadM m = new ThreadM();
        m.start();
        
       
        synchronized (m) {

            System.out.println("m is calling wait");
            try {
                m.wait();
            } catch (InterruptedException ie) {
                System.out.println("Exception is: " + ie.getLocalizedMessage());
            }
            System.out.println("total value is " + m.total);

        }
    }

}

class ThreadM extends Thread {
    int total = 0;

    public void run() {
        for (int i = 0; i <= 100; i++) {
            total = total + i;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        synchronized (this) {
            System.out.println("notififing " + total + " to waiting Thread");
            this.notify();
        }

        
        try{
        Thread.sleep(2000);
        }catch(InterruptedException ie)
        {
            System.out.println("this is default method");
        }
        total = total / 2;
        System.out.println("this is child class method : total/2: " + total);

    }
}
