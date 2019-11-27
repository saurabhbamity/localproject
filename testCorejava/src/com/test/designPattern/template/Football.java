package com.test.designPattern.template;

public class Football extends GameTemplate{

   

   

    @Override
    void StopPlayGame() {
        System.out.println("70 min over, stoping the football match");
        
    }
    
    @Override
    void GetReadytoPlay() {
        System.out.println("waering a Tshirt and shoes , getting ready");
        
    }

    @Override
    void PlayOnGround() {
        System.out.println("on Ground , playing Football");
        
    }
}
