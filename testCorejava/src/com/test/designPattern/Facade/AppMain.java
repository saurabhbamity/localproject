package com.test.designPattern.Facade;

public class AppMain {

    public static void main(String[] args) {
        
        CreateShapeFacade cf= new CreateShapeFacade();
        cf.createCirCle();
        cf.createRactangle();
        cf.createTringle();

    }

}
