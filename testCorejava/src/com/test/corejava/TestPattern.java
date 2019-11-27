package com.test.corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
    
    public static void main(String[] args)  {

        String s = "GFHGDHF,HJHFH,";

        System.out.println(s.matches("[\\w,-]{3,10}+*"));
       
       
    }

}
