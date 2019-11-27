package com.test.miscellaneous;

public class checkedExceptionthrowinHirarchy {

    
    public static void main(String[] args) {
        
        A a= new A();
        a.methodA();

    }

}

class A{
    
    public void methodA()
    {
        B b= new B();
        b.methodB();
        System.err.println("method A");
        
    }
    
}

class B{
    
    public void methodB()
    {
        C c= new C();
        c.methodC();
        System.err.println("method B");
        
    }
    
}

class C{

    public void methodC()throws NullPointerException
    {
        throw new NullPointerException();
    }
}