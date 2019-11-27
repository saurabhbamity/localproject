package com.test.corejava;

public class PassByValue {
    
    public static void main(String[] args) {
        
        Color red= new Color();
        red.setColorId(1);
        red.setColorName("red");
        
        Color blue= new Color();
        blue.setColorId(2);
        blue.setColorName("blue");
        
        swapColor(red, blue);
        System.out.println("red Hash"+red.hashCode());
        System.out.println("blue Hash"+blue.hashCode());
        
        System.out.println("red"+red.getColorName());
        System.out.println("red"+red.getColorId());
        System.out.println("blue"+blue.getColorId());
        System.out.println("blue"+blue.getColorName());
        
        System.out.println("red Hash"+red.hashCode());
        System.out.println("blue Hash"+blue.hashCode());
        
        ChangeBluetoyellow(blue);
        
        System.out.println("blue"+blue.getColorId());
        System.out.println("blue"+blue.getColorName());
    }

    private static void ChangeBluetoyellow(Color blue) {
        blue.setColorId(3);
        blue.setColorName("yellow");
    }

    private static void swapColor(Color red, Color blue) {
        
        Color temp=red;
        red=blue;
        blue=temp;
        
    }

}


class Color{
    int colorId;
    String colorName;
    
    public int getColorId() {
        return colorId;
    }
    public void setColorId(int colorId) {
        this.colorId = colorId;
    }
    public String getColorName() {
        return colorName;
    }
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}