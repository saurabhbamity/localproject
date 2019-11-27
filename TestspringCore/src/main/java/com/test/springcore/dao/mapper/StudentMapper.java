package com.test.springcore.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.springcore.dao.model.Student;

public class StudentMapper implements RowMapper<Student> {

    public Student mapRow(ResultSet rs, int arg1) throws SQLException {
        
       Student student= new Student(1, "saurabh",12);
        student.setId(rs.getInt("ID"));
        student.setName(rs.getString("NAME"));
        student.setAge(rs.getInt("AGE"));
        
        return student;
    }

}
