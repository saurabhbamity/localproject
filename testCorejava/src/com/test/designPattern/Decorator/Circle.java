package com.test.designPattern.Decorator;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw Circle");

    }

    @Override
    public void resize() {
        System.out.println("draw Circle");

    }

    @Override
    public String description() {
        return "Description Circle";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
