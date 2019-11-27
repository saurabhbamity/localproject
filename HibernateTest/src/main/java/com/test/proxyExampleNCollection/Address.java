package com.test.proxyExampleNCollection;

import javax.persistence.Embeddable;


@Embeddable
public class Address {
    
    private String city;
    private String street;
    private int flatNo;
    
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getFlatNo() {
        return flatNo;
    }
    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }
}
