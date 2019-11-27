package com.test.springcore.autowiredRequire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Malik {
    
    
    @Autowired
    private AutoA b;
    
    public AutoA getA() {
        return b;
    }

    public void setA(AutoA a) {
        this.b = a;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    @Autowired
    @Qualifier("shayaamu")
    private Servent syaamu;
    
    @Resource
    private Driver driver;

    public Driver getdriver() {
        return driver;
    }

    public void setBabu(Driver driver) {
        this.driver = driver;
    }

    public Servent getSyaamu() {
        return syaamu;
    }

    public void setSyaamu(Servent syaamu) {
        this.syaamu = syaamu;
    }
    
    
    public void init()
    {
        System.out.println("this is init method");
    }

}

class Servent{
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Driver{
    
    private String name;
    
    @PreDestroy
    public void predestroyMethod()
    {
        System.out.println("driver class predestroy method*****************");
    }
    
    @PostConstruct
    public void postConstructMethod()
    {
        System.out.println("driver class postcontruct method*******************");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}