package com.test.corejava;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    
    
    public static void main(String[] args) {
        
        IntStream stream = "12345".chars();
        stream.forEach(p -> System.out.println(p));
         
        //OR
         
        Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
        stream2.forEach(p -> System.out.println(p));
        
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        streamBuilder.forEach(p -> System.out.println(p));
    }

}
