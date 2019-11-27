package com.test.designPattern.proxy;

public class AppMain {
    
    public static void main(String[] args) {
        
        CommandExecutor cmdExe= new CommandExecutorProxy("saurabh", "Cchanchal");
        cmdExe.executeCommand("ls -ltr");
    }

}
