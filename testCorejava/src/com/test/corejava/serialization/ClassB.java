package com.test.corejava.serialization;

import java.io.Serializable;

public class ClassB extends ClassA implements Serializable {
    
    private int serialNumber;
    private String bodygaurdName;
    private boolean Depandent;
    
    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getBodygaurdName() {
        return bodygaurdName;
    }
    public void setBodygaurdName(String bodygaurdName) {
        this.bodygaurdName = bodygaurdName;
    }
    public boolean isDepandent() {
        return Depandent;
    }
    public void setDepandent(boolean depandent) {
        Depandent = depandent;
    }
    

}
