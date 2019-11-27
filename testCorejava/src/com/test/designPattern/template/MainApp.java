package com.test.designPattern.template;

public class MainApp {
    
    public static void main(String[] args) {

        MakeHouseTemplate chanchalhouse= new HouseownerChanchal();
        MakeHouseTemplate rajneeshhouse= new HouseOwnerRaj();
        chanchalhouse.createHouse();
        System.out.println("************************************\n\n");
        rajneeshhouse.createHouse();
    }
    
    
    

}
