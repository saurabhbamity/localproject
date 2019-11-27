package com.test.corejava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    
    public static void main(String[] args) {
        
        List<String> StrList= new ArrayList<String>(4);
        StrList.add("1");
        StrList.add("2");
        System.out.println(StrList.hashCode());
        StrList.add("3");
        System.out.println(StrList.hashCode());
        StrList.add("4");
        System.out.println(StrList.hashCode());
        StrList.add("5");
        System.out.println(StrList.size());
        System.out.println(StrList.toString());
        System.out.println(StrList.hashCode());
        
    }

}
