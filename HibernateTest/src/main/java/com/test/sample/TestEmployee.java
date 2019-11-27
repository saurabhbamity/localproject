package com.test.sample;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

    public static void main(String[] args) {
        
        
        Employee e1= new Employee();
        e1.setEmpName("First Employee");
        e1.setSalary(10000);
        e1.setEmployeeHistory("whole lots of employee hstory here");
        e1.setDob(new Date(1990,5,27));
        e1.setJoiningDate(new Date(2019,9,22));
        
        
        SessionFactory sf= new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(e1);
        session.getTransaction().commit();
        session.close();
        
        Session session2=sf.openSession();
        session2.beginTransaction();
        Employee e1saved= (Employee)session2.get(Employee.class, 1);
        session2.getTransaction().commit();
        session2.close();
        
        System.out.println("saved employee is :->"+e1saved.getEmpName());
        

    }

}
