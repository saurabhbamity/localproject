package com.test.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testUnmodifiableCollections {
    
    
    public static void main(String[] args) {
        
        
        List<String> list= new ArrayList<String>();
        list.add("abc");
        list.add("xyz");
        list.add("lmn");
        
        list=Collections.unmodifiableList(list);
        
        //list.add("kkk");
        System.out.println(list.toString());
        
        
        
    }

}
