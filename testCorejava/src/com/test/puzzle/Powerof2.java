package com.test.puzzle;

public class Powerof2 {
    
    public static void main(String[] args) {
        System.out.println(powerof2bestMethod(15));
        System.out.println(powerof2myMethod(1000));
    }

    static boolean powerof2bestMethod(int n){
        
        int shouldzero=n &(n-1);
        if(shouldzero==0){
        return true;
        }
        return false;
    }
    
    static boolean powerof2myMethod(int n){
        
        if(n==0)
        {
            System.out.println("zero is not a power of 2 number");
            return false;
        }
        if(n<0)
        {
            return false;
        }
        while(n>0)
        {
            System.out.println("now number is n= "+n+" and n%2 is : "+n%2+"and n/2 is :"+n/2);
            if(n==2){
                return true;
                
            }else if(n%2==0)
            {
                n=n/2;
                continue;
            }else
            {
                return false;
            }
        }
        return false;
    }

}
