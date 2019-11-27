package com.test.designPattern.observer;

public class ObserverNews implements ObserverNewsInterface {

    String name;
    public ObserverNews(String name)
    {
        this.name=name;
    }
    
    @Override
    public void gotUpdate(String News) {
       System.out.println(News+"get recieved by "+this.name);

    }
}
