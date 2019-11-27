package com.test.designPattern.Facade;

/*
 * Facade objective is to provide simplified version of class that does the complete task of user prospective.
 * Facade provide a common interface to the subsystem that can provide the one class to do all the task for user.
 * Facade and Adaptors are wrapping many interfaces but intension of Facade is simplification and Adaptors is to 
 * provide the inteface to convert one system to another system input.
 */
public class CreateShapeFacade {
    
    private Shape circle;
    private Shape ractangle;
    private Shape tringle;
    
    public CreateShapeFacade(){
        circle= new Circle();
        ractangle= new Ractangle();
        tringle= new Tringle();
   }
    
    public void createRactangle(){
         ractangle.createShape();
    }
    
    public void createTringle(){
        tringle.createShape();
    }

    public void createCirCle(){
        circle.createShape();
    }
}
