package com.test.designPattern.template;

public abstract class GameTemplate {
    
    
    abstract void GetReadytoPlay();
    abstract void PlayOnGround();
    abstract void StopPlayGame();
    
    public void playGame(){
        
        GetReadytoPlay();
        PlayOnGround();
        StopPlayGame();
    }
    

}
