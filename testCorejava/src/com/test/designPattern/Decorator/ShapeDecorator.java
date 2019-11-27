package com.test.designPattern.Decorator;


public abstract class ShapeDecorator implements Shape {

      protected Shape decoratedShape;

      public ShapeDecorator(Shape decoratedShape) {

            super();

            this.decoratedShape = decoratedShape;

      }
}