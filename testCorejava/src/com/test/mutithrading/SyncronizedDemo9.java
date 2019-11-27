package com.test.mutithrading;

/*
 * Example to show the static synchronized behavior, class level lock on synchronization method.
 * This Example will illustrate, that if you create any number of instances , if accessing static syncronized
 * block, class level lock will work and any number of instances will be able to achieve synronization.
 */
public class SyncronizedDemo9 {
    
    public static void main(String[] args) {
        
        Display d= new Display();
        DisplayHelper dh= new DisplayHelper(d, "youraj");
        DisplayHelper dh2= new DisplayHelper(d, "Dhoni");
        
        dh.start();
        dh2.start();
        
        //playing two object of shared Object
        
        Display d1= new Display();
        Display d2= new Display();
        // this will give us regular output due to class level lock is been assigned.
        //when wish is static then lock will be class level, that is why regular output will be printed.
        //no matter how many instances have been created, though static method class level locks, only 
        //any one instance of that class will take a lock and will complete the processing till end.
        DisplayHelper dhfirst= new DisplayHelper(d1, "Sachin");
        DisplayHelper dhSecond= new DisplayHelper(d2, "Sehwaj");
        
        dhfirst.start();
        dhSecond.start();
        
        
    }

}


class Display
{
    public static synchronized void wish(String name){
        
        for(int i=0;i<10;i++)
        {
            System.out.println("name is+ "+name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class DisplayHelper extends Thread 
{
    Display display;
    String name;
    public DisplayHelper(Display d, String str)
    {
        display=d;
        name=str;
    }
    
    public void run()
    {
        display.wish(name);
    }
}