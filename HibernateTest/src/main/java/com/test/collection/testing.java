package com.test.collection;

import java.util.ArrayList;
import java.util.List;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> parameterValuesList = new ArrayList<Object>();
		parameterValuesList.add("123");
		parameterValuesList.add("test");
		parameterValuesList.add("test1");
		
		System.out.println("parameterValuesList.toArray()"+parameterValuesList.toArray().toString());
		for(Object s: parameterValuesList)
		{
			System.out.println(s.toString());
		}
		
	}

}
