package com.test.designPattern.template;

/*
 * Template Method is a behavioral design pattern. it define the use to provide correct sequence of Execution 
 * to get the job done, user is responsible to do the few user specific work with in servlet user only override 
 * the doget and do post method.rest all are taken care of the framework.   
 */
public abstract class MakeHouseTemplate {

    
    public void createHouse(){
        createBluePrint();
        createFoundation();
        CreateBuilding();
        finishing();
        pussitions();
    }
    
    protected  void createBluePrint(){
        System.out.println("blue print is craeted by engineer in colony, job is done");
    }
    protected  void createFoundation(){
        System.out.println("some workers are created the foundations as planned, job is done");
    }
    protected abstract void CreateBuilding();
    protected abstract void finishing();
    protected  void pussitions(){
        System.out.println("home registory is completed and will the hand over to the owner, job is done");
    }
    
}
