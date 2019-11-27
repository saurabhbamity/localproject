package com.test.proxyExampleNCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Tanent {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int tanentID;
    
    @Column(name="tanent_name")
    private String name;
    
    @ElementCollection(fetch=FetchType.EAGER)
    @JoinTable(name="TanentAddress", 
               joinColumns=@JoinColumn(name="TANENT_ID")
    )
    @GenericGenerator(name="hilo-gen",strategy="hilo")
    @CollectionId(columns={@Column(name="address_id")}, generator="hilo-gen",type=@Type(type="long"))
    private Collection<Address> listofAddress= new ArrayList<Address>();

    public Collection<Address> getListofAddress() {
        return listofAddress;
    }

    public void setListofAddress(Collection<Address> listofAddress) {
        this.listofAddress = listofAddress;
    }

    public int getTanentID() {
        return tanentID;
    }

    public void setTanentID(int tanentID) {
        this.tanentID = tanentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
