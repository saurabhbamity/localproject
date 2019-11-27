package com.test.concurrency.threadpoolexecutor;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoTask implements Runnable
{
    private String name = null;
 
    public DemoTask(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
    @Override
    public void run() {
        try {
        	if(this.name.equals("66"))
        	{
        		throw new FileNotFoundException();
        		
        	}else {
            Thread.sleep(500);
        	}
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("Executing : " + name);
    }
}