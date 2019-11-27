package com.test.aop.understandaop;

import com.test.aop.customannotation.Loggable;

public class Tringle {
    
    private String name;
    
    
    private Integer area;

    @Loggable
    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getName() {
        System.out.println("method Tringle: getname");
        return name;
    }
    
    public void setName(String name) {
        System.out.println("method Tringle: setname");
        this.name = name;
    }
   

}
