package com.test.corejava;

public class TestDateFormat {
	
	
	public static void main(String[] args) {
		
		
		String dat="1982-05-07";
		String[] tokendate= dat.split("-");
		String newdate=tokendate[2]+"-"+tokendate[1]+"-"+tokendate[0];
		System.out.println(""+newdate);
	}

}
