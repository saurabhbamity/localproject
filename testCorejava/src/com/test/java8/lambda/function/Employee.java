package com.test.java8.lambda.function;

public class Employee {
    
    private int salary;
    
    private boolean girlFriend;
    
    public Employee(int salary, boolean girlFriend)
    {
        this.salary=salary;
        this.girlFriend= girlFriend;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean hasGirlFriend() {
        return girlFriend;
    }

    public void setGirlFriend(boolean girlFriend) {
        this.girlFriend = girlFriend;
    }

}
