package com.test.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.sample.HibernateUtil;

public class SampleCrudDaoImpl implements SampleCrudDao {
    
   
    public void createEmployee(Session session) {
        
        for (int i=0;i<10;i++){
        Employer emp= new Employer();
        emp.setName("name : "+ i);
        session.save(emp);
        }
        
        session.getTransaction().commit();
        
        
       
    }

    public int UpdateEmployee(Session session, int empId) {
        
        session.beginTransaction();
        Employer e1=(Employer)session.get(Employer.class, empId);
        e1.setName("updated name");
        
        session.getTransaction().commit();
        return empId;
    }

    public  void DeleteEmployee(Session session, int empId) {
       
        session.beginTransaction();
        Employer e2=(Employer)session.get(Employer.class, empId);
        session.delete(e2);
        
        session.getTransaction().commit();
    }

}
