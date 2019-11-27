package com.test.manytomany;

import org.hibernate.Session;

import com.test.sample.HibernateUtil;

public class MainCustomerPortal {
    
    
    public static void main(String[] args) {
        
        
        Customer cust1= new Customer();
        cust1.setName("saurabh");
        cust1.setDocumentNumber("HGTYH987654");
        
        
        Customer cust2= new Customer();
        cust2.setName("chanchal");
        cust2.setDocumentNumber("VGTFR456321");
        
        Portal port1= new Portal();
        port1.setPortal_name("facebook");
        
        Portal port2= new Portal();
        port2.setPortal_name("amazon");
        
        
        Portal port3= new Portal();
        port3.setPortal_name("netflix");
        
        //saurabh using facebook and amazon
        cust1.getListOfPortal().add(port1);
        cust1.getListOfPortal().add(port2);
        
        //canchal using all three portal
        
        cust2.getListOfPortal().add(port1);
        cust2.getListOfPortal().add(port2);
        cust2.getListOfPortal().add(port3);
        
        Session session=null;
        try{
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.save(port1);
        session.save(port2);
        session.save(port3);
        session.save(cust1);
        session.save(cust2);
       
        session.getTransaction().commit();
        session.close();
        
        
        
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }

}
