package com.test.designPattern.factory;

public class PC extends Computer {

    String cpu;
    String hdd;
    String processor;

    public PC(String cpu, String hdd, String procssor) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.processor = procssor;
    }

    @Override
    public String getCpu() {

        return this.cpu;
    }

    @Override
    public String getHdd() {

        return this.hdd;
    }

    @Override
    public String getProcessor() {

        return this.processor;
    }

}
