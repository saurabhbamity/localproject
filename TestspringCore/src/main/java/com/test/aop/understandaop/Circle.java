package com.test.aop.understandaop;



public class Circle {

   private String name;
   
   private int radious;

    public int getRadious() {
    return radious;
}

public void setRadious(int radious) {
    this.radious = radious;
    //throw(new RuntimeException());
}

    public String getName() {
        System.out.println("method Circle: getname");
        return name;
        
    }
    
    public void setName(String name) {
        this.name = name;
        System.out.println("method Circle: setname");
       
    }
   

}
