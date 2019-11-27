package com.test.sample;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="Employee_Details")
public class Employee {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int empId;
    
    @Column(name="emp_name")
    private String empName;
    
    @Column(name="date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dob;
    
    @Column(name="Joining_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date JoiningDate;
    
    @Transient
    private long Salary;
    
    @Column(name="history")
    @Basic(fetch=FetchType.EAGER)
    private String employeeHistory;
    
    
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getJoiningDate() {
        return JoiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        JoiningDate = joiningDate;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public String getEmployeeHistory() {
        return employeeHistory;
    }

    public void setEmployeeHistory(String employeeHistory) {
        this.employeeHistory = employeeHistory;
    }
}
