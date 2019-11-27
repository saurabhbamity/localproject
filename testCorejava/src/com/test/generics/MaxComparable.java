package com.test.generics;

public class MaxComparable {
	
	
	public static <T extends Comparable<T>> T Maxvalue(T x, T y, T z)
	{
		T max= x;
		if(y.compareTo(max)>0)
		{
			max=y;
		}
		else if (z.compareTo(max)>0)
		{
			max=z;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("integer max value:->"+Maxvalue(7, 5, 11));
		System.out.println("Flot max value:->"+Maxvalue(7.9, 9.5, 3.8));
		System.out.println("string max value:->"+Maxvalue("saurabh", "privin", "karuneshwar"));
	}

}
