package com.test.designPattern.template;

public class HouseownerChanchal extends MakeHouseTemplate {

    @Override
    protected void CreateBuilding() {
        System.out.println("Simple house with Expensive kithen");

    }

    @Override
    protected void finishing() {
        System.out.println("all money in Kithen invested");

    }

}
