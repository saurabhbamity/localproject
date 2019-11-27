package com.test.designPattern.observer2;

import java.util.ArrayList;
import java.util.List;

public class Producerbaba  {
    
    
    BabaNewsAgency newstoBroadcast;
    
    List<ConsumerBhakt> bhakts= new ArrayList<ConsumerBhakt>();
    
    void setConsumerBhakt(List<ConsumerBhakt> bhakts){
        this.bhakts=bhakts;
        
    }
    
    public void setNewstoBroadCast(String news) {
        System.out.println("broadcasting news");
        for(ConsumerBhakt bhkt:bhakts)
        {
            bhkt.broadCastedNews(news);
        }
        
    }

}
