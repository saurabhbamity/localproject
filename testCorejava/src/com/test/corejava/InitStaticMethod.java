package com.test.corejava;
public class InitStaticMethod extends parent1{
    
    {
        System.out.println("init InitStaticMethod");
    }
    static
    {
        System.out.println("static InitStaticMethod");
    }
    public InitStaticMethod()
    {
        System.out.println("Const InitStaticMethod");
    }
    
    public  static void main(String[] args) {
        
        new InitStaticMethod();
        new InitStaticMethod();
        
    }

}