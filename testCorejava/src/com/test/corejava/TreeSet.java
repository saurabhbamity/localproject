package com.test.corejava;

import java.util.Comparator;
import java.util.Set;

public class TreeSet {
    
    
    public static void main(String[] args) {
    
        Set<Employee> t= new java.util.TreeSet<Employee>();
        t.add(new Employee(1, "saurabh"));
        t.add(new Employee(2, "bhardwaj"));
        
        System.out.println("testing shorted set"+t.toString());
        for(Employee e: t){
            System.out.println(e.getId());
        }
        
        
        Set<Employee> t2= new java.util.TreeSet<Employee>(new myComparatorEmplyee());
        
        t2.add(new Employee(1, "saurabh"));
        t2.add(new Employee(2, "bhardwaj"));
        
        System.out.println("testing shorted set"+t2.toString());
        for(Employee e: t2){
            System.out.println(e.getName());
        }
        
    }
}


class Employee implements Comparable<Employee>{
    
    
    private int Id;
    private String name;
    
    public Employee(int id, String name){
        this.Id=id;
        this.name=name;
    }
    
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public int compareTo(Employee o) {
       System.out.println("this.id vale"+this.Id);
       System.out.println("id vale"+Id);
        return o.Id-this.Id;
    }
}



class myComparatorEmplyee implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
       
        return o1.getName().length()-o2.getName().length();
    }
    
}
