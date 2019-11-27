package com.test.cascadePersist;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int person_id;

    private String person_name;
    
    @OneToMany(cascade=CascadeType.PERSIST)
    @JoinTable(name="person_taxis", 
    joinColumns=@JoinColumn(name="person_id"),
    inverseJoinColumns=@JoinColumn(name="taxi_id")
     )
    private List<Taxi> listOfTaxi= new ArrayList<Taxi>();

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public List<Taxi> getListOfTaxi() {
        return listOfTaxi;
    }

    public void setListOfTaxi(List<Taxi> listOfTaxi) {
        this.listOfTaxi = listOfTaxi;
    }
}
