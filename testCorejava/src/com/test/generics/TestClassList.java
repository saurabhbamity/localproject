package com.test.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestClassList {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>(); 
        numbers.add(1); 
        numbers.add(2); 
        numbers.add(3); 
        System.out.println("ArrayList contains : " + numbers); 
        
        Iterator< Integer> itr=numbers.iterator();
        itr.remove();
        while (itr.hasNext())
        {
            if(itr.next().equals(new Integer("2")))
            {
                itr.remove();
            }
            //itr.next();
        }
        
        System.out.println("ArrayList contains after deletion : " + numbers);
        
    }
    

    
}
