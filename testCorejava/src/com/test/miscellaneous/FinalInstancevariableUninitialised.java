package com.test.miscellaneous;

public class FinalInstancevariableUninitialised {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

abstract class FinalInstancetest{
    //user will have to assign value even the class is abstract.
    final int i;
    
    FinalInstancetest(int interger)
    {
        i=interger;
    }
    
    public int myMethod(){
        return i;
    }
    
} 
