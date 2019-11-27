package com.test.designPattern.Decorator;

public class Rectangle implements Shape {

    @Override
    public void draw() {
       System.out.println("draw Rectangle");

    }

    @Override
    public void resize() {
        System.out.println("resizing Rectangle");

    }

    @Override
    public String description() {
        return "Ractangle Description";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
