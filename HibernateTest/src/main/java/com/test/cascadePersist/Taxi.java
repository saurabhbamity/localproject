package com.test.cascadePersist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
public class Taxi {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int taxi_id;
    
    private String taxi_brand;
    
    //@ManyToOne
    //@JoinColumn(name="taxi_owner")
    //private Person taxiowner;

    public int getTaxi_id() {
        return taxi_id;
    }

    public void setTaxi_id(int taxi_id) {
        this.taxi_id = taxi_id;
    }

    public String getTaxi_brand() {
        return taxi_brand;
    }

    public void setTaxi_brand(String taxi_brand) {
        this.taxi_brand = taxi_brand;
    }

    /*public Person getTaxiowner() {
        return taxiowner;
    }

    public void setTaxiowner(Person taxiowner) {
        this.taxiowner = taxiowner;
    }*/

}
