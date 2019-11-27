package com.test.corejava;

import java.util.ArrayList;
import java.util.List;

public class testing {

    public static void main(String[] args) {
        String s = "known";
        System.out.println("Before ->"+s.hashCode()+" ->value="+s);
        s = getChangedStringValue(s);
        System.out.println("After1 ->"+s.hashCode()+" ->value="+s);
        getOtherStringBack(s);
        System.out.println("After2 ->"+s.hashCode()+" ->value="+s);
        
        StaticMethod();
        
        String s1= "hello";
        String s2= "hello";        
        String s3= new String("hello");
        String s4 ="hel";
        int i=7; 
        
        
        System.out.println("indexOf value"+"abvgftkgjjhf".indexOf("("));
        System.out.println("s4 "+(s1 == "hello"));
        System.out.println((s3.intern() == s1) +" Proved");
        
        System.out.println("asdfsadfsad");
        System.out.println(i==7);
        System.out.println("String panga1"+ s1==s2);
        System.out.println("asdfsadfsad");
        System.out.println("String panga2"+s2.hashCode());
        System.out.println("String panga3"+s1.hashCode());
        System.out.println("String panga4"+(s3.intern()==(s4 +"lo")));
        System.out.println("String panga5"+(s2==s4+"lo"));
        
        List< Object> abc= new ArrayList<>();
        abc.add("abc");
        Long l=Long.parseLong("123");
        abc.add(l);
        System.out.println(abc.toString());
        
    }
    private static String getChangedStringValue(String s) {
        System.out.println("getChangedStringValue before ->"+s.hashCode() +" ->value="+s);
        s=s+"outside";
        System.out.println("getChangedStringValue after ->"+s.hashCode() +" ->value="+s);
        return s;
    }
    private static void getOtherStringBack(String str){
        System.out.println("inside method beore ->"+str.hashCode() +" ->value="+str);
        str= "method";
        System.out.println("inside method after ->"+str.hashCode() +" ->value="+str);
    }
    
    private  String nonStaticMethod()
    {
        return "A";
    }
    
    private static void StaticMethod()
    {
        System.out.println(new testing().nonStaticMethod());
    }

}
