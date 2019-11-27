package com.test.springcore.prototypesingleton;

public class Human {
    
    private String Name;
    
    private Organs organ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Organs getOrgan() {
        return organ;
    }

    public void setOrgan(Organs organ) {
        this.organ = organ;
    }

}


class Organs{
    
    private String name;
    
    private int agetolive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgetolive() {
        return agetolive;
    }

    public void setAgetolive(int agetolive) {
        this.agetolive = agetolive;
    }
}
