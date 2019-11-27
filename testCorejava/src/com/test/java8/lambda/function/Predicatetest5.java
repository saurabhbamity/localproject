package com.test.java8.lambda.function;

import java.util.function.Predicate;

import javax.print.attribute.standard.PresentationDirection;

public class Predicatetest5 {
    
    public static void main(String[] args) {
        
        //event number or odd number program
        Predicate<Integer> p1= i->i%2==0;
        System.out.println("5 is even or not ?->"+p1.test(5));
        System.out.println("10 is even or not ?->"+p1.test(10));
        
        //String is bigger than 5
        Predicate<String> p2= s->s.length()>5;
        System.out.println("String is greater than 5"+p2.test("saurabh"));
        System.out.println("String is greater than 5"+p2.test("chanchal"));
        System.out.println("String is greater than 5"+p2.test("eva"));
        
        // employee salary>10000 and having Girlfriend
        
        Predicate<Employee> p3= e->e.getSalary()>1000 && e.hasGirlFriend()==true;
        System.out.println("Mr raghu is ableto enter pub"+p3.test(new Employee(20000, false)));
        System.out.println("Mr raghu is ableto enter pub"+p3.test(new Employee(30000, true)));
        System.out.println("Mr raghu is ableto enter pub"+p3.test(new Employee(9000, true)));
        System.out.println("Mr raghu is ableto enter pub"+p3.test(new Employee(18000, false)));
        
        
        
        // list of name, print name bigger than 8 charactors
        
        String[] arrayStringNames= {"saurabh", "Chanchal","eva","varalika","rajneesh"};
        Predicate<String> p4=s->s.length()>=8;
        for(String s: arrayStringNames)
        {
            System.out.println("name "+s+" is bigger than 8"+p4.test(s));
            
        } 
        
        //number is even number and greater than 10
        
        Predicate<Integer> p5= i->i%2==0;
        Predicate<Integer> p6= i->i>10;
        
        System.out.println("even and greater than 10"+p5.and(p6).test(12));
        System.out.println("even or greater than 6"+p5.or(p6).test(6));
    }

}