package com.test.designPattern.Builder;

import java.util.Date;

public class TaskBuilder {

    private  long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;
    
    private final TaskBuilder taskConcurrent = new TaskBuilder(5);

    public TaskBuilder(long id, String summary, String description, boolean done,
            Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public TaskBuilder(long id) {
        this.id = id;
    }

     
    
    public TaskBuilder() 
    {
        Thread t1 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                taskConcurrent.setDescription("Hello").setSummary("Test").build();
            } 
        }); 
  
        Thread t2 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                taskConcurrent.setDescription("HelloThread2").setSummary("TestThread2").build();
            } 
        }); 
        
        t1.start(); 
        t2.start();
    }
    
    public TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    public TaskBuilder setDueDate(Date dueDate) {
        this.dueDate = new Date(dueDate.getTime());
        return this;
    }
    public Task build() {
        return new Task(id,summary, description,done, new Date());
    }
    
    public TaskBuilder getTaskBuilder(){
        return taskConcurrent;
    }
    
}
