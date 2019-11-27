package com.test.overrideConcepts;

import sun.applet.Main;

public class AccessModifierbroader extends Parent{
    
    
    public static void main(String[] args) {
        
        Parent p1= new Parent();
        p1.m1();
        p1.m3();
        //m2 is private so cannt access.
        //p1.m2();
        
        child c1= new child();
        c1.m1();
        c1.m2();
        c1.m3();
        
    }

}

class Parent{
    
    
    protected void m1(){System.out.println("parent.m1");}
    
    private void m2(){System.out.println("parent.m2");}
    
    void m3(){System.out.println("parent.m3");}
    
}

class child extends Parent{
    
    public void m1(){System.out.println("Child.m1");}
    
    protected void m2(){System.out.println("Child.m2");}
    
    void m3(){System.out.println("Child.m3");
    }
    
}
