package com.test.designPattern.Facade2;

public class HotelKeeper {
    
    public String getVegMenu() 
    { 
        VegRestaurant v = new VegRestaurant(); 
        VegMenus vegMenu = (VegMenus)v.getMenus(); 
        return vegMenu.getEatableItemList(); 
    } 
    
    public String getNonVegMenu() 
    { 
        NonVegRestaurant v = new NonVegRestaurant(); 
        NonVegMenus nonvegMenu = (NonVegMenus)v.getMenus(); 
        return nonvegMenu.getEatableItemList(); 
    } 
    
    public String getContinantalMenu() 
    { 
        ContinentalResturent v = new ContinentalResturent(); 
        ContinantalMenus contMenu = (ContinantalMenus)v.getMenus(); 
        return contMenu.getEatableItemList(); 
    }
}
