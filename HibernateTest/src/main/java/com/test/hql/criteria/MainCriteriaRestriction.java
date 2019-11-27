package com.test.hql.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.test.crud.Employer;
import com.test.sample.HibernateUtil;

public class MainCriteriaRestriction {
    
    public static void main(String[] args) {
        
        
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        
        Criteria criteria=session.createCriteria(Employer.class);
        criteria.add(Restrictions.eq("Id", 6));
        
        List<Employer> listEmployer=criteria.list();
        
        session.getTransaction().commit();
        
        System.out.println("this is the list value:-> "+listEmployer.get(0).getName());
        
        session.beginTransaction();
        
        Criteria criteria2= session.createCriteria(Employer.class);
        criteria2.add(Restrictions.like("name", "%updated%")).
                  add(Restrictions.gt("Id", 4)).
                  add(Restrictions.or(Restrictions.between("Id", 1, 3), Restrictions.between("Id", 5, 9)));
        
        List<Employer> listEmp= criteria2.list();
        
        System.out.println("this is by many Restriction formula"+listEmp.get(0).getName());
        
        session.getTransaction().commit();
        
        //projection Example
        session.beginTransaction();
        
        Criteria criteria3= session.createCriteria(Employer.class).
                                    setProjection(Projections.property("Id"))
                                    .add(Restrictions.eq("Id", 6));
        List<Integer> listEmplId=criteria3.list();
        System.out.println("listEmplId is "+listEmplId.get(0).toString());
        
        Criteria criteria4= session.createCriteria(Employer.class).
                setProjection(Projections.max("Id"))
                .add(Restrictions.eq("Id", 6));
        
        criteria4.list();
        
        Criteria criteria5= session.createCriteria(Employer.class).
                addOrder(Order.desc("Id"));
        
        criteria5.list();
        
        
        session.close();
        
    }

}
