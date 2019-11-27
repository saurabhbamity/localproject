package com.test.crud;

import javax.naming.Name;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
@Table(name="employers")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name="employerById", query="from Employer where Id=?")
@NamedNativeQuery(name="employerNativeById", query="select * from EMPLOYERS where emp_Id=?",resultClass=Employer.class)
public class Employer {
    
    @Id
    @Column(name="emp_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
    
    @Column(name="emp_name")
    private String name;
    
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    

}
