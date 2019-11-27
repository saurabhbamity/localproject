package com.test.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.sample.HibernateUtil;

public class mainCrud {
    
    
    public static void main(String[] args) {
        
        SessionFactory sf= null;
        sf=HibernateUtil.getSessionFactory();
        Session session= sf.openSession();
        session.beginTransaction();
        
        try{
            
            SampleCrudDaoImpl sdi= new SampleCrudDaoImpl();
            sdi.createEmployee(session);
            sdi.DeleteEmployee(session, 5);
            sdi.UpdateEmployee(session, 6);
          
            System.out.println("trasection completed");
            
        }catch(Exception ex){
            session.clear();
            session.close();
        }finally {
            session.close();
            if (sf!=null)
            {
                System.out.println("closing sf");
                sf.close();
            }
            
        }
        
    }

}
