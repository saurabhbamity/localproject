package com.test.java8.lambda.function;

public class DimandProblemDefaultMethod2 implements Left, Right{
    
    /*public void m1(){
        //System.out.println("DimandProblemDefaultMethod method ");
        //Left.super.m1();
        Right.super.m1();
    }*/
    
    public static void main(String[] args) {
        
        DimandProblemDefaultMethod2 dp= new DimandProblemDefaultMethod2();
        dp.m1();
    }

   
    @Override
    public void m1() {
        // TODO Auto-generated method stub
        Left.super.m1();
    }

}
