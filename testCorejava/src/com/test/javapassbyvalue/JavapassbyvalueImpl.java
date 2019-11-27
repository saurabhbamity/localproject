package com.test.javapassbyvalue;

public class JavapassbyvalueImpl {
    
    
    public static void main(String[] args) {

        Balloon red = new Balloon("Red"); //memory reference 50
        Balloon blue = new Balloon("Blue"); //memory reference 100
        
        System.out.println("before swap");
        System.out.println("red color="+red.getColor());
        System.out.println("blue color="+blue.getColor());
        swap(red, blue);
        System.out.println("after swap");
        System.out.println("red color="+red.getColor());
        System.out.println("blue color="+blue.getColor());
        
        System.out.println("before call foo: blue color="+blue.getColor());
        foo(blue);
        System.out.println("blue color="+blue.getColor());
        
    }

    private static void foo(Balloon balloon) { //baloon=100
        balloon.setColor("Red"); //baloon=100
        System.out.println("inside foo: baloon color ="+balloon.getColor());
        balloon = new Balloon("Green"); //baloon=200
        balloon.setColor("Blue"); //baloon = 200
        System.out.println("inside foo:Created New Baloon:  baloon color ="+balloon.getColor());
    }

    //Generic swap method
    public static void swap(Object o1, Object o2){
        Object temp = o1;
        o1=o2;
        o2=temp;
    }

}
