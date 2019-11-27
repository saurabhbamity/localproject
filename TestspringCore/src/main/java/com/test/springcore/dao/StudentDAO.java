package com.test.springcore.dao;

import java.util.List;

import javax.sql.DataSource;

import com.test.springcore.dao.model.Student;

public interface StudentDAO {
    
    /** 
     * This is the method to be used to initialize
     * database resources ie. connection.
  */
  //public void setDataSource(DataSource ds);
  
  /** 
     * This is the method to be used to create
     * a record in the Student table.
  */
  public void create(Integer id, String name, Integer age);
  
  
  /** 
   * This is the method to be used to create
   * a record in the Student table.
  */
  public void createNamedParam(Integer id, String name, Integer age);
  
  
  
  /** 
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
  */
  public Student getStudentbyId(Integer id);
  
  
  /** 
   * This is the method to be used to list down
   * a record from the Student table corresponding
   * to a passed student id.
  */
  public Student getStudentbyIdNamedParam(Integer id);
  
  /** 
     * This is the method to be used to list down
     * all the records from the Student table.
  */
  public List<Student> listStudents();
  
  
  /** 
   * This is the method to be used to list down
   * all the records from the Student table.
   */
  public List<Student> listStudentsByQueryBuiler();
  
  /** 
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
  */
  public void deleteStudentbyId(Integer id);
  
  /** 
     * This is the method to be used to update
     * a record into the Student table.
  */
  public void updateStudentbyId(Integer id, Integer age);
  
  
  /** 
   * This is the method to be used to update
   * a record into the Student table.
  */
  public void updateStudentbyIdQuerBuiler(Integer id, Integer age);
  
  
  /** 
   * This is the method to be used to create
   * a record in the Student table.
   */
  public void batchInsertStudent(List<Student> studentList);
  

}
