package com.test.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface SampleCrudDao {
    
    
    public void createEmployee(Session sf);
    public int UpdateEmployee(Session sf, int empId);
    public  void DeleteEmployee(Session session , int empId);

}
