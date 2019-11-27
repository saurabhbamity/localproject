package com.test.corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomArraylist<E> extends ArrayList<E>{
    
    @Override
    public boolean add(E e)  {
    
        if(e instanceof String || e instanceof Float|| e instanceof Integer){
            super.add(e);
            return true;
        }else{
            try{
            throw new MyArrayListTypeNotSupportedException("Type is not supported");
            }catch(Exception ex)
            {
                System.out.println("Exception"+ex);
            }
            return false;
        }
        
    }
    @Override
    public void add(int index, E e) {
        
        if(e instanceof String || e instanceof Float|| e instanceof Integer){
            super.add(index, e);
            
        }else{
            try{
            throw new MyArrayListTypeNotSupportedException("Type is not supported");
            }catch(Exception ex)
            {
                System.out.println("Exception"+ex);
            }
            
        }
    }
    

    public static void main(String[] args) {
        
        CustomArraylist<Integer> customArrayListInt= new CustomArraylist<>();
        customArrayListInt.add(new Integer(5));
        System.out.println("Integer value" +customArrayListInt.toString());
        CustomArraylist<Double> customArrayListDouble= new CustomArraylist<>();
        customArrayListDouble.add(0, new Double(8));
        List<Integer> ll= new ArrayList<>();
        ll.add(1);
        ll.add(2);
        
        List<String> ll2= new ArrayList<>();
        ll2.add("1");
        ll2.add("2");
        
        customArrayListInt.addAll(ll);
        System.out.println("Integer value" +customArrayListInt.toString());
        //customArrayListInt.addAll(ll2);
        
    }
}


class MyArrayListTypeNotSupportedException extends Exception{
    
    public MyArrayListTypeNotSupportedException(String msg){
    super(msg);
    }
    
}