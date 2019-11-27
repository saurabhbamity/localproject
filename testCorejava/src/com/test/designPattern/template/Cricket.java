package com.test.designPattern.template;

public class Cricket extends GameTemplate {

  

    @Override
    void PlayOnGround() {
        System.out.println("batting, fielding and balling on ground");

    }

    
    
    @Override
    void GetReadytoPlay() {
       System.out.println("batsman, wearing pads, all wearing Tshirt and ready to play cricket");

    }
    
    @Override
    void StopPlayGame() {
        System.out.println("50 over completed, stopping the game");

    }

}
