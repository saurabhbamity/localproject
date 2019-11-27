package com.test.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
class Registration {

    @JoinColumn(name="student_id")
    @OneToOne
    private Student Student;
    
    @Column(name="reg_id")
    @Id
    private int RegistationID;
    
    @Column(name="fee_structure")
    private String feeStructure;

    
    public Student getStudent() {
        return Student;
    }

    public void setStudent(Student student) {
        Student = student;
    }

    public int getRegistationID() {
        return RegistationID;
    }

    public void setRegistationID(int registationID) {
        RegistationID = registationID;
    }

    public String getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(String feeStructure) {
        this.feeStructure = feeStructure;
    }
}
