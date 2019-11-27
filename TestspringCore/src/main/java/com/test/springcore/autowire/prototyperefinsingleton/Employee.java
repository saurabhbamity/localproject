package com.test.springcore.autowire.prototyperefinsingleton;

public class Employee {

    private String fullName;
    private Department department;
    
    public Employee(Department department)
    {
        this.department = department;
    }
     
    
 
    public Department getDepartment() {
        return department;
    }
 
    public void setDepartment(Department department) {
        this.department = department;
    }
 
    public String getFullName() {
        return fullName;
    }
 
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
