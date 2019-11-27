package com.test.designPattern.Abstractfactory;
public class MainAbstactFactoryPattern
{
  public static void main(String[] args)
  {
    System.out.println(CarFactory.buildCar(CarType.SMALL, LocationPlace.ASIA));
    System.out.println(CarFactory.buildCar(CarType.SEDAN,LocationPlace.USA));
    System.out.println(CarFactory.buildCar(CarType.LUXURY, LocationPlace.DEFAULT));
  }
}