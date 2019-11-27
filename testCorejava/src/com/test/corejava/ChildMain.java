package com.test.corejava;

public class ChildMain extends Parentmain {

    public static void main(String[] args) {
        System.out.println("Child main Static");
        new ChildMain().main(45);
        
    }
    
    public void main(long args) {
        System.out.println("Child main arg Long non-Static");
    }
}
