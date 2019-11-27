package com.test.springcore.beanFactoryPostProcessor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

/*
 * Classic example to use existing bean factorypost processor provided by spring core. this is used to get
 * some token values from file and use them as required.
 * for understanding purpose I have
 */
public class JDBCExample {
    
    private String url;
    private String username;
    private String password;
    
    @Value("${jdbc.driver}")
    private String driverName;
    
    @Value("test value")
    private String testvalue;
    
    
    @Value("${jdbc.driver.value.test:Default.driver}")
    private String defaultdriverValue;
    
    // getting system variable values.
    
    @Value("${java.home}")
    private String javaHome;
        
    @Value("${path}")
    private String path;
    
    
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    Connection connection = null;
    
    public JDBCExample()
    {
        super();
    }
    public JDBCExample(String url, String username, String password)
    {
        super();
        this.url = url;
        this.username = username;
        this.password = password;
    }
    
    public void setUrl(String url)
    {
        this.url = url;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
  //both 's' and 'v' values will be 'Test' 
    @Value("Test")
    public void printValues(String s, String v){
        System.out.println("value of s is "+s+"value of v is :"+v);
    } 
    
    @Value("#{systemProperties['JAVA_HOME']}")
    private String systemJavaHome;
    
    public void connect()
    {
        try
        {
            //playing with @value annotation
            System.out.println("default driver value that does not exit in property file is : "+defaultdriverValue);
            
            // display system variable
            System.out.println("system java.home is "+systemJavaHome);
            System.out.println("path directory is "+path);
            System.out.println("java home directory is "+path);
            
            
            //jdbc connection code start
            Class.forName(driverName);
            System.out.println("testname is from @testvalue is : "+testvalue);
            connection = DriverManager.getConnection(url, username,password );
            PreparedStatement ps = connection.
                prepareStatement("select * from employee");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
            return;
        }
    }

}
