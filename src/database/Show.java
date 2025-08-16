package database;

import java.sql.*;


public class Show {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Select * from Nustudent ";
            System.out.println(sql);
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
                System.out.println(rs.getString(1)+" "+rs.getString(2));

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
