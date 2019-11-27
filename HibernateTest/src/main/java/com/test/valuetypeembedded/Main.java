package com.test.valuetypeembedded;

import java.util.Date;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.test.sample.HibernateUtil;
import com.test.sample.Test;

public class Main {
    
    private static Logger logger = Logger.getLogger(Test.class);
    
    public static void main(String[] args) {
        
    
    Session session=null;
    try{
    session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    UsersDetails user = new UsersDetails();

    //user.setUserId(12);
    user.setUsername("M6");
    user.setCreatedBy("G6");
    user.setCreatedDate(new Date());
    
    //home address
    Address ad= new Address();
    ad.setCity("ggn");
    ad.setPincode("123456");
    ad.setStreet("street1");
    ad.setCountry("India");
    
    //office address
    Address oad= new Address();
    oad.setCity("Del");
    oad.setPincode("110078");
    oad.setStreet("street2");
    oad.setCountry("india");
    
    user.setAddress(ad);
    user.setOfficeaddress(oad);
    
    session.save(user);
    session.getTransaction().commit();
    System.out.println("created a user Details with name "+user.getUsername()+"commit done");
    logger.debug("created a user details with name "+user.getUsername()+"commit done");
    session.close();
    
    session=HibernateUtil.getSessionFactory().openSession();
    UsersDetails usd=(UsersDetails)session.get(UsersDetails.class, 11);
    
    
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
