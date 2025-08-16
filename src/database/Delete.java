package database;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    public void pop(String LKey) {


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Delete from productlist where licence_key ='"+LKey+"'";

            stmt.executeUpdate(sql);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
