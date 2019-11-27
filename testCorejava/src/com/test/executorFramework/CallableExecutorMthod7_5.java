package com.test.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.corba.se.impl.orbutil.closure.Future;

public class CallableExecutorMthod7_5 {
    
    public static void main(String[] args) {
        
        MyCallablee[] myCallableeArray={new MyCallablee(5)/*, new MyCallablee(6),new MyCallablee(7)*/};
        
        //Executor callableservice= ExecutorService. 
        ExecutorService service = Executors.newFixedThreadPool(2);
        
        for(MyCallablee callableeObject: myCallableeArray)
        {
            java.util.concurrent.Future f= service.submit(callableeObject);
            try {
                System.out.println("sum is :"+f.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        service.shutdown();
    }

}


class MyCallablee implements Callable{
    
    int number;
    
    public MyCallablee(int number) {
        System.out.println("my callable constructor"+number);
        this.number=number;
    }

    
    /*
     * (non-Javadoc)
     * @see java.util.concurrent.Callable#call()
     * return sum of next 10 numbers
     */
    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("number before add is "+(10+number));
        int j=(10+number);
        
        for(int i=0 ;i<=j;i++)
        {
            number=number+i;
            System.out.println("number add is "+number+" value of i is "+i);
        }
        System.out.println("number is "+number);
        return number;
    }
    
}
