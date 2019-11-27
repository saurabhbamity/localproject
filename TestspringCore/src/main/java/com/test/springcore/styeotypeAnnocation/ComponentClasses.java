package com.test.springcore.styeotypeAnnocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Controller
public class ComponentClasses {
    
    //i can replace all
    
    @Autowired
    private RepositoryClass repositoryClass;
    
    public RepositoryClass getRepo() {
        return repositoryClass;
    }

    public void setRepo(RepositoryClass repo) {
        this.repositoryClass = repo;
    }

    @Autowired
    private ServiceClass service;
    
    @Autowired
    private Controllerclass controller;
    
    public void componentMethod(){
        repositoryClass.setParamValues("repoclass from component");
        System.out.println("repo is "+repositoryClass.getParamValues());
        
        //service call
        service.serviceMethod("service method from component");
        
        //controller call
        controller.setName("call from component");
        controller.controllerServicecall();
    }
}

@Service
class ServiceClass {
    
    public String pata;
    
    @Autowired
    @Qualifier("repository1")
    public RepositoryClass repository;
    
    
    public RepositoryClass repository1;
    
    public void serviceMethod(String str){
        repository.setParamValues(str);
        System.out.println(repository.repoMethod());
    }
    
}

@Repository
class RepositoryClass{
    
    private String paramValues;
    
    public String getParamValues() {
        return paramValues;
    }
    public void setParamValues(String paramValues) {
        this.paramValues = paramValues;
    }
    public String repoMethod()
    {
        System.out.println("paramValues reviced by Repo class "+paramValues+"data insertion");
        return paramValues;
    }
    
}

@Controller
class Controllerclass{
    
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    private ServiceClass service; 
    
    public void controllerServicecall()
    {
        if (name != null) {

            service.serviceMethod(name);
        } else {
            service.serviceMethod("aamai");
        }
    }
    
}