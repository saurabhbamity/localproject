package com.test.designPattern.factory;

public class MainApp {
    
    public static void main(String[] args) {
        
        CompFactory cf= new CompFactory();
        cf.getInstance("server");
        cf.getInstance("pc");
    }

}
