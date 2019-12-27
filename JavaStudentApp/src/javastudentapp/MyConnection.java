package javastudentapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lakshman
 */
public class MyConnection {
    public static Connection getConnection() {
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/studentmgdb", "root", "");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return connect;
    }
}
