package com.test.miscellaneous;

//class to test, first if condition will be pass , no other else 
//or else if condition will be executed test program.
public class TestIfElseIf {
    
   public static void main(String[] args) {
    
       int i=12;
       
       if (i>2)
       {
           System.out.println("grater than 2");
       }else if(i>10){
           System.out.println("greater then 10");
       }else if(i==12)
       {
           System.out.println("i equal to 12");
       }else{
           System.out.println("i greater than 12");
       }
       
       // first if condition will be pass , no other else or else if condition will be executed. 
}

}
