package com.test.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Portal {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int portal_id;
    
    
    private String portal_name;
    
    @ManyToMany(mappedBy="listOfPortal")
    private Collection<Customer> listOfCustomer= new ArrayList<Customer>();


    public Collection<Customer> getListOfCustomer() {
        return listOfCustomer;
    }


    public void setListOfCustomer(Collection<Customer> listOfCustomer) {
        this.listOfCustomer = listOfCustomer;
    }


    public int getPortal_id() {
        return portal_id;
    }


    public void setPortal_id(int portal_id) {
        this.portal_id = portal_id;
    }


    public String getPortal_name() {
        return portal_name;
    }


    public void setPortal_name(String portal_name) {
        this.portal_name = portal_name;
    }

}
