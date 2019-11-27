package com.test.designPattern.adaptor;

public class Moti implements DogieInterface {

    @Override
    public void barking() {
        System.out.println("bho bho bho");

    }

    @Override
    public void doggiRun() {
        System.out.println("run with four legs with speed 20KMPS");

    }

}
