package com.test.mutithrading;

public class EvenOddNumber {

}

class MyEvenThread extends Thread{
    
    
    
    EvenOddNumber eventoddmain;

    public void run() {

        synchronized (eventoddmain) {

            for (int i = 0; i < 100; i = i + 2) {
                System.out.println("Number is: " + i);

            }
        }

    }
}

class MyOddThread extends Thread {

    EvenOddNumber eventoddmain;

    public void run() {

        synchronized (eventoddmain) {

            for (int i = 1; i < 100; i = i + 2) {
                System.out.println("Number is: " + i);

            }
        }

    }
}
