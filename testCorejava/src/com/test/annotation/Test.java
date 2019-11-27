package com.test.annotation;

import com.test.corejava.Personal;

public class Test 
{
    public static void main(String[] args)
    {
        String str = new String("two");
        //Personal p1= new Personal(name, lname)-- not  in switch case permitted
        switch(str)
        {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }
    }
}