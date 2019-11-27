package com.test.corejava.puzzle;

import java.util.HashMap;
import java.util.Map;

public class HashMapSize {
    
    
    public static void main(String[] args) {
        
        employee e1=new employee(1, "saurabhB");
        employee e2=new employee(1, "saurabhS");

        Map<employee, String> m1= new HashMap<>();
        m1.put(e1, "test1");
        m1.put(e2, "test2");
        
        // size will be 2 even if the element inserted in same bucket.
        //size retun the size property that is incremented when user put the value in hashmap.
        System.out.println("size is: "+m1.size());
        
    }

}

class employee
{
    int empid;
    String empName;
    
    public employee(int empid, String empName)
    {
        this.empid=empid;
        this.empName=empName;
    }
    
    @Override
    public int hashCode(){
        return 1;
    }
}
