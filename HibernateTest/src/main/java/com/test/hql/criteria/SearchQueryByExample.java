package com.test.hql.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.test.crud.Employer;
import com.test.sample.HibernateUtil;

public class SearchQueryByExample {

    public static void main(String[] args) {
        
        
        Employer emp= new Employer();
        //primary key is ignored by the Query by Example.   
        emp.setId(6);
        emp.setName("updated name%");
        
        Example example= Example.create(emp).enableLike();
        
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session= sf.openSession();
        session.beginTransaction();
        
        Criteria criteria=session.createCriteria(Employer.class).add(example);
        List<Employer> listEmployer=(List<Employer>)criteria.list();
        
        System.out.println("result name "+listEmployer.get(0).getName());
        System.out.println("list size is "+listEmployer.size());
        
        session.close();
        sf.close();
        

    }

}
