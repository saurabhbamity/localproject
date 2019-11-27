package com.test.syncronize;

import java.util.concurrent.TimeUnit;

public class ThreadStopDemo {

    public static void main(String[] args) {

        Server ser = new Server();
        ser.setName("StopDemoThreadExam");
        try
        {
        Thread t1 = new Thread(ser, "T1");
        //t1.start();
        t1.run();
        
        //Now, let's stop our Server thread
        System.out.println(Thread.currentThread().getName() + " is stopping Server thread");
        ser.setStopFlag(true);;
        
        //Let's wait to see server thread stopped 
        TimeUnit.MILLISECONDS.sleep(200);
        
        System.out.println(Thread.currentThread().getName() + " is finished now");
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}

class Server extends Thread {
    private volatile boolean stopFlag = false;

    @Override
    public void run() {
        while (!stopFlag) {
            System.out.println(Thread.currentThread().getName() + " is running server");
        }
    }

    public void setStopFlag(boolean flag) {
        stopFlag = flag;
    }
}