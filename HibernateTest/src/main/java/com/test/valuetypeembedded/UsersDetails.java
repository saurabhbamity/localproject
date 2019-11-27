package com.test.valuetypeembedded;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS_DETAILS")
public class UsersDetails {
    
    @Column(name="USER_ID")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
    
    @Column(name="USER_NAME")
    private String username;
    
    @Column(name="CREATED_BY")
    private String createdBy;
    
    @Column(name="CREATED_DATE")
    private Date createdDate;
    
    @Embedded
    @AttributeOverrides({
    @AttributeOverride(name="street", column=@Column(name="OFFICE_STREET_NAME")),
    @AttributeOverride(name="city", column=@Column(name="OFFICE_CITY_NAME")),
    @AttributeOverride(name="pincode", column=@Column(name="OFFICE_PIN_CODE")),
    @AttributeOverride(name="country", column=@Column(name="OFFICE_country_loc")),
    })
    private Address officeaddress;
    
    @Embedded
    private Address address;
 
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getCreatedBy() {
        return createdBy;
    }
 
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
 
    public Date getCreatedDate() {
        return createdDate;
    }
 
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
 
    public int getUserId() {
        return userId;
    }
 
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public Address getOfficeaddress() {
        return officeaddress;
    }

    public void setOfficeaddress(Address officeaddress) {
        this.officeaddress = officeaddress;
    }

}
