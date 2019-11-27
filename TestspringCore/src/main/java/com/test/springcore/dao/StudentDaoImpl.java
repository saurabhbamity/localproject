package com.test.springcore.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.test.springcore.dao.mapper.StudentMapper;
import com.test.springcore.dao.model.Student;

@Repository
public class StudentDaoImpl  implements StudentDAO{
    
    
    //private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplateObject; 
    
    @Autowired
    private NamedParameterJdbcTemplate namedparamjdbcTemplate;

    /*@Autowired
    public void setDataSource(DataSource ds) {
        dataSource=ds;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
        
    }*/

    public void create(Integer id, String name, Integer age) {
        
        String SQL = "insert into Student (id, name, age) values (?, ?, ?)";
        jdbcTemplateObject.update( SQL, id, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
        
    }
    
    public void createNamedParam(Integer id, String name, Integer age) {
        
        String SQL = "insert into Student (id, name, age) values (:id, :name, :age)";
        Map namedMap= new HashMap<String, String>();
        namedMap.put("id", id.toString());
        namedMap.put("name", name);
        namedMap.put("age", age.toString());
        
        namedparamjdbcTemplate.update(SQL, namedMap);
        
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
        
    }

    public Student getStudentbyId(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new StudentMapper());

        return student;
    }

    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }

    public void deleteStudentbyId(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    public void updateStudentbyId(Integer id, Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
        
    }
    
    public Student getStudentbyIdNamedParam(Integer id) {
        String SQL = "select * from Student where id = :id";
        Map paramMap= new HashMap();
        paramMap.put("id", id);
        Student student = namedparamjdbcTemplate.queryForObject(SQL, paramMap, Student.class);
        return student;
    }

    public List<Student> listStudentsByQueryBuiler() {
        // TODO Auto-generated method stub
        return null;
    }

    public void updateStudentbyIdQuerBuiler(Integer id, Integer age) {
        // TODO Auto-generated method stub
        
    }

    public void batchInsertStudent(final List<Student> studentList) {
        
        String sql = "INSERT INTO student " +
                "(NAME, AGE) VALUES (?, ?)";
                        
           jdbcTemplateObject.batchUpdate(sql, new BatchPreparedStatementSetter() {
            
            public void setValues(PreparedStatement ps, int i)
                    throws SQLException {
                Student student = studentList.get(i);
                ps.setString(1, student.getName());
                ps.setInt(2, student.getAge() );
                
            }
            
            public int getBatchSize() {
                // TODO Auto-generated method stub
                return studentList.size();
            }
        }); 
    }

}
