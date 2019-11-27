package com.test.springcore.autowire.prototyperefinsingleton;

public abstract class EmployeeBeanSingleton {
    
    private String fullName;
   // public abstract DepartmentBeanPrototype createDepartmentBeanPrototype();
    public abstract Department createDepartmentBeanPrototype();
    
    
 
    public String getFullName() {
        return fullName;
    }
 
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
