package com.test.corejava;

import java.util.ArrayList;
import java.util.List;

public class Test {

   public static void main(String args[]) {
      
       
       String grade = "CA";

       switch(grade) {
          case "A" :
             System.out.println("Excellent!"); 
             break;
          case "B" :
          case "CA" :
             System.out.println("Well done");
             break;
          case "D" :
             System.out.println("You passed");
          case "F" :
             System.out.println("Better try again");
             break;
          default :
             System.out.println("Invalid grade");
       }
       System.out.println("Your grade is " + grade);
    
      
      String s1= "hello";
      String s2= "hello";        
      String s3= new String("hello");
      String s4 ="hel";
      int i=7;
      System.out.println("String panga1"+s1==s1);
      System.out.println("String panga1"+s2==s3.intern());
      System.out.println("String panga1"+s2.hashCode());
      System.out.println("String panga1"+s3.intern().hashCode());
      System.out.println("String panga2"+s3.intern()==s4+"lo");
      System.out.println("String panga3"+s2==s4+"lo");
      String str="ACDF:JHGHGGF,GHGHDHF,yuyry";
      String[] abc=str.split("[:,]");
      for (int n=0;n<str.length()-1;n++){
          System.out.println("saurabh "+n);
      System.out.println("saurabh: "+abc[n]);
      }
      
      
   }
   
   public static String ListtoStringCommaSeprated(List<String> listValue) {
       String result = "";

       if (listValue.size() > 0) {
           StringBuilder sb = new StringBuilder();

           for (String s : listValue) {
               sb.append(s).append(",");
           }

           result = sb.deleteCharAt(sb.length() - 1).toString();
       }
       return result;
   }
   
   
}