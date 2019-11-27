package com.test.cache;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.crud.Employer;
import com.test.sample.HibernateUtil;

public class SecondLevelCache {
    
    
    
 public static void main(String[] args) {
        
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session1= sf.openSession();
        session1.beginTransaction();
        
        Employer e1= (Employer)session1.get(Employer.class, 6);
        
        System.out.println("emplyer name for e1"+e1.getName());
        
        session1.close();
       
        Session session2= sf.openSession();
        session2.beginTransaction();
        
        Employer e2= (Employer)session2.get(Employer.class, 6);
        
        System.out.println("emplyer name for e2"+e2.getName());
        
        // query Executed twice to do it one time,configure the cache
        //no two select query will be executed.
        session2.close();
        
        
        Session session3= sf.openSession();
        session3.beginTransaction();
        
        Query query=session3.createQuery("from Employer where Id=7");
        query.setCacheable(true);
        List<Employer> listEmpler=(List<Employer>)query.list();
        
        System.out.println("ListEmployer"+listEmpler.get(0).getName());   
        session3.close();
        
        Session session4= sf.openSession();
        session4.beginTransaction();
        
        Query query2=session4.createQuery("from Employer where Id=7");
        query2.setCacheable(true);
        List<Employer> listEmpler2=(List<Employer>)query2.list();
        System.out.println("ListEmployer"+listEmpler2.get(0).getName());
        
        session4.close();
        sf.close();
     }

}
