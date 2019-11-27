package com.test.designPattern.factory;

public abstract  class Computer {
    
    public abstract String getCpu();
    public abstract String getHdd();
    public abstract String getProcessor();
    
    @Override
    public String toString(){
        return "cpu: "+this.getCpu()+", Hard Disk: "+getHdd()+", processor: "+getProcessor();
    }    
}
