package com.test.corejava.puzzle;

public class StopThread extends Thread{
    
    private volatile boolean isStop=false;
    

    public void setStop(boolean isStop) {
        this.isStop = isStop;
    }

    @Override
    public void run(){
        
        while(!isStop){
            System.out.println("running Thread"+currentThread().getName());
        }
    }
    
   public static void main(String[] args) {
       StopThread thread1= new StopThread();
               thread1.setName("Thread1");
       StopThread thread2= new StopThread();
               thread1.setName("Thread2");
       StopThread thread3= new StopThread();
               thread1.setName("Thread3");
       
       thread1.start();
       thread2.start();
       try {
        sleep(500);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       thread1.setStop(true);
       thread2.setStop(true);
       thread3.setStop(true);
    
 }
}
