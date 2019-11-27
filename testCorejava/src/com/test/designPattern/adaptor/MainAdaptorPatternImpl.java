package com.test.designPattern.adaptor;

public class MainAdaptorPatternImpl {

    public static void main(String[] args) {
        //client called the create a dag, as humanAdaptor is implemanting the dog properties.
        // but all human behaviour comes up.
        /*expecting the dog, as humanadaptor is calling doginterface,
         * but event calling the dog method working , will be done as human do
         */
        HumanAdaptor dog= new HumanAdaptor(new Shayam());
        dog.barking();// its human speeks.
        dog.doggiRun();//its human run 
    }
}
