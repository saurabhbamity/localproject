package com.test.designPattern.Decorator;

public class LineColorDecorator extends ShapeDecorator {
    
    Color color;
    
    public LineColorDecorator(Shape shape, Color color){
        super(shape);
        this.color=color;
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
        return decoratedShape.description() + " filled with " + color + " color.";
    }

    @Override
    public boolean isHide() {
        // TODO Auto-generated method stub
        return decoratedShape.isHide();
    }

}
