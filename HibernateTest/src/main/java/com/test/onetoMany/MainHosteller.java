package com.test.onetoMany;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.test.sample.HibernateUtil;

public class MainHosteller {

    private static Logger logger = Logger.getLogger(MainHosteller.class);

    public static void main(String[] args) {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            HostelOwner hs = new HostelOwner();
            hs.setHostelOwnerName("Chauhan");
            
            Hosteller host1 = new Hosteller();
            host1.setHostellerName("saurabh");
            host1.setHostelOwner(hs);

            Hosteller host2 = new Hosteller();
            host2.setHostellerName("raj");
            host2.setHostelOwner(hs);

            Hosteller host3 = new Hosteller();
            host3.setHostellerName("Nitin");
            host3.setHostelOwner(hs);
            
            Hosteller host4 = new Hosteller();
            host3.setHostellerName("abhishek");
            
           
            hs.getListOfHosteller().add(host1);
            hs.getListOfHosteller().add(host2);
            hs.getListOfHosteller().add(host3);
            hs.getListOfHosteller().add(host4);

            session.beginTransaction();
            session.save(hs);
            session.save(host1);
            session.save(host2);
            session.save(host3);
            session.save(host4);
            
            session.getTransaction().commit();
            
            System.out.println("commit is done now retrieving the hostller");
            Hosteller hostller=(Hosteller)session.get(Hosteller.class, 9);
            System.out.println("**************"+hostller.getHostelOwner());
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            logger.info("Closing session");
            session.close();
        }

    }

}
