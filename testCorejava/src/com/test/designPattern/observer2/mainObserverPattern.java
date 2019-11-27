package com.test.designPattern.observer2;

import java.util.ArrayList;
import java.util.List;

public class mainObserverPattern {
    
    public static void main(String[] args) {
        
        
        Producerbaba baba= new Producerbaba();
        
        List<ConsumerBhakt> bhaktList= new ArrayList<ConsumerBhakt>();
        
        bhaktList.add(new ConsumerBhakt("ajay"));
        bhaktList.add(new ConsumerBhakt("vijay"));
        bhaktList.add(new ConsumerBhakt("harish"));
        
        baba.setConsumerBhakt(bhaktList);
        
        baba.setNewstoBroadCast("election going on in india");
    }

}
