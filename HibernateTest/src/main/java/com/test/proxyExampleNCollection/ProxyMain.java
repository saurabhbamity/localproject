package com.test.proxyExampleNCollection;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.test.sample.HibernateUtil;

public class ProxyMain {

    private static Logger logger = Logger.getLogger(ProxyMain.class);

    public static void main(final String[] args) {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();

            Tanent t = new Tanent();
            t.setName("saurabh");
            t.setTanentID(100);

            Address add1 = new Address();
            add1.setCity("delhi");
            add1.setFlatNo(2);
            add1.setStreet("IGNOU Road");

            Address add2 = new Address();
            add2.setCity("GGN");
            add2.setFlatNo(1100);
            add2.setStreet("Soana Road");

            Address add3 = new Address();
            add3.setCity("pune");
            add3.setFlatNo(901);
            add3.setStreet("cosmos road");

            t.getListofAddress().add(add1);
            t.getListofAddress().add(add2);
            t.getListofAddress().add(add3);

            session.save(t);
            session.getTransaction().commit();
        } catch (Exception ex) {
            logger.error("Exception" + ex);
        } finally {
            session.close();
        }

        // now user wanted to reteive the values and user the list of addresses
        // for tanent
         Tanent t =null;
        try {
            logger.info("**************************************************************************");
            session = HibernateUtil.getSessionFactory().openSession();
             t = (Tanent) session.get(Tanent.class, 1);

            //t.getListofAddress();
            logger.info("tanent name:->" + t.getName());
            //logger.info("tanent address" + t.getListofAddress());

        } catch (Exception ex) {
            logger.error("Exception"+ex);
        } finally {
            session.close();
            
            //this command will show the list of addresses in proxy object.
            logger.info("tanent address size" + t.getListofAddress().size());
        }
    }

}
