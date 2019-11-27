package com.test.java8.lambda.function;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface FuncInterface 
{ 
 // An abstract function 
 void abstractFun(int x); 

 // A non-abstract (or default) function 
 default void normalFun() 
 { 
    System.out.println("Hello"); 
 } 
} 



public class LambdaExpresionPractice4 {
	
	public static void main(String[] args) {
		
		FuncInterface fs=(x)->{System.out.println("number"+x+" is passed as argument");};
		
		fs.abstractFun(6);
		fs.abstractFun(8);
		
		//using runnable by lambda
		Runnable r=()->{
			for(int i=1;i<=10;i++) {
				System.out.println("number is "+i);
			}
		};
		
		Thread t1= new Thread(r);
		//Thread t2= new Thread(call);
		t1.start();
		
		//using callable by lambda
		
		Callable call=()->{
			
			for(int i=11;i<=21;i++) {
				System.out.println("number is calling from caalable "+i);
			}
			
			return 0;
			
		};
		
		//predicate that takes an argument as input and returns boolean value. 
		Predicate<String> p1=(s)->s.length()>=5;
		System.out.println("saurabh length is greater than 5 "+p1.test("saurabh"));
		
		Predicate<Employee> p2=(emp)->emp.getSalary()>=50000;
		Employee e= new Employee(59000, true);
		System.out.println("salary of Employee is greater than 5000 "+p2.test(e));
		
		
		//Function that takes an input and return output other than boolean as well.
		
		Function<String,Integer> fun= (str)->str.length()>10?0:1;
		
		System.out.println("is saurabh is greater length than 10:->"+fun.apply("saurabhbhardwaj"));
		
		
		
		//suplier Example takes no input and gives output
		
		Supplier<String> sup=()->"this is supplier Example";
		System.out.println(sup.get());
		System.out.println(sup.get());
		
		//consumer that takes an input and does not return anything
		
		Consumer<Integer> consum= (inte)->System.out.println("value double: "+inte*2);
		
		consum.accept(20);
		consum.accept(30);
		
		
	}
	

}
