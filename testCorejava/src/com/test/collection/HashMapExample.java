package com.test.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {
    
    
    public static void main(String[] args) {
        
        Map<String, String> values= new HashMap<>();
        values.put("A", "1");
        values.put("Z", "26");
        values.put("I", "11");
        values.put("P", "16");

        //get all keys and values.
        Set<Map.Entry<String, String>> allKeysvalues=values.entrySet();
        
        for (Map.Entry<String, String> ent:allKeysvalues)
        {
            System.out.println("key is :-> "+ent.getKey()+"value is "+ent.getValue());
        }
        
        //get only keys
        Set<String> allKeysonly=values.keySet();
        
        for (String keys:allKeysonly)
        {
            System.out.println("key only  is :-> "+keys);
        }
        
        
      //get only values
        Collection<String> allvaluessonly=values.values();
        
        for (String value:allvaluessonly)
        {
            System.out.println("value only  is :-> "+value);
        }
        
        
       //sort by values
        Set<Map.Entry<String, String>> allEntrySet=values.entrySet();
        
        List<Map.Entry<String, String>> list = new LinkedList<Map.Entry<String, String>>(allEntrySet);
        
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            
            public int compare(Map.Entry<String, String> o1,  
                    Map.Entry<String, String> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        });
        
     // Maintaining insertion order with the help of LinkedList
        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        PrintSortedMap(sortedMap);
    }

    private static void PrintSortedMap(Map<String, String> sortedMap) {
        
        Set<Map.Entry<String, String>> sortedMapElement= sortedMap.entrySet();
        
        for(Map.Entry<String, String> node:sortedMapElement)
        {
            System.out.println("sorted Key is "+node.getKey()+" : and sorted value is "+node.getValue());
        }
        
    }


}
