package com.test.designPattern.Abstractfactory;
public class CarFactory
{
  private CarFactory() {
    //Prevent instantiation
  }
 
  
  //there are two parameter, location param identify which region/country car factory is to be called.
  // on business scenario this can be identified using locale in cookies. and call that country carFactory method.
  //now build car is called using carType , that will work as the Factory Design pattern.
  public static Car buildCar(CarType type, LocationPlace location)
  {
    Car car = null;
    LocationPlace locationPlace = location; 
    
    switch(location)
    {
      case USA:
        car = USACarFactory.buildCar(type);
        break;
      case ASIA:
        car = AsiaCarFactory.buildCar(type);
        break;
      default:
        car = DefaultCarFactory.buildCar(type);
    }
  return car;
  }
}