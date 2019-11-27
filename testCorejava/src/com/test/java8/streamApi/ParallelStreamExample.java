package com.test.java8.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ParallelStreamExample {
	
	public static void main(String[] args) {
		
		long t1, t2;
		
		List<Student> list= new ArrayList<>();
		list.add(new Student(1, 23, "saurabh", "science"));
		list.add(new Student(1, 21, "chanchal", "science"));
		list.add(new Student(1, 22, "nitin", "art"));
		list.add(new Student(1, 20, "kunal", "commerce"));
		list.add(new Student(1, 23, "basal", "commerce"));
		list.add(new Student(1, 31, "rachna", "science"));
		list.add(new Student(1, 50, "rupam", "art"));
		
	//all student count of age 23
		 t1 = System.currentTimeMillis();
		System.out.println(list.stream().filter(stu->stu.getAge()==23).count());
		
		 t2 = System.currentTimeMillis();
	     System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
	     
	     
	   //all student count of age 23
		 t1 = System.currentTimeMillis();
		System.out.println(list.parallelStream().filter(stu->stu.getAge()==23).count());
		
		 t2 = System.currentTimeMillis();
	     System.out.println("parallel Stream Time Taken?= " + (t2-t1) + "\n");
		
	// all student that can select in interview are having science side, age should be less than 20	
		list.stream().filter(st->(st.getAge()<=22)).forEach(System.out::println);
		
		/* Q1.how many thread is created in parallel stream 
		Ans :: parallel stream uses the current thread and in addition to that, if needed, also the 
		       threads that compose the default fork join pool ForkJoinPool.commonPool(),
		which has a default size equal to one less than the number of cores of your CPU.
		
		That default size of the common pool can be changed with this property:
		-Djava.util.concurrent.ForkJoinPool.common.parallelism=8
		
		Alternatively, you can use your own pool:
		ForkJoinPool myPool = new ForkJoinPool(8);
			myPool.submit(() ->
    	list.parallelStream().forEach( Do Something );
			).get();
			
			https://stackoverflow.com/questions/30802463/how-many-threads-are-spawned-in-parallelstream-in-java-8
		
		*/
		
	}



}


class Student{
	
	private int id;
	private int age;
	private String name;
	private String department;
	
	

	public Student(int id, int age, String name, String ddepartment) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		department = department;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDdepartment() {
		return department;
	}

	public void setDdepartment(String department) {
		department = department;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", department=" + department + ", toString()="
				+ super.toString() + "]";
	}
	
}