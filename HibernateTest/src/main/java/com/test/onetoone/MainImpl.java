package com.test.onetoone;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.test.sample.HibernateUtil;


public class MainImpl {
    
    private static Logger logger = Logger.getLogger(MainImpl.class);
    
    public static void main(String[] args) {
        Session session=null;
        try{
        session = HibernateUtil.getSessionFactory().openSession();
        
        
        Student stu= new Student();
        stu.setID(100);
        stu.setName("Saurabh");
        stu.setRollNumber("12121");
        
        Registration res= new Registration();
        res.setRegistationID(10001);
        res.setFeeStructure("Normal");
        res.setStudent(stu);
        
        stu.setRegistration(res);
        
        session.beginTransaction();
        session.save(stu);
        session.save(res);
        session.getTransaction().commit();
        

        }catch(Exception ex){
            logger.error("Error is "+ex.getMessage());
            ex.printStackTrace();
        }
        finally {
            session.close();
        }
        
    }
}
