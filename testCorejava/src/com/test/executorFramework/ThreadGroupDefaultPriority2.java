package com.test.executorFramework;

public class ThreadGroupDefaultPriority2 implements Runnable {

    
    @Override
    public void run() {
        try{
            
            Thread.sleep(3000);
        }catch(Exception ex)
        {
            System.out.println("Exception"+ex);
        }
        
    }
    
    public static void main(String[] args) {
        
        try{
        ThreadGroup pg= new ThreadGroup("saurabh Thread Group Parent");
        ThreadGroup cg= new ThreadGroup(pg, "saurabh Thread Group Child");
        Thread t1= new Thread(pg, "t1saurabh");
        Thread t2= new Thread(pg, "t2saurabh");
        t1.start();
        t2.start();
        System.out.println("Default Priority thread goup is: "+pg.getMaxPriority());
        System.out.println("Default Priority thread t1 is: "+t1.getPriority());
        System.out.println("Default Priority thread t2 is: "+t2.getPriority());
        pg.list();
        Thread.sleep(10000);
        pg.setMaxPriority(3);
        Thread t3= new Thread(pg, "t3saurabh");
        System.out.println("Priority thread goup after update is: "+pg.getMaxPriority());
        System.out.println("Default Priority thread t3 is: "+t3.getPriority());
        }catch(Exception ex)
        {
            System.out.println("exception"+ex);
        }
        
    }

   

}
