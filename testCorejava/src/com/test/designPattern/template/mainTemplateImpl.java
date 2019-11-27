package com.test.designPattern.template;

public class mainTemplateImpl {
    
    
    public static void main(String[] args) {
        
        
        GameTemplate cricket= new Cricket();
        cricket.playGame();
        
        GameTemplate football= new Football();
        football.playGame();
        
        
    }

}
