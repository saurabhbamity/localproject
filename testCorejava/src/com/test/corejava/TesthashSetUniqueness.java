package com.test.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TesthashSetUniqueness {
    
    public static void main(String[] args) {
        
        Set<Object> hashu = new HashSet<Object>();
        hashu.add("saurabh");
        hashu.add("bhardwaj");
        System.out.println(hashu.add("saurabh"));
        System.out.println(hashu.add("sharma"));
        
        System.out.println("\n map output\n\n");
        Map<String, Object> mappu= new HashMap<String, Object>();
        mappu.put("saurabh", new Object());
        mappu.put("bhardwaj", new Object());
        System.out.println(mappu.put("saurabh", new Object()));
        System.out.println(mappu.put("sharma", new Object()));
    }

}
