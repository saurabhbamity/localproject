package com.test.designPattern.FlyingWeight;

import java.util.HashMap;


public class Person {
    
    private int adaarId;
    private int id;
    private String name;
    
    public Person(int adharId, int Id, String name){
        
        this.adaarId= adharId;
        this.id=Id;
        this.name=name;
        
    }

    public Person(int adharId, int Id){
        
        this.adaarId= adharId;
        this.id=Id;
        
    }
    
    public int getAdaarId() {
        return adaarId;
    }

    public void setAdaarId(int adaarId) {
        this.adaarId = adaarId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return "person is with adhar id : "+adaarId+" and id is : "+id+" and the name is "+name;
    }
}

class PersonFactory{
    
    private static java.util.Map<Integer,Person> personmap= new HashMap<Integer , Person>();
    
    
    public  static Person CreatePersonFactory(int adhharId, int id, String name)
    {
        if(personmap.get(adhharId)==null)
        {
           Person p=new Person(adhharId, id, name);
           personmap.put(adhharId, p);
           System.out.println("person created is "+p.toString());
           return p;
           
        }else{
            
            System.out.println("person retrieved is "+personmap.get(adhharId).toString());
            return personmap.get(adhharId);
        }
    }
}
