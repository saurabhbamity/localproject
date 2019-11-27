package com.test.executorFramework;

public class EnumuratorThread3 {

    public static void main(String[] args) {
        
        ThreadGroup system= Thread.currentThread().getThreadGroup().getParent();
        Thread[] threadArray= new Thread[system.activeCount()];
        system.enumerate(threadArray);
        for(Thread t:threadArray)
        {
            System.out.println("Thraed running in system thread are : "+t.getName()+"----"+"is daemon thraed : "+t.isDaemon());
        }
                

    }

}
