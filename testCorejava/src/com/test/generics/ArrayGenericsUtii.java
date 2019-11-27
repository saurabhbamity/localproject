package com.test.generics;

public class ArrayGenericsUtii {
	
	public static < E > void printArray(E[] inputArray)
	{
		for (E element:inputArray)
		{
			System.out.println("element:->"+element);
		}
		
	}

	public static void main(String[] args) 
	{
	  Integer[] intArray= {1,2,3,4,5,6,7,8,9,0};
	  Character[] charArray= {'a','b','c','d','e','f','g'};
      String[] strArray={"abc","def","ghi","jkl","mno"};
      
      
      printArray(intArray);
      printArray(charArray);
      printArray(strArray);
	}
}