package com.test.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.sample.HibernateUtil;

public class mainInheritance {

    public static void main(String[] args) {
        
        SessionFactory sf=null;
        Session session=null;
        Vehicle v1= new Vehicle();
        v1.setVehicle_name("car");
        
        
        TwoWheeler tw= new TwoWheeler();
        tw.setVehicle_name("bike");
        tw.setSteeringHandleType("handle");
        
        
        FourWheeler fw= new FourWheeler();
        fw.setVehicle_name("four wheeler");
        fw.setSteeringWheelType("round streering");
        
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            session.beginTransaction();

            session.save(v1);
            session.save(tw);
            session.save(fw);

            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
            sf.close();
            System.out.println("Closing the program");
        }

    }

}
