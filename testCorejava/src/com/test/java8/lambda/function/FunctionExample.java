package com.test.java8.lambda.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    
    public static void main(String[] args) {
        
        Function<Integer, Integer> f=i->i*i;
        System.out.println("sqaure 4"+f.apply(4));
        System.out.println("square 5"+f.apply(5));
        
        Function<Integer, String> f2=i->i+"-welcome";
        System.out.println("sqaure 4:"+f2.apply(4));
        System.out.println("square 5:"+f2.apply(5));
        
        Function<Student, String> f3= s-> {
          
            int marks=s.marks;
            String grade=null;
            if(marks>80) 
                grade="A";
            else if(marks>60) 
                grade="B";
            else if(marks>50) 
                grade="D";
            else if(marks>35) 
                grade="E";
            else 
                grade="F";
            return grade;
        };
        Student[] arrayStu={new Student("ram",81), 
                new Student("shyam",65), 
                new Student("sita",55),
                new Student("bharat",34)};
        
        for(Student stu: arrayStu)
        {
            System.out.println("this is student with name->"+stu.name+" having marks: "+stu.marks+" so the grade is "+f3.apply(stu));
            System.out.println("******");
        }
       
        //print only the A and B Grade student
        Predicate<Student> p1=s->s.marks>=60;
        for(Student stu: arrayStu)
        {
            if(p1.test(stu))
            {
                System.out.println("###########");
                System.out.println("this is student with name->"+stu.name+" having marks: "+stu.marks+" so the grade is "+f3.apply(stu));
                System.out.println("******");
            }    
        }
        
        // using consumer to create the consumer to pring student information.
        
        Consumer<Student> c= stu->{
            System.out.println("this is student with name->"+stu.name+
                                " having marks: "+stu.marks+
                                " so the grade is "+f3.apply(stu));
        };
        
        for(Student stu: arrayStu)
        {
            if(p1.test(stu))
            {
                System.out.println("$$$$$$$$$$$$$$$$$");
                c.accept(stu);
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }    
        }
        
        // Function chaining
        Function<Integer, Integer> f4= i->i+2;
        Function<Integer, Integer> f5= i->i*i*i;
        
        System.out.println("f4.thenf5 is :->"+f4.andThen(f5).apply(3));
        System.out.println("f4.compose is :->"+f4.compose(f5).apply(3));
        System.out.println("multiple chain->"+f4.andThen(f5).compose(f4).apply(3));
        
    }

}


class Student{
    
    String name;
    int marks;
    
    public Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    
}
