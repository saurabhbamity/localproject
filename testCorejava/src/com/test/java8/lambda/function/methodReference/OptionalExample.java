package com.test.java8.lambda.function.methodReference;

import java.util.Optional;

import com.test.corejava.serialization.Person;

public class OptionalExample {
	
	public static void main(String[] args) {
		
		
		//before java 8, null check using uninitialised value
		/*
		 * Person p =null; if (p==null) { p=new Person("saurabh", 35, "connect");
		 * System.out.println("new person is created"+p.toString()); }else {
		 * p.toString(); }
		 */
		
		
		Person p1=null;
		//p1.toString();
		Optional<Person> optPerson= Optional.ofNullable(p1);
		System.out.println(optPerson.isPresent());
		Optional<Person> p2 = Optional.empty();
		p2.toString();
		
		Person pp1=new Person("saurabh", 38, "connect");;
		pp1.toString();
		Optional<Person> optPerson1= Optional.of(pp1);
		optPerson1.toString();
		Optional<Person> p22 = Optional.ofNullable(p1);
		p22.toString();
	}

}
