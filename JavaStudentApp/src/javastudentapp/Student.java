/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudentapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lakshman
 */
public class Student {
    public void insertUpdateDeleteStudents(String operation, String id, String first_name, String last_name, String gender,
                                                                           String birthdate, String phoneNum, String address) {
        
        Connection connect = MyConnection.getConnection();
        PreparedStatement ps;
        
        
        if (operation.equalsIgnoreCase("insert")) {
            try {
                ps = connect.prepareStatement("INSERT INTO student(id, first_name, last_name, gender, birthdate, phoneNum, address) VALUES (?,?,?,?,?,?,?)"); // Sql query for data insert
                
                ps.setString(1, id);
                ps.setString(2, first_name);
                ps.setString(3, last_name);
                ps.setString(4, gender);
                ps.setString(5, birthdate);
                ps.setString(6, phoneNum);
                ps.setString(7, address);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New student added!");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
         if (operation.equalsIgnoreCase("update")) {
            try {
                ps = connect.prepareStatement("UPDATE `student` SET `first_name`= ?, `last_name`= ?, `gender`= ?, `birthdate`= ?, `phoneNum`= ?, `address`= ? WHERE `id`= ?"); // Sql query for update data
                
                
                ps.setString(1, first_name);
                ps.setString(2, last_name);
                ps.setString(3, gender);
                ps.setString(4, birthdate);
                ps.setString(5, phoneNum);
                ps.setString(6, address);
                ps.setString(7, id);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Student info updated!");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
         
         if (operation.equalsIgnoreCase("delete")) {
            try {
                ps = connect.prepareStatement("DELETE FROM `student` WHERE `id` = ?"); // Sql query for delete data           
                ps.setString(1, id);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Student info deleted!");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
         
    }
    
    public void fillStudentsJtable(JTable table, String valueToSearch) {
        Connection connect = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = connect.prepareStatement("SELECT * FROM `student` WHERE CONCAT(`id`, `first_name`, `last_name`, `gender`, `birthdate`, `phoneNum`, `address`)LIKE ?"); // sql query for similar search
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet resultSet = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            Object[] row;
            
            while(resultSet.next()) {
                row = new Object[7];
                row[0] = resultSet.getString(1);
                row[1] = resultSet.getString(2);
                row[2] = resultSet.getString(3);
                row[3] = resultSet.getString(4);
                row[4] = resultSet.getString(5);
                row[5] = resultSet.getString(6);
                row[6] = resultSet.getString(7);
                
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
