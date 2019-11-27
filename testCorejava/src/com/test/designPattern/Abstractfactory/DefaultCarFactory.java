package com.test.designPattern.Abstractfactory;
public class DefaultCarFactory
{
  public static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case SMALL:
      car = new SmallCar(LocationPlace.DEFAULT);
      break;
 
      case SEDAN:
      car = new SedanCar(LocationPlace.DEFAULT);
      break;
 
      case LUXURY:
      car = new LuxuryCar(LocationPlace.DEFAULT);
      break;
 
      default:
      //throw some exception
      break;
    }
    return car;
  }
}