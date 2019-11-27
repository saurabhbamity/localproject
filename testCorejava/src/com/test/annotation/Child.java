package com.test.annotation;


class parent{
    
    public static int add(){
        System.out.println("parent static method");
        return 0;
    } 
    
    /*public*/ private int retunsomething(){
        System.out.println("parent retunsomething");
        return 0;
    } 
}
public class Child extends parent{
    
    public static int add(){
        System.out.println("Child static method");
        return 0;
    } 
    
    
    public  String retunsomething(){
        System.out.println("Child retunsomething");
        return "testing";
    } 
    
    public static void main(String[] args) {
        
        parent p= new Child();
        p.add();
        
        parent p1= new parent();
        //p1.retunsomething();
        
        Child c= new Child();
        c.retunsomething();
        c.add();
        
        
        
    }

}
