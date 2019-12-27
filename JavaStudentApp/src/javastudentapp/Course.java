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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lakshman
 */
public class Course {

    public void insertUpdateDeleteStudents(String operation, String courseCode, String courseTitle, Integer courseCredit) {

        Connection connect = MyConnection.getConnection();
        PreparedStatement ps;

        if (operation.equalsIgnoreCase("insert")) {
            try {
                ps = connect.prepareStatement("INSERT INTO `course`(`courseCode`, `courseTitle`, `courseCredit`) VALUES (?,?,?)"); // Sql query for course data insert

                ps.setString(1, courseCode);
                ps.setString(2, courseTitle);
                ps.setInt(3, courseCredit);

                if (ps.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "New course added!");
                    
                }

            } catch (SQLException ex) {

                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

         if (operation.equalsIgnoreCase("update")) {
            try {
                ps = connect.prepareStatement("UPDATE `course` SET `courseTitle`= ?,`courseCredit`= ? WHERE `courseCode` = ?"); // Sql query for update data
                
                
                ps.setString(1, courseTitle);
                ps.setInt(2, courseCredit);
                ps.setString(3, courseCode);
                
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

    public boolean isCourseExist(String courseTitle) {
        
        boolean isExist = false;
        
        Connection connect = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = connect.prepareStatement("SELECT * FROM `course` WHERE `courseTitle` = ?"); // sql query for similar search
            ps.setString(1, courseTitle);
            
            ResultSet resultSet = ps.executeQuery();
            
            if(resultSet.next()) {
                isExist = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return isExist;
    }
}
