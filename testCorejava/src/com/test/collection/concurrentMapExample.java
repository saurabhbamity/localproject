package com.test.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentMapExample {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> m= new ConcurrentHashMap<>();
		
		m.put(10, "String");
		m.put(11, "String");
		m.put(12, "String");
		System.out.println("testing concurrentmap");
		
		
	Map<Integer, String> m1= new HashMap<>();
		
	m1.put(10, "String");
	m1.put(11, "String");
	m1.put(12, "String");
		System.out.println("testing concurrentmap");
		
		
	}

}
