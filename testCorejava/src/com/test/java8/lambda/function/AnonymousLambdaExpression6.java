package com.test.java8.lambda.function;

public class AnonymousLambdaExpression6 {

    public static void main(String[] args) {

        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    System.out.println(
                            "Runnable class child by anonmous class" + i);
                }

            }
        };
        
        Runnable r1= ()->
        {
            for(int i=10;i<20;i++)
            {
                System.out.println(
                        "Runnable  implementation by lambda Expression" + i);
            }
        };

        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        t.start();
        t1.start();
    }

}