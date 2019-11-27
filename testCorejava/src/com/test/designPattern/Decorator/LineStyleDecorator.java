package com.test.designPattern.Decorator;

public class LineStyleDecorator extends ShapeDecorator {
    
    LineStyle style;
    
    public LineStyleDecorator(Shape shape, LineStyle style){
        super(shape);
        this.style=style;
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
        return decoratedShape.description() + " filled with " + style + " LineStyle.";
    }

    @Override
    public boolean isHide() {
        // TODO Auto-generated method stub
        return decoratedShape.isHide();
    }


}
