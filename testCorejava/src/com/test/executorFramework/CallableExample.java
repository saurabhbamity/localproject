package com.test.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

    public static void main(String[] args) {
        
        MyCallable[] cArray= {new MyCallable(7),new MyCallable(3),new MyCallable(5)};
        
        ExecutorService es= Executors.newFixedThreadPool(3);
        
        for(MyCallable mc: cArray )
        {
            Future f= es.submit(mc);
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}


class MyCallable implements Callable{

    int num=0;
    public MyCallable(int num){
        this.num=num;
        
    }
    
    @Override
    public Object call() throws Exception {
        
        int sum=0;
        for (int i=0;i<num;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    
}
