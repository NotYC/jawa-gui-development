package database;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Select extends JFrame {

    public String username ;
    public String first ;
    public String second ;
    public String email ;
    public int check(String user, String pass) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Select * from userinfo where username = '"+user+"'";

            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()) {

                if (rs.getString(5).equals(pass)) {
                    return 1;
                }else{
                    return -1;
                }
            }else{
                return -2;
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
        return 0;
    }
    public void check(String user) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Select * from userinfo where username = '"+user+"'";

            ResultSet rs=stmt.executeQuery(sql);
            if (rs.next()) {
                username = rs.getString(1);
                first = rs.getString(2);
                second = rs.getString(3);
                email = rs.getString(4);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    public int check(int num,String LKey){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Select * from productlist";

            ResultSet rs=stmt.executeQuery(sql);
            List ar = new ArrayList();


            while(rs.next()){
                ar.add(rs.getString(1));
            }
            if(ar.contains(LKey)){
                return 1;
            }else{
                return 0;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    return 1;
    }
    public List check(int n, int m, String usr) {

        List ar = new ArrayList();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mainhudon");
            Statement stmt = con.createStatement();
            String sql = "Select * from productinfo where username = '"+usr+"'";

            ResultSet rs=stmt.executeQuery(sql);


            while(rs.next()){
                ar.add(rs.getString(4));
            }

            return ar;






        } catch (Exception e) {
            e.printStackTrace();

        }
        return ar;
    }
}
