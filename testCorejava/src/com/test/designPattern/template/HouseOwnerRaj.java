package com.test.designPattern.template;

public class HouseOwnerRaj extends MakeHouseTemplate {

    @Override
    protected void CreateBuilding() {
        System.out.println("Craeted Builing with wood and grren garden outside");

    }

    @Override
    protected void finishing() {
        System.out.println("Expensive toilet, window and door are attached on home");

    }

}
