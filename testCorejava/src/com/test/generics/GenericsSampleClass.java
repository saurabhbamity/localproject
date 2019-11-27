package com.test.generics;

/*The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
You'll see these names used throughout the Java SE API and the rest of this lesson.
*/
public class GenericsSampleClass<T> {

	private T t;
	
	public void add (T t)
	{
		this.t=t;
	}
	
	public T getvalue()
	{
		return this.t;
	}
	
	public static void main(String[] args) 
	{
		GenericsSampleClass<Integer> intclass= new GenericsSampleClass<>();
		intclass.add(5);
		System.out.println(intclass.getvalue());
	}

}
