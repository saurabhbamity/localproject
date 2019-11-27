package com.test.java8.lambda.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MyComparator implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        return (o1<o2)?-1:(o1>o2)?1:0;
    }
    
}
public class testingCollectionSort9 {
    
    
    public static void main(String[] args) {
        
        
        List<Integer> arrays= new ArrayList();
        arrays.add(10);
        arrays.add(50);
        arrays.add(30);
        arrays.add(10);
        arrays.add(2);
        arrays.add(18);
        arrays.add(90);
        
        System.out.println("arrays values"+arrays);
        Collections.sort(arrays, new MyComparator());
        
        System.out.println("sorted by mycomparator"+arrays);
        
        Comparator<Integer> com= (o1,o2)-> (o1<o2)?1:(o1>o2)?-1:0;
        Collections.sort(arrays, com);
        System.out.println("sorted by lambda expression"+arrays);
        
        
        
    }

}
