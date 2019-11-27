package com.test.designPattern.strategy2;
public class TwitterStrategy implements ISocialMediaStrategy {
 
    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}