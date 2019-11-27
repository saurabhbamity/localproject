package com.test.hql;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.crud.Employer;
import com.test.sample.HibernateUtil;

public class MainSelectSample {
    
    public static void main(String[] args) {
        
        
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        
        //Employer is entity and ID is field name
        Query query=session.createQuery("from Employer where Id >5 and name like '%name%'");
        List<Employer> employerList=query.list();
        
        for(int i=0;i<employerList.size();i++)
        {
            System.out.println("employer name is :->"+employerList.get(i).getName());
        }
        
        session.close();
        
        
        //pagination
        
        
        session=sf.openSession();
        
        //Employer is entity and ID is field name
         query=session.createQuery("select name from Employer");
         
         //these two property work as pagination
         query.setFirstResult(5);
         query.setMaxResults(3);
         
        List<String> employerNamelist=query.list();
        
        for(int i=0;i<employerNamelist.size();i++)
        {
            System.out.println("employer name list is :->"+employerNamelist.get(i));
        }
        
        
        Query query2=session.createQuery("select max(Id) from Employer");
        List<Integer> maxId  =query2.list();
        System.out.println("max id count is"+maxId.get(0));
        
        
        //sqlInjection using string
        //this is string param injection
        String minUserId="5"+"or 1=1";
        
         session=sf.openSession();
        
        //Employer is entity and ID is field name
         query=session.createQuery("select name from Employer where Id>"+minUserId);
         
         List<Employer> listemployer=query.list();
         // this complete list of employee
         System.out.println("listemployer size is "+listemployer.size());
         
         //this can be done using the ? which will stop sql injection.
         
         
         Query query3=session.createQuery("select name from Employer where Id>? and name = ?");
         //it will though error as minUserId is string not a integer value
         //query3.setInteger(0, Integer.parseInt(minUserId));
         
         //solution
         String minUserIdAlternative="5";
         query3.setInteger(0, Integer.parseInt(minUserIdAlternative));
         query3.setString(1, "name : 6");
         List<Employer> listEmployer=query3.list();
         
         System.out.println("Actual total List is :->"+listEmployer.size());
         
         
         List<Employer> listemployerquestionmark=query.list();
         // this complete list of employee
         System.out.println("listemployerquestionmark size is "+listemployerquestionmark.size());
         
         //this can be done using the ? which will stop sql injection.
         
         
         Query query4Pramerize=session.createQuery("select name from Employer where Id>:id and name = :name");
         query4Pramerize.setInteger("id", Integer.parseInt(minUserIdAlternative));
         query4Pramerize.setString("name", "name : 6");
         
         List<Employer> listEmployerparam=query4Pramerize.list();
         
         System.out.println("listEmployerparam value is "+listEmployerparam);
         
         
         session.close();
         sf.close();
         
         
         
         
         
    }

}
