package com.test.designPattern.Facade2;

public class VegRestaurant implements Hotel {

    @Override
    public Menus getMenus() {
        
        VegMenus vm= new  VegMenus();
        return vm;
    }

}
