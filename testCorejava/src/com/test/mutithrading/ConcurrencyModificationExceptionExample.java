package com.test.mutithrading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrencyModificationExceptionExample  implements Runnable{

    public static List<String> list= new ArrayList<>();
    
    public static void main(String[] args) {
        
        list.add("A");
        list.add("B");
        list.add("C");
        Thread t= new Thread(ct);
        t.start();
        
        // code to iterate the ArrayList
        Iterator<String> itr= l.iterator();
        while(itr.hasNext())
        {
            System.out.println("element in "+itr.next());
        }
        
    }
    
    public void run() {

        try {
            Thread.sleep(100);
            list.add("D");
        } catch (InterruptedException ie) {
            System.out.println("Interruption Exception because of Thread"
                    + Thread.currentThread().getName());
        }
    }
}




