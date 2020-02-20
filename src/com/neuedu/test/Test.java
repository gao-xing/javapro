package com.neuedu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by 高星 on 2020/2/7.
 */
public class Test {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/a24?useUnicode&characterEncoding=utf8";
        String username="root";
        String password="123456";
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName ("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection (url,username,password);
            pstmt= con.prepareStatement ("INSERT INTO student(name,age,gender) VALUES('王石',5,0)");
            int i=pstmt.executeUpdate ();
            System.out.println (i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }finally {
            try {
                if (pstmt!=null)
                   pstmt.close ();
                if (con!=null)
                    con.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
    }
}
