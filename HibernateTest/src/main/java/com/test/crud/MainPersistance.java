package com.test.crud;

import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.sample.HibernateUtil;

/*
 * this main method to describe the transit, persist and detached state
 */
public class MainPersistance {
    
    
    public static void main(String[] args) {
        
        
        Employer e3= new Employer();
        e3.setName("first saurabh");
        
        Employer e4= new Employer();
        e3.setName("first chanchal");
        
        //object e3 is created, so e3 is in trasit state.
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        
        //after session.save(e3), object e3 is in persist state
        session.beginTransaction();
        
        session.save(e3);
        
        e3.setName("updated name");
        
        session.getTransaction().commit();
      
      // object e3 is in persist state, though user is not committing the changes , so it  do not goes in database
        e3.setName("updated name again");
        
        //*********from persisted to transient state**************
        
        session.beginTransaction();
        
        //persisted state
        Employer e5= (Employer)session.get(Employer.class, 2);
        System.out.println("e5 retieved"+e5.getName());
        //after delete transient state
        session.delete(e5);
        
        session.getTransaction().commit();
        
      //here start the e3 is in detached state, after session.close.
        session.close();
        sf.close();
    }

}
