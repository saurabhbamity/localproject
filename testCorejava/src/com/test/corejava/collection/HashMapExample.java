package com.test.corejava.collection;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        
        HashMap< student, String> map= new HashMap<>();
        map.put(new student(1,"saurabh"), "saurabh");
        map.put(new student(1,"chanchal"), "chanchal");
        map.put(new student(1,"eva"), "eva");
        map.put(new student(1,"rahul"), "rahul");
        map.put(new student(1,"dhania"), "dhania");
        map.put(new student(1,"mirchi"), "mirchi");
        map.put(new student(1,"podina"), "podina");
        map.put(new student(1,"nibu"), "nibu");
        map.put(new student(1,"aaloo"), "aaloo");
        map.put(new student(1,"tamato"), "tamato");
       
        for(int i=0;i<10;i++){
            map.put(new student(1,"tamato"+i), "tamato"+i);
        }

    }

}

class student /*implements Comparable<student>*/{
    
    private int id;
    private String name;
    
    
    public student(int id, String name){
        this.id=id;
        this.name=name;
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
    
    @Override
    public boolean equals(Object o){
        if(o==null || !(o instanceof student)) {
            return false;
        }
        
        if(this==o && ((student)o).getId()==this.getId())
        {
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public int hashCode()
    {
        return 1;
    }

  /*  @Override
    public int compareTo(student o) {
        
        return this.id-o.id;
    }*/
}

