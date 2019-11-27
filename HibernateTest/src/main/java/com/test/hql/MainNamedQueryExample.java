package com.test.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.crud.Employer;
import com.test.sample.HibernateUtil;

public class MainNamedQueryExample {
    
    
    public static void main(String[] args) {
        
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("employerById");
        query.setInteger(0, 6);
        
        List<Employer> listEmployer= query.list();
        
        System.out.println("named query output size"+listEmployer.get(0).getName());
        
        
        Query query2=session.getNamedQuery("employerNativeById");
        
        query2.setInteger(0, 7);
        
        //namednative query having the return type mentioned in the mail itself.that guide list the query.list() return which type of object.
        List<Object> listNativeEmployer= query2.list();
        
        System.out.println("named query output size"+((Employer)listNativeEmployer.get(0)).getName());
        
        session.close();
        sf.close();
        
    }

}
