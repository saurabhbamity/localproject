package com.test.designPattern.observer;

import com.test.designPattern.adaptor.Shayam;

public class MainImpl {
    
    
    public static void main(String[] args) {
        ProducerNews newsProceduser= new ProducerNews();
        ObserverNews ramu= new ObserverNews("Ramu");
        ObserverNews shyamu= new ObserverNews("shayamu");
        ObserverNews dinnesh= new ObserverNews("Dinesh");
        newsProceduser.AddConsumer(ramu);
        newsProceduser.AddConsumer(shyamu);
        newsProceduser.AddConsumer(dinnesh);
        
        
        newsProceduser.setNewsmap("timeofIndiaNews");
        newsProceduser.setNewsmap("Hindustaimesnews");
        newsProceduser.setNewsmap("Amarujala news");
        
    }
    
   
    

}
