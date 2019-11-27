package com.test.onetoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class HostelOwner {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int HostelOwnerId;
    
    @Column(name="Hostel_Owner_name")
    private String HostelOwnerName;
    
    @OneToMany(mappedBy="hostelOwner")
    //@OneToMany
    /*@JoinTable(name="hostel_Hostller_relation", 
    joinColumns=@JoinColumn(name="hostel_owner_ID"),
    inverseJoinColumns=@JoinColumn(name="hostller_Id")
     )*/
    private List<Hosteller> ListOfHosteller= new ArrayList<Hosteller>();

    public List<Hosteller> getListOfHosteller() {
        return ListOfHosteller;
    }

    public void setListOfHosteller(List<Hosteller> listOfHosteller) {
        ListOfHosteller = listOfHosteller;
    }

    public int getHostelOwnerId() {
        return HostelOwnerId;
    }

    public void setHostelOwnerId(int hostelOwnerId) {
        HostelOwnerId = hostelOwnerId;
    }

    public String getHostelOwnerName() {
        return HostelOwnerName;
    }

    public void setHostelOwnerName(String hostelOwnerName) {
        HostelOwnerName = hostelOwnerName;
    }
}
