package com.test.springcore.aspact;

public interface CustomerBo {
    
    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);

}
