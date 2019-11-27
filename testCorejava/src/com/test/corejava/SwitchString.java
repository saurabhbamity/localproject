package com.test.corejava;

public class SwitchString {
    
    
    public static void main(String[] args) {
        
        String str="ACTIVE";
        
        switch(str){
            
            case "ACTIVE":
                System.out.println("Application is running on Active mode");
                break;
            case "PASSIVE":
                System.out.println("Application is running on Passive mode");
                break;
            case "SAFE":
                System.out.println("Application is running on Safe mode");

        }
    }

}
