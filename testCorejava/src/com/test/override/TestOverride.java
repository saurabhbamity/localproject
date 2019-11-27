package com.test.override;

class TestOverrideParent {
	
	
	protected int value1=9;
	protected int value2=18;
	
	protected void myInit() {
		
		System.out.println("this is parent method init");
	}

}


class TestOverrideChild extends TestOverrideParent{
	
	
	protected int value1=10;
	
	protected void myInit() {
		
		System.out.println("this is child method init");
	}
	
}


public class TestOverride{	
	
	public static void main(String[] args) {
		
		TestOverrideChild toc= new TestOverrideChild();
		System.out.println(toc.value1);
		System.out.println(toc.value2);
		toc.myInit();
		
	}
	
	
	
}


