package com.test.mutithrading;

public class EventOddBySleep14_1 {
    
    
    public static void main(String[] args) {
        Thread evenThread= new Even();
        Thread oddThread= new odd();
      //sequence is not guaranteed
        evenThread.start();
        oddThread.start();
        
        
    }
    

}


class Even extends Thread
{
    @Override
    public void run(){
        
        for(int i=0;i<=100;i=i+2)
        {
            System.out.println("event  number Thead"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}



class odd extends Thread
{
    @Override
    public void run(){
        
        for(int i=1;i<101;i=i+2)
        {
            System.out.println("event  number Thead"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
