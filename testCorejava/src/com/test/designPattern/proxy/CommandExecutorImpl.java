package com.test.designPattern.proxy;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void executeCommand(String cmd) {
        
        //Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
        
    }
    
    

}
