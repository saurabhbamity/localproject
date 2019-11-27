package com.test.springcore.Collection;

import java.util.List;

public class Tringle {
    
    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    private List<Point> points;

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
