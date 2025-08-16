package database;

import gui_APP.UserCredentials;

import java.sql.*;
import java.util.Scanner;

public class Update {
    public void modify(String UpdateField, String value,String username){

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Update userinfo set "+ UpdateField+"='"+value+"' where username ="+username ;
            System.out.println(sql);
            stmt.executeUpdate(sql);

            con.close();
            System.out.println("Record Updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
