package com.test.executorFramework;

public class ThreadGroup1 {

    public static void main(String[] args) {
        
        //way to create thread group.
        ThreadGroup tg= new ThreadGroup("Saurabh First ThreadGroup");
        
        //main thread parent , root thread, parent thread
        System.out.println("Thread main Group : "+Thread.currentThread().getThreadGroup().getName());
        System.out.println("Thread main Group parent and root Thread is : "+Thread.currentThread().getThreadGroup().getParent().getName());
        

    }

}
