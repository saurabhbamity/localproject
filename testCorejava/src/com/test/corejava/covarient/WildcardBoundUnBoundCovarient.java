package com.test.corejava.covarient;

import java.util.ArrayList;
import java.util.List;


public class WildcardBoundUnBoundCovarient {

    
    public static void main(String[] args) {
        
        List<Integer> intlist= new ArrayList<Integer>();
        intlist.add(5);
        intlist.add(15);
        intlist.add(25);
        
        addListNumber(intlist);
        
        List<Parent> parentlist= new ArrayList<Parent>();
        parentlist.add(new Parent());
        parentlist.add(new Parent());
        parentlist.add(new Parent());
        
        manupulate(parentlist);
        
        //covarient Exaple , here List<Object> will accept only List<Object> not
        //list<String>, which is compile time error.
        List<String> Strlist= new ArrayList<String>();
        Strlist.add("a");
        //covariant(Strlist);// to make it work , we have to change it to covariant(List<? extends Object> paramString)
        
        
    }
    
    
    //Example to lower bound
     static List<? extends Object> addListNumber(List<? extends Number> numberlist){
         
         List list= new ArrayList<Integer>();
         list.add(new Integer("5"));
         return list;
     }
     
   //Example to upper bound
     static void manupulate(List<? super child> parentInstance){
         
         ((Parent)parentInstance).m1();
     }
     
     //example of covarient
     static void covariant(List<Object> paramString){
         
         System.out.println("value sent is :"+paramString.toString());
     }
     
     
     class Parent{
         
         
         protected void m1(){System.out.println("parent.m1");}
         
         private void m2(){System.out.println("parent.m2");}
         
         void m3(){System.out.println("parent.m3");}
         
     }

     class child extends Parent{
         
         public void m1(){System.out.println("Child.m1");}
         
         protected void m2(){System.out.println("Child.m2");}
         
         void m3(){System.out.println("Child.m3");
         }
}


