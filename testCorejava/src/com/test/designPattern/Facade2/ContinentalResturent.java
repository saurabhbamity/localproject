package com.test.designPattern.Facade2;

public class ContinentalResturent implements Hotel {

    @Override
    public Menus getMenus() {
        
        ContinantalMenus cm= new  ContinantalMenus();
        return cm;
    }
}
