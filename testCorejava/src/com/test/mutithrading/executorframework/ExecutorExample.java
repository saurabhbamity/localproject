package com.test.mutithrading.executorframework;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.test.executorFramework.ReenterantLock4;

public class ExecutorExample {
	
	public static void main(String[] args) {
		
		Object[] obj= {"string", new Object(),new ReenterantLock4() };
		for(int i=10;i<=20;i++){
		System.out.println();
		}
		
		ScheduledExecutorService excuterservice= Executors.newScheduledThreadPool(2);
		//ScheduledExecutorService excuterservice= Executors.newSingleThreadScheduledExecutor();
		
		
		Task task = new Task("Repeat Task");
        System.out.println("Created : " + task.getName());
        
		//excuterservice.scheduleWithFixedDelay(task, 5, 5, TimeUnit.SECONDS);
		
		// thread tool Executor
		
		//ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		//ExecutorService executor= Executors.newSingleThreadScheduledExecutor();
		ExecutorService executor= Executors.newCachedThreadPool();
        
        for (int i = 1; i <= 99; i++)
        {
            Task fixedtask = new Task("Task " + i);
            System.out.println("Created : " + fixedtask.getName());
 
            executor.execute(fixedtask);
        }
        executor.shutdown();
		
	}
	
	

}



class Task implements Runnable {
    private String name;
 
    public Task(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());
    }
}