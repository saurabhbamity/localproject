package com.test.corejava;

public class FinalExampleClass  extends FinalM1Class implements M1Interface {
	
	
	public static void main(String[] args) {
		
	}

	public void m1(int a) {
		
	}
}

interface M1Interface {
	public void m1(int a);
	
}


class FinalM1Class {
	
	public final void m1() {
		System.out.println("this is final method");
	}
}