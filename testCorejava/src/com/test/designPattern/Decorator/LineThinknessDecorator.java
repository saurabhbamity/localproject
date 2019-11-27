package com.test.designPattern.Decorator;

public class LineThinknessDecorator extends ShapeDecorator{

    Double thinkness;
    
    public LineThinknessDecorator(Shape shape, Double thinkness){
        super(shape);
        this.thinkness=thinkness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();

    }

    @Override
    public void resize() {
        decoratedShape.resize();

    }

    @Override
    public String description() {
        // TODO Auto-generated method stub
        return decoratedShape.description() + " filled with " + thinkness + " thinkness.";
    }

    @Override
    public boolean isHide() {
        // TODO Auto-generated method stub
        return decoratedShape.isHide();
    }
}
