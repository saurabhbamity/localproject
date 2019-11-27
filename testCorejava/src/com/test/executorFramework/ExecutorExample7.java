package com.test.executorFramework;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample7 {

    public static void main(String[] args) {

        MyRunnable[] mrArray = {new MyRunnable("first"), new MyRunnable("second"), new MyRunnable("third"), new MyRunnable("four"), new MyRunnable("five")};

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (MyRunnable mr : mrArray) {
            service.submit(mr);
        }
        int x=2;
        int y=2;
        System.out.println(Objects.equals(new Integer(2), new Integer(2)));
       // service.shutdown();
    }

}

class MyRunnable implements Runnable {

    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name+"...current Thrad executing is : " + Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
            
        }catch(InterruptedException e)
        {
            System.out.println(name+"...current Thrad Interupted by : " + Thread.currentThread().getName());
        }
        System.out.println(name+"...current Thrad executing ending : " + Thread.currentThread().getName());

    }
}
