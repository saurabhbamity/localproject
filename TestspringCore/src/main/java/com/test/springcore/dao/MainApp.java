package com.test.springcore.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springcore.dao.model.Student;

public class MainApp {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentDaoImpl studentJDBCTemplate = (StudentDaoImpl)context.getBean("StudentDaoImpl");
        
        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create(1,"Zara", 11);
        studentJDBCTemplate.create(2,"Nuha", 17);
        studentJDBCTemplate.create(3, "Ayan", 15);
        
        List<Student> stulist= new ArrayList<Student>();
        for (int i=0;i<10;i++)
        {
            stulist.add(new Student(1, "abhinav"+1, 19+i));
        }
        
        studentJDBCTemplate.batchInsertStudent(stulist);

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();
        
        for (Student record : students) {
           System.out.print("ID : " + record.getId() );
           System.out.print(", Name : " + record.getName() );
           System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.updateStudentbyId(2, 18);

        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudentbyId(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
     }

}
