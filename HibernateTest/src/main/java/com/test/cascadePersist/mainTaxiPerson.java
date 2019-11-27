package com.test.cascadePersist;

import org.hibernate.Session;

import com.test.sample.HibernateUtil;

public class mainTaxiPerson {

    public static void main(String[] args) {
        
        Person businessman= new Person();
        businessman.setPerson_name("Kalra");
        
        Taxi taxi1=new Taxi();
        taxi1.setTaxi_brand("amaze");
        
        
        Taxi taxi2=new Taxi();
        taxi2.setTaxi_brand("tata Indica");
        
        Taxi taxi3=new Taxi();
        taxi3.setTaxi_brand("breeza");
        
        Taxi taxi4=new Taxi();
        taxi4.setTaxi_brand("tyota");
        
        Taxi taxi6=new Taxi();
        taxi6.setTaxi_brand("i10");
        
        //adding the taxis to person.
        businessman.getListOfTaxi().add(taxi1);
        businessman.getListOfTaxi().add(taxi2);
        businessman.getListOfTaxi().add(taxi3);
        businessman.getListOfTaxi().add(taxi4);
        businessman.getListOfTaxi().add(taxi6);
        
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        /*session.save(businessman);
        session.save(taxi1);
        session.save(taxi2);
        session.save(taxi3);
        session.save(taxi4);
        session.save(taxi6);*/

        session.persist(businessman);
        session.getTransaction().commit();
        
        session.close();

    }

}
