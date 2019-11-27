package com.test.designPattern.observer2;

public class ConsumerBhakt implements BabaNewsAgency {
    
    String name;
    void setname(String name)
    {
        this.name=name;
    }
    
    public ConsumerBhakt(String name)
    {
        this.name=name;
    }

    @Override
    public void broadCastedNews(String news) {
        System.out.println("news read by" +name+", news is that : "+news);
        
    }

}
