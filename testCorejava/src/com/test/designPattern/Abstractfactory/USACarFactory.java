package com.test.designPattern.Abstractfactory;
public class USACarFactory
{
  public static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case SMALL:
      car = new SmallCar(LocationPlace.USA);
      break;
 
      case SEDAN:
      car = new SedanCar(LocationPlace.USA);
      break;
 
      case LUXURY:
      car = new LuxuryCar(LocationPlace.USA);
      break;
 
      default:
      //throw some exception
      break;
    }
  return car;
  }
}