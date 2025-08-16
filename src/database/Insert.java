package database;

import java.sql.*;
import java.util.Scanner;

public class Insert {
    public int put(String user, String first, String last,String email,String pass){

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Insert into userinfo values('"+user+"','"+first+"','"+last+"','"+email+"','"+pass+"')";

            stmt.executeUpdate(sql);


            con.close();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    public int put(String user, String LKey, String RNum,String CMod,String CCol,int num){

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Insert into productinfo values('"+user+"','"+LKey+"','"+RNum+"','"+CMod+"','"+CCol+"')";

            stmt.executeUpdate(sql);


            con.close();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
}
