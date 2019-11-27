package com.test.corejava;

import java.util.ArrayList;

public class Covarient {
    
    public static void main(String[] args) {
        
        Parent p= new child();//covarient
        p.pgo();
        
       // ArrayList<Parent> parentList= new ArrayList<child>();//not covarient
        //generics are not covarient
        ArrayList<Parent> parentList= new ArrayList<Parent>();
        ArrayList<? extends Parent> parentList1= new ArrayList<Parent>();
        ArrayList<? super Parent> parentList2= new ArrayList<Object>();
        
        //Arrays are not covarient
        //Parent[] pArray= new child[7];
        Parent[] pArray= new Parent[7];
        
        
        
    }

}

class Parent{ 
    public void pgo(){
        System.out.println("parent");
    }
}

class child extends Parent{
    
    @Override
    public void pgo(){
        System.out.println("parent overrided");
    }
    
    public void cgo(){
        System.out.println("child");
    }
}