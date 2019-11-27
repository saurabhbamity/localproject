package com.test.designPattern.Abstractfactory;
public class AsiaCarFactory
{
  public static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case SMALL:
      car = new SmallCar(LocationPlace.ASIA);
      break;
 
      case SEDAN:
      car = new SedanCar(LocationPlace.ASIA);
      break;
 
      case LUXURY:
      car = new LuxuryCar(LocationPlace.ASIA);
      break;
 
      default:
      //throw some exception
      break;
    }
    return car;
  }
}