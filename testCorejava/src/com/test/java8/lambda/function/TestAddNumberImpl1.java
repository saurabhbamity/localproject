package com.test.java8.lambda.function;


/**
 * 
 * @author Saurabh.Bhardwaj
 *
 *this is lambda Expression Example, keep in mind few point.
 *there is always a FI behind every lambda Expression. rest of the rules are same.e.g:
 *return should have return with braces, no braces no braces.
 *if compiler can figure out the param type , no need to explicitly mention it.
 */
public class TestAddNumberImpl1  {

    public static void main(String[] args) {
        
        AddNumbers ad= (a,b)->a+b;
        System.out.println("adding 2 and 3 with lamda Expresion"+ad.add(2, 3));
        System.out.println("adding 7 and 10 with lambda Expression"+ad.add(7, 10));
    }
   

}
