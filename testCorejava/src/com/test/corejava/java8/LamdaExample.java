package com.test.corejava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.corejava.Personal;

public class LamdaExample {

    public static void main(String[] args) {
        
        /*List<Personal> listPers = getPersons();
        
        System.out.println("Before Sort");
        for (Personal person : listPers) {
            System.out.println(person);
        }
        
        System.out.println("After Sort");
        
      //sort by name
        Collections.sort(listPers, new Comparator<Personal>() {
            @Override
            public int compare(Personal o1, Personal o2) {
                return o1.getlName().length() - o2.getlName().length();
            }
        });*/
        
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
        
        //sort by age
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
    
        System.out.println("--------After Sort->without lamda on salary----------");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
        
      //lambda here!
        //listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
    
        //java 8 only, lambda also, to print the List
        //System.out.println("----------with lamda sort on age----------");
        //listDevs.forEach((developer)->System.out.println(developer));
        
      //lambda
        listDevs.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
        
        System.out.println("----------with lamda sort on name----------");
        listDevs.forEach((developer)->System.out.println(developer));
       
    }
    
    
    private static List<Personal> getPersons() {

        List<Personal> result = new ArrayList<Personal>();

        result.add(new Personal("mkyong", "singth"));
        result.add(new Personal("alvin", "king"));
        result.add(new Personal("jason", "bing"));
        result.add(new Personal("iris", "ting"));
        
        return result;
    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", 455, 33));
        result.add(new Developer("alvin", 809, 20));
        result.add(new Developer("jason", 1000, 10));
        result.add(new Developer("iris", 900, 55));
        
        return result;

    }

}
