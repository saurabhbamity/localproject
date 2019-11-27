package com.test.onetoMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Hosteller {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int hosteller_ID;
    
    /*@ManyToOne
    @JoinColumn(name="Hostel_Owner_Id")*/
    @ManyToOne
    @JoinColumn(name="hostel_id")
    @NotFound(action=NotFoundAction.IGNORE)
    private HostelOwner hostelOwner;
    
    public HostelOwner getHostelOwner() {
        return hostelOwner;
    }

    public void setHostelOwner(HostelOwner hostelOwner) {
        this.hostelOwner = hostelOwner;
    }

    public int gethosteller_ID() {
        return hosteller_ID;
    }

    public void sethosteller_ID(int hosteller_ID) {
        this.hosteller_ID = hosteller_ID;
    }

    public String getHostellerName() {
        return hostellerName;
    }

    public void setHostellerName(String hostellerName) {
        this.hostellerName = hostellerName;
    }

    @Column(name="Hosteller_name")
    private String hostellerName;
    
}
