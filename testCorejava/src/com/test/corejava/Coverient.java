package com.test.corejava;

import java.util.ArrayList;
import java.util.List;

public class Coverient {
    
    public static void main(String[] args) {
        
        List<String> testing1= new ArrayList<String>();
        testing1.add("a");
        testing1.add("s");
        testing1.add("ss");
        List<? extends Object> testing2= testing1;
        List<? extends String> testing3= testing1;
        
        System.out.println("testing"+testing1.toString());
        System.out.println("testing2"+testing2.toString());
        System.out.println("testing3"+testing3.toString());
    }

}
