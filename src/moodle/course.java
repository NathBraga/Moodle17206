/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import moodle17206.User;

/**
 *
 * @author 17206 Nathalia Braga
 */
public class course {
    
    public void courseInDelUp(char operation, String courseName, int courseHours, String courseSubject1, String courseSubject2){
        
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            
            try {
                ps = (PreparedStatement) con.prepareStatement("INSERT INTO course(courseName, courseHours, courseSubject1, courseSubject2");
     
                ps.setString(1, courseName);
                ps.setInt(2, courseHours);
                ps.setString(3, courseSubject1);
                ps.setString(4, courseSubject2);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Course Confirmed");
                }
            } catch (SQLException ex) {
              Logger.getLogger(studentIDU.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
            if(operation == 'd'){
            
            try {
                ps = (PreparedStatement) con.prepareStatement("\"DELETE FROM Moodle17206Nathalia.Course WHERE CourseName = ?");
     
                ps.setString(1, courseName);
                ps.setInt(2, courseHours);
                ps.setString(3, courseSubject1);
                ps.setString(4, courseSubject2);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Course Deleted");
                }
            } catch (SQLException ex) {
              Logger.getLogger(studentIDU.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
            
            }
         }
    
    public void courseTable(JTable cRegTable){
        
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        
        try{
           ps = (PreparedStatement) con.prepareStatement("SELECT * FROM 'Course'");
           ResultSet rs = ps.executeQuery();
      
           DefaultTableModel model = (DefaultTableModel) cRegTable.getModel();
           Object[] row;
           
           while(rs.next()){
               row = new Object[4];
               row[0] = rs.getString(1);
               row[1] = rs.getInt(2);
               row[2] = rs.getString(3);
               row[3] = rs.getString(4);
               
               model.addRow(row);
           }
       
           
        }catch(Exception ex){
            Logger.getLogger(course.class.getName()).log(Level.SEVERE,null, ex);
        }

    }

}
