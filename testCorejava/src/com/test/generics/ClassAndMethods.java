package com.test.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassAndMethods<T> {
    
    T obj;
    
    void add(T obj)
    {
        this.obj=obj;
    }

    T get(){
        return obj;
    }
    
    public static < E > void printArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    } 
    
    public static < E > void printList(E elements) {  
        
    }  
    
    public static void main(String[] args) {
        

        ClassAndMethods<Integer> myGenClass= new ClassAndMethods<Integer>();
        myGenClass.add(2);
        System.out.println(myGenClass.get());
        
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };
        List<String> ll= new ArrayList<String>();
        ll.add("abc");
        ll.add("def");
        ll.add("geh");
        ll.add("ijk");
        
        printArray(intArray);
        printArray(charArray);
        //printArray(ll);
        
        
    }

}
