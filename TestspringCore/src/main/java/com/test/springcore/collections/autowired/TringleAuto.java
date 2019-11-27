package com.test.springcore.collections.autowired;

import java.util.List;


public class TringleAuto {
    
   private Point pointAA;
   private Point pointBB;
   private Point pointCC;
   
public Point getPointAA() {
    return pointAA;
}
public void setPointAA(Point pointAA) {
    this.pointAA = pointAA;
}
public Point getPointBB() {
    return pointBB;
}
public void setPointBB(Point pointBB) {
    this.pointBB = pointBB;
}
public Point getPointCC() {
    return pointCC;
}
public void setPointCC(Point pointCC) {
    this.pointCC = pointCC;
}
   


}

class Point
{
    private int xcordinate;
    private int ycordinate;
    
    public int getXcordinate() {
        return xcordinate;
    }
    public void setXcordinate(int xcordinate) {
        this.xcordinate = xcordinate;
    }
    public int getYcordinate() {
        return ycordinate;
    }
    public void setYcordinate(int ycordinate) {
        this.ycordinate = ycordinate;
    }
}
