package com.test.designPattern.Facade2;

public class NonVegMenus implements Menus {

    @Override
    public String getEatableItemList() {
        
        return "chikken, tadoor, soup";
    }

}
