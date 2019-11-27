package com.test.mutithrading;

/*
 * Example to show when two syn method of same class get the lock object, then the second thread get the 
 * chance when first thread is completed, it is because the both methods are taking lock on same object.
 */
public class SyncronizedDemo10 {
    
    public static void main(String[] args) {
        
        //both Thread are getting the same object, so the print char and then numbers  are possible.
        Display1 d= new Display1();
        MyThreadN mtn= new MyThreadN(d);
        MyThreadc mtc= new MyThreadc(d);
        
        //mtc.start();
        //mtn.start();
        
        // if user passes two diffirent object, so syncronization is not possible.
        
        Display1 d2= new Display1();
        Display1 d3= new Display1();
        MyThreadN mtn1= new MyThreadN(d2);
        MyThreadc mtc1= new MyThreadc(d3);
        System.out.println("***************************************************************************");
        mtc1.start();
        mtn1.start();
    }

}

class Display1
{
    public  synchronized void displaynumber(){
        
        for(int i=0;i<10;i++)
        {
            System.out.println("number  is+ "+i);
            try
            {
                Thread.sleep(500);
            }catch(Exception ex)
            {
                System.out.println("abc"+ex);
            }
            
        }
    }

    public synchronized void displaycharactors(){
        
        for(int i=65;i<76;i++)
        {
            System.out.println("char is+ "+(char)i);
            try
            {
                Thread.sleep(500);
            }catch(Exception ex)
            {
                System.out.println("abc"+ex);
            }
        }
    }
}

class MyThreadN extends Thread
{
    Display1 d;
    
    
    public MyThreadN(Display1 d)
    {
        this.d=d;
    }
    
    @Override
    public void run(){
        d.displaynumber();
    }
}

class MyThreadc extends Thread
{
    Display1 d;
    
    
    public MyThreadc(Display1 d)
    {
        this.d=d;
    }
    
    @Override
    public void run(){
        d.displaycharactors();
    }
}