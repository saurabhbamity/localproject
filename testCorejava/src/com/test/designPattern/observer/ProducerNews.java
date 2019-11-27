package com.test.designPattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ProducerNews {
    
    
    Map<String, String> newsmap= new HashMap();
    List<ObserverNews> listObserver= new ArrayList<>();
    
    public Map<String, String> getNewsmap() {
       
       
        return newsmap;
        
    }

    public void setNewsmap(String newsmap) {
        this.newsmap.put(newsmap, newsmap);
        for(ObserverNews newsperson: listObserver){
            newsperson.gotUpdate(newsmap);
        }
    }
    
    public void AddConsumer(ObserverNews observerNews){
        
        this.listObserver.add(observerNews);
        
    }
    
 }
