package com.test.designPattern.Abstractfactory;

public abstract class Car {
    
    public Car(CarType model, LocationPlace location){
      this.model = model;
      this.locationPlace = location;
    }
   
    protected abstract void construct();
   
    private CarType model = null;
    private LocationPlace locationPlace = null;
   
    //getters and setters
   
    @Override
    public String toString() {
      return "Model- "+model + " built in "+locationPlace;
    }
  }
