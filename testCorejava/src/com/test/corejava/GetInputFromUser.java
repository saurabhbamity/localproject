package com.test.corejava;

import java.util.Scanner;

class GetInputFromUser
{
    static ThreadLocal<Integer> tl = new ThreadLocal<Integer>();
    
    
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     
      //System.out.println("Enter a string");
     int i=0;
      while(i < 10)
      {
          System.out.println(" i value="+i);
          System.out.println("Enter a Number");
           int j = in.nextInt();
           i=i+j;
           System.out.println("value after addition "+i);
      }
      
 
        
   }
}