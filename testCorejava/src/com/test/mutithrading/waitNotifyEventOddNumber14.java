package com.test.mutithrading;

public class waitNotifyEventOddNumber14 {

    public static void main(String[] args) {
        
        waitNotifyEventOddNumber14 mainclass= new waitNotifyEventOddNumber14();
        eventNumber even= new eventNumber(mainclass);
        oddNumber odd= new oddNumber(mainclass);
        even.start();
        odd.start();
    }
}

class oddNumber extends Thread {
    
    public waitNotifyEventOddNumber14 main;
    
    public oddNumber(waitNotifyEventOddNumber14 main)
    {
        this.main=main;
    }

    public void run() {

        synchronized (main) {

            for (int i = 1; i < 100; i = i + 2) {
                System.out.println("odd number is " + i);
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                //notify();
            }
        }
    }
}

class eventNumber extends Thread {

    public waitNotifyEventOddNumber14 main;
    
    public eventNumber(waitNotifyEventOddNumber14 main)
    {
        this.main=main;
    }

    public void run() {
        synchronized (main) {

            for (int i = 0; i < 100; i = i + 2) {
                System.out.println("even number is " + i);
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                //notify();
            }
        }
    }

}
