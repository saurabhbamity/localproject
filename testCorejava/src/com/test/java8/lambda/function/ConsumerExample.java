package com.test.java8.lambda.function;

import java.util.function.Consumer;

public class ConsumerExample {
    
    /*
     * predicate-> boolean->test
     * Function<T,R>-> R Type->apply
     * consumer<T>-> void->accept
     * 
     */
    
    public static void main(String[] args) {
        
        Consumer<String> c=s->{
            System.out.println("testing consumer for "+s+" is :->"+s+s);
        };
        c.accept("rama");
        //consumer chaining
        
        Consumer<String> c1= s->{ System.out.println(s+" is a movie");};
        Consumer<String> c2= s->{ System.out.println(s+" you are watching this movie");};
        Consumer<String> c3= s->{ System.out.println(s+" Please stop watching this movie");};
        
       c1.andThen(c2).andThen(c3).accept("spider");
    }

}
