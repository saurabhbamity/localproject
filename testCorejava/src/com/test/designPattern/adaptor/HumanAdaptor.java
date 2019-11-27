package com.test.designPattern.adaptor;

public class HumanAdaptor implements DogieInterface {

    private Human human;
    
    public HumanAdaptor(Human human) {
        this.human=human;
        
    }
    @Override
    public void barking() {
        human.speeking();

    }

    @Override
    public void doggiRun() {
        human.humanRun();


    }

}
