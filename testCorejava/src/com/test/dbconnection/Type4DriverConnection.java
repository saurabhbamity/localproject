package com.test.dbconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Type4DriverConnection {

    public static void main(String[] args) {

        try {

            Connection conn = getDataBaseConnection();

            // step3 create the statement object
            Statement stmt = conn.createStatement();
            String sqlquery="select * from employee where id=? and name=?";
            PreparedStatement pstmt = conn.prepareStatement(sqlquery);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "saurabh");
            System.out.println("pstmt"+pstmt.toString());

            // step4 execute query
            ResultSet rs = stmt.executeQuery("select * from employee");
            ResultSet rs1 = pstmt.executeQuery();
            //No option to provide run time values- bind variables option not available
            //ResultSet rs = stmt.executeQuery("select * from employee where id=?");
            
            //stmt.execute(sql)// just return truem or false
            //stmt.executeUpdate(sql);//for insert, delete and update- return no of rows Effected
            
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            
            while (rs1.next())
                System.out.println(rs1.getInt(1) + "  " + rs1.getString(2) + "  " + rs1.getString(3));

            // step5 close the connection object
            stmt.close();
            pstmt.close();
            
            callableExample(conn);
            conn.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Exception" + ex.getLocalizedMessage());
        }

    }

    private static void callableExample(Connection conn) {
        
        CallableStatement cstmt = null;
        try {
           String SQL = "{call getEmpName (?, ?)}";
           cstmt = conn.prepareCall (SQL);
           cstmt.setInt(1, 2);
           cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
           
        // execute getDBUSERByUserId store procedure
           cstmt.executeUpdate();
           
           String employeeName= cstmt.getString(2);
           System.out.println("result from callable: "+employeeName);
        }
        catch (SQLException e) {
           System.out.println("Exception in calable"+e.getMessage());
        }
        finally {
            try{
          conn.close();
            }catch(SQLException ex)
            {
                System.out.println("aamai"+ex.getMessage());
            }
        }
        
    }

    public static Connection getDataBaseConnection() {
        Connection conn = null;
        try {
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "test");

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

}
