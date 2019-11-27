package com.test.corejava;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class JoinTest {
    
    public static void main(String[] args) {
        
        List<String> abc = new ArrayList<String>();
        abc.add("A");
        abc.add("B");
        abc.add("C");

        System.out.println(StringUtils.join(abc, ","));
        
        StringBuilder rString = new StringBuilder();
        String sep = ", ";
        for (String operatorTypeElement : abc) {
            rString.append(sep).append(operatorTypeElement);
        }

        System.out.println("my logic: -> "+rString.substring(1));  
    }

}
