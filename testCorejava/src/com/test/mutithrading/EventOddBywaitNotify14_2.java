package com.test.mutithrading;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class EventOddBywaitNotify14_2 {

}



class EvenThread extends Thread
{
public EventOddBywaitNotify14_2 main;
    
    public EvenThread(EventOddBywaitNotify14_2 main) {
        this.main=main;
    }
    @Override
    public void run(){
        
        synchronized (main) {
            for (int i = 0; i <= 100; i = i + 2) {
                System.out.println("event  number Thead" + i);
                try {
                   wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}



class oddThread extends Thread
{
    public EventOddBywaitNotify14_2 main;
    
    public oddThread(EventOddBywaitNotify14_2 main) {
        this.main=main;
    }
    @Override
    public void run(){
        
        synchronized (main) {
            for (int i = 1; i < 101; i = i + 2) {
                System.out.println("event  number Thead" + i);
                notify();
                
            }
        }
    }
}