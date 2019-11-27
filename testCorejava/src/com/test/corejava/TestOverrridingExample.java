package com.test.corejava;

public class TestOverrridingExample {
	
	public static void main(String[] args) {
		
		A1 a1= new A1();
		a1.m1(null);
		a1.m2(1);
		a1.m3(0);
		//compiler error
		//a1.m4(null);
	}

}


class A0{
	
	protected Object m3(int i) {
		System.out.println("m3 value is "+i);
		return "";
	}
}

class A1 extends A0{
	
	public void m1(int i) {
		System.out.println("int i value is "+i);
	}
	
	
	public void m1(String str) {
		System.out.println("str value is "+str);
	}
	
	
	public void m4(String str) {
		System.out.println("string str value is "+str);
	}
	
	 public void m4(B1 b) { 
		 System.out.println("B1 value is called "); 
     }
	 
	
	public void m2(long l) {
		System.out.println("long i value is "+l);
	}
	
	public void m2(int i) {
		System.out.println("int i value is "+i);
	}
	
	public String m3(int i) {
		System.out.println("m3 child value is "+i);
		return "";
	}
}

class B1{
	
}