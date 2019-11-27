package com.test.corejava;

public class ChildMethodOverriddingOverloading extends TESTMethodOverriddingOverloading {
    
    int i;
    public CAR getVehicleName(String name){
        int z=0;
        System.out.println("Name"+name);
        int j=new ChildMethodOverriddingOverloading().i;
        System.out.println("j value"+j+"Z value"+z);
        return new CAR();
    }

}
