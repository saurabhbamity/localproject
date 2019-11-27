package com.test.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Hello {
    Hello() {
        new Hello();
    }

    public static void main(String[] argvs) {
        //new Hello();
        
        Set<String> sett= new TreeSet<>();
        sett.add("abc");
        //sett.add(null);// not allowed- compilation error
        //sett.add(null);
        
        Set<String> abc= new HashSet<>();
        abc.add(null);// one key allowed
        abc.add("xyz");
        abc.add(null);
        
        Map<String, String> testmap= new HashMap<>();
        testmap.put(null, "first");
        testmap.put("2", "Second");
        testmap.put(null, "third");
        
        List< String> testlist= new LinkedList<>();
        testlist.add("abc");
        testlist.add("efg");
        testlist.get(1);
        
        System.out.println(sett.toString());
        System.out.println(abc.toString());
        System.out.println(testmap.toString());
    }
}

