package com.test.java8.lambda.function;

public class TestingRunnableLambda {

    public static void main(String[] args) {
        
        Runnable r= ()->{
          for(int i=0;i<10;i++)
          {
              System.out.println("child class lambda :"+i);
          }
        };
        Thread t= new Thread(r);
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("parent class: "+i);
        }

    }

}
