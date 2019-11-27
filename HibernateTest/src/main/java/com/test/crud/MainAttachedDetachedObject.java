package com.test.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.sample.HibernateUtil;

public class MainAttachedDetachedObject {

    public static void main(String[] args) {
        
        
        Employer e1= new Employer();
        e1.setName("first saurabh");
        //object e1 is created, so e3 is in trasit state.
        
       
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        //after session.save(e3), object e3 is in persist state
        session.save(e1);
        e1.setName("second saurabh");
        session.getTransaction().commit();
        session.close();
        
        //Object e1 is deteched.
        
        e1.setName("detached saurabh");
        
        session=sf.openSession();
        session.beginTransaction();
        e1.setName("saurabh before attached");
        //Object e1 is persisted after Update is called, this update will run each time update is called
        //because hibernate is not sure what if state of the object is changed or not, this can be avoided 
        //using the hibernate "@entity" annotation property "selectBeforeUpdate".
        session.update(e1);
        e1.setName("saurabh after attached");
        session.getTransaction().commit();
        session.close();
        
        
        session=sf.openSession();
        session.beginTransaction();
        
       
        session.update(e1);
        //only select query is executed, as not update in happen in e1, so no update fired.
        session.getTransaction().commit();
        session.close();
        sf.close();
    }

}
