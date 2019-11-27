package com.test.mutithrading;

public class InteruptedWaiting8 {

    public static void main(String[] args) {

        myThead5 mt5 = new myThead5();
        mt5.start();
        mt5.interrupt();
        System.out.println("main ends here");
    }

}

class myThead5 extends Thread {

    public void run() {
        for (int i = 0; i < 1000; i++) {

            System.out.println("fast Thread count is " + i);
        }

        for (int j = 0; j < 10; j++) {
            try {
                System.out.println("before interuption print sttaement");
                Thread.sleep(2000);
                System.out.println("after interuption print sttaement");
            } catch (InterruptedException ie) {
                System.out.println("******************  Exception occored" + ie.getMessage()+"***************");
            }
        }
    }
}