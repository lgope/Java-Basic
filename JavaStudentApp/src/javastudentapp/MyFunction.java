/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudentapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lakshman
 */
public class MyFunction {
    public static int countData(String tableName) {
        int total = 0;
        Connection connection = MyConnection.getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
            while (resultSet.next()) {
                total = resultSet.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return total;
    }
}
