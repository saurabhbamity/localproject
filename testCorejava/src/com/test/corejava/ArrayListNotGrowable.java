package com.test.corejava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNotGrowable {

    public static void main(String[] args) {
        
        List<String> al= new ArrayList<String>(10);
        al.add(10,"ten");
        for(int i=1; i<20;i++)
        {
            System.out.println("iteration for "+i);
            al.add("i="+i);
        }
        
        System.out.println("added elements are "+al.toString());

    }

}
