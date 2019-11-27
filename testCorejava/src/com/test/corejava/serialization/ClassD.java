package com.test.corejava.serialization;

import java.io.Serializable;

public class ClassD implements Serializable {
    
    /**
     * manually defined UID
     */
    private static final long serialVersionUID = 576747545774765L;
    
    private int serialNumber;
    private String bodygaurdName;
    private boolean Depandent;
    private ClassC objectC= new ClassC();
    
    public ClassC getObjectC() {
        return objectC;
    }
    public void setObjectC(ClassC objectC) {
        this.objectC = objectC;
    }
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