package com.test.designPattern.factory;

public class Server extends Computer{

    
    String cpu;
    String hdd;
    String processor;

    public Server(String cpu, String hdd, String procssor) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.processor = procssor;
    }
    
    @Override
    public String getCpu() {
        // TODO Auto-generated method stub
       return this.cpu;
    }

    @Override
    public String getHdd() {
        // TODO Auto-generated method stub
        return this.hdd;
    }

    @Override
    public String getProcessor() {
        // TODO Auto-generated method stub
        return this.processor;
    }

}
