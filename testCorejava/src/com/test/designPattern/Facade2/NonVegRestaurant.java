package com.test.designPattern.Facade2;

public class NonVegRestaurant implements Hotel {

    @Override
    public Menus getMenus() {
        
        NonVegMenus nm= new  NonVegMenus();
        return nm;
    }

}
