package com.test.designPattern.strategy2;
public class GooglePlusStrategy implements ISocialMediaStrategy {
 
    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through GooglePlus");
    }
}