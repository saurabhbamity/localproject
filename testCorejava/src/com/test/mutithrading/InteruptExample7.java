package com.test.mutithrading;

public class InteruptExample7 {
    
    public static void main(String[] args) {
        
        myThead4 mt4= new myThead4();
        mt4.start();
       
        System.out.println("main ends here");
        
        mt4.interrupt();
        
    }

}

class myThead4 extends Thread{
    
    public void run() 
    {
        for(int i=0;i<10;i++)
        {
            
            System.out.println("lazy Thread count is "+i);
            try{
            Thread.sleep(2000);
            }catch(Exception ex)
            {
                System.out.println("Interuption occoured:->"+ex.getLocalizedMessage());
                ex.printStackTrace();
            }
        }    
    }
}