

package moodle;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 17206 Nathalia Braga
 */
public class studentIDU {
    
    public void studentInDelUp(char operation, String studentID, String studentFName, String studentLName, String studentPhone, String courseName, String branch) throws SQLException{
        
        Connection con;
        con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Moodle17206Nathalia","root","Veralice13$");
         
       // Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            
            try {
                ps = (PreparedStatement) con.prepareStatement("INSERT INTO student(studentID, studentFName, studentLName, studentPhone, courseName, branch ");
     
                ps.setString(1, studentID);
                ps.setString(2, studentFName);
                ps.setString(3, studentLName);
                ps.setString(4, studentPhone);
                ps.setString(5, courseName);
                ps.setString(6, branch);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Student Confirmed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(studentIDU.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
        }
            
}
