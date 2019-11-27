package com.test.generics;

public class GenericClassInstance<T> {

	Class thisClass=null;
	
	public GenericClassInstance(Class thisClass)
	{
	 this.thisClass=thisClass;  	
	}
	
	
	public T getInstance() throws IllegalAccessException, InstantiationException
	{
		return (T) this.thisClass.newInstance();
	}
	
	public static void main(String[] args) 
	{
	  try
	  {
		GenericClassInstance<DemoClass1> demoClass1= new GenericClassInstance<>(DemoClass1.class);
	    demoClass1.getInstance().demoMethod();
	    
	    GenericClassInstance<DemoClass2> demoClass2= new GenericClassInstance<>(DemoClass2.class);
	    demoClass2.getInstance().demoMethod();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	}
}


class DemoClass1{
	
	public void demoMethod()
	{
		System.out.println("inside demoMethod:DemoClass1");
	}
}

class DemoClass2{
	
	public void demoMethod()
	{
		System.out.println("inside demoMethod:DemoClass2");
	}
	
}

