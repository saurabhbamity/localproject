package com.test.designPattern.strategy2;
public class FacebookStrategy implements ISocialMediaStrategy {
 
    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}