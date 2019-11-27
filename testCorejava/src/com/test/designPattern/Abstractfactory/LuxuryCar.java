package com.test.designPattern.Abstractfactory;
class LuxuryCar extends Car
{
  public LuxuryCar(LocationPlace locationPlace)
  {
    super(CarType.LUXURY, locationPlace);
    construct();
  }
 
  @Override
  protected void construct() {
    System.out.println("Building luxury car");
    //add accessories
  }
}

class SmallCar extends Car {
    
    SmallCar(LocationPlace locationPlace) {
        super(CarType.SMALL, locationPlace);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}


class SedanCar extends Car {
    
    SedanCar(LocationPlace locationPlace) {
        super(CarType.SEDAN, locationPlace);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }
}
