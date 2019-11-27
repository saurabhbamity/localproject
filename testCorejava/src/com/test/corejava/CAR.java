package com.test.corejava;

public class CAR extends Vehicle {

    CAR()
    {
        this("abc");
       System.out.println("this is defaut constructor");
    }
    
    CAR(String str)
    {
        System.out.println("this is parameterize constructor");
    }
    
    static {
        //CAR car= new CAR();
        System.out.println("this is static block");
    }
    
    /*public static void main(String[] args) {
        
       CAR car= new CAR();
    }*/
}
