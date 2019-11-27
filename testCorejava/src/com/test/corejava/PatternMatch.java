package com.test.corejava;

import java.util.regex.Pattern;

public class PatternMatch {
    
    public static void main(String[] args) {
        String s="\".*\"";
        String s1="(^[a-zA-Z0-9\\,\\-\\'\\{\\}\\(\\)\\:\\;\\[\\]\".*\"\\&\\p{InArabic} ]*)";
        String S3="يجب}-يجب(يجب)يجب'يجبيجب:يجب;يجب,يجب\".يجبيجبيجب:يجب;يجب'يجب يجب يجب";
        System.out.println(s);
        System.out.println(s1+"&&&&&&& :"+S3);
        System.out.println(Pattern.matches("(^[a-zA-Z0-9\\.\\,\\-\\'\\(\\)\\:\\;\\{\\}\"\\p{InArabic} ]*)", S3));
        
        
   }

}
