package com.test.sample;
 
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
 
public class Test {
    
    static{
        System.out.println("Before log4j configuration");
        //DOMConfigurator.configure("log4j.properties");
        System.out.println("After log4j configuration");
    }
    private static Logger logger = Logger.getLogger(Test.class);
    
    public static void main(String[] args) {
        
        Session session=null;
        try{
        session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        Users user = new Users();
 
        user.setUserId(10);
        user.setUsername("M6");
        user.setCreatedBy("G6");
        user.setCreatedDate(new Date());
        
        session.save(user);
        session.getTransaction().commit();
        System.out.println("created a user with name "+user.getUsername()+"commit done");
        logger.debug("created a user with name "+user.getUsername()+"commit done");
        //session.close();
        }catch(Exception ex)
        {
            System.out.println("Exception is "+ex);
            logger.error("Exception is "+ex);
            
        }
        finally {
            session.close();
            logger.info("closing session");
        }
 
    }
}