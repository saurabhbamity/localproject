package com.test.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.crud.Employer;
import com.test.sample.HibernateUtil;

public class FirstLevelCache {

    public static void main(String[] args) {
        
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session= sf.openSession();
        session.beginTransaction();
        
        Employer e1= (Employer)session.get(Employer.class, 6);
        
        System.out.println("emplyer name for e1"+e1.getName());
        
        
        Employer e2= (Employer)session.get(Employer.class, 6);
        
        System.out.println("emplyer name for e2"+e2.getName());
        
        //no two select query will be executed.
        
        
        //Second Example 
        
        Employer e3= (Employer)session.get(Employer.class, 3);
        
        System.out.println("emplyer name for e3:->"+e3.getName());
        
        e3.setName("Updated value");
        
        Employer e4= (Employer)session.get(Employer.class, 3);
        
        System.out.println("emplyer name for e4"+e4.getName());
        //select  and Update Query Executed just , no select Query Executed as 
        //employer is in the cache
        
        session.close();
        sf.close();
    }

}
