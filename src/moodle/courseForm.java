/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
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
import javax.swing.table.TableModel;
import moodle17206.User;

/**
 *
 * @author 17206 Nathalia Braga
 */
public class courseForm extends javax.swing.JFrame {

    /**
     * Creates new form courseForm
     */
    
    
    course co = new course();
    
    
    public courseForm() {
        initComponents();
        ShowCourseTable();
        
    }
    
    //making connection with database
        java.sql.Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps;
     
    //making connection with database
     public Connection getConnection(){
      
      Connection con;
      
      try{
          con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Moodle17206Nathalia","root","Veralice13$");
          //JOptionPane.showMessageDialog(null, "Connected with Database");
          return con;
          
      }catch (Exception e){
          e.printStackTrace();
          return null;
      }
     }

     //making a list to create a class to bring all the courses from database table for Java
     public ArrayList<userCourse> selectCoursesInformations(){
      
      ArrayList<userCourse> coursesInformations = new ArrayList<userCourse>();
      Connection connection = getConnection();
      //JOptionPane.showMessageDialog(null, "Connected with Database");
                    
      String selectCourse = "SELECT * FROM Course";
      Statement st;
      ResultSet rs2;
      
      try{
          st = connection.createStatement();
          rs2 = st.executeQuery(selectCourse);
          userCourse UserCourse;
          
          while(rs2.next()){
              UserCourse = new userCourse(rs2.getString("courseName"), rs2.getInt("courseHours"), rs2.getString("courseSubject1"), rs2.getString("courseSubject2"));
              coursesInformations.add(UserCourse);
          }
      }catch (Exception e){
          e.printStackTrace();
      }
      return coursesInformations;
  }
    
    public void ShowCourseTable(){
      
      ArrayList<userCourse> list = selectCoursesInformations();
      DefaultTableModel model = (DefaultTableModel) cRegTable.getModel();
      Object[] row = new Object[4];
      for(int i = 0; i < list.size(); i++){
          row[0] = list.get(i).getCourseName();
          row[1] = list.get(i).getCourseHours();
          row[2] = list.get(i).getCourseSubject1();
          row[3] = list.get(i).getCourseSubject2();
                  
          model.addRow(row);
          cRegTable.setShowGrid(true);
          cRegTable.setSelectionBackground(Color.green);
        }
  }
 
      PreparedStatement pst;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cRegFieldCourseName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cRegSpinnerHours = new javax.swing.JSpinner();
        bAddCourse = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        coRegSub1 = new javax.swing.JTextField();
        coRegSub2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cRegTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moodle/Icons/school.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel2.setText("Virtual Global College");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("Course Name");

        jLabel7.setText("Hours");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel8.setText("Course Registration");

        cRegSpinnerHours.setModel(new javax.swing.SpinnerNumberModel(100, 100, 600, 1));

        bAddCourse.setBackground(new java.awt.Color(51, 153, 0));
        bAddCourse.setText("ADD");
        bAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddCourseActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Subject 1");

        jLabel5.setText("Subject 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cRegSpinnerHours, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(cRegFieldCourseName, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(coRegSub1)
                                    .addComponent(coRegSub2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(bAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(86, 86, 86))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cRegFieldCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cRegSpinnerHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(coRegSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(coRegSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cRegTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Hours", "Subject 1", "Subject 2"
            }
        ));
        cRegTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cRegTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cRegTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddCourseActionPerformed
                          
          //Code to insert New Course in the table
          DefaultTableModel model = (DefaultTableModel) cRegTable.getModel(); 
            if (!cRegFieldCourseName.getText().trim().equals("")){
                model.addRow(new Object[]{
                    cRegFieldCourseName.getText(),
                    cRegSpinnerHours.getValue().toString(),
                    coRegSub1.getText(),
                    coRegSub2.getText(),
                    
           });
            } else {
                JOptionPane.showMessageDialog(null, "It is missing Information");
                
            } 
            
       
        
           //Add a new course               
            String statement = "INSERT INTO Course VALUES(?,?,?,?)";
            
            try{               
            con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Moodle17206Nathalia","root","Veralice13$");
            pst = (PreparedStatement) con.prepareStatement(statement);
            
            //take the informations typed in the fields in the Course Registration
            pst.setString(1, cRegFieldCourseName.getText());
            pst.setInt(2, Integer.valueOf(cRegSpinnerHours.getValue().toString()));
            pst.setString(3, coRegSub1.getText());
            pst.setString(4, coRegSub2.getText());
            
            if(pst.executeUpdate() > 0){
            
            JOptionPane.showMessageDialog(null, "New Course Inserted!");
            
                       }
            
            } catch (SQLException ex) {
            Logger.getLogger(courseForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_bAddCourseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Delete Course
            try{
            String deleteCourse = "DELETE FROM Moodle17206Nathalia.Course WHERE CourseName = ?";
            con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Moodle17206Nathalia","root","Veralice13$");
            pst = (PreparedStatement) con.prepareStatement(deleteCourse);
            pst.setString(1, cRegFieldCourseName.getText());
                                                   
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Course Deleted!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
            this.dispose();
            //Refresh the Course Registration Form
            courseForm cf = new courseForm();
            cf.setVisible(true);
            cf.pack();
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cRegTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cRegTableMouseClicked

        //When click in the information of a course, the name of the course goes to the Registration Form
        int i = cRegTable.getSelectedRow();
        TableModel model = cRegTable.getModel();
        
        
        cRegFieldCourseName.setText(model.getValueAt(i,0).toString());
       

    }//GEN-LAST:event_cRegTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(courseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddCourse;
    private javax.swing.JTextField cRegFieldCourseName;
    private javax.swing.JSpinner cRegSpinnerHours;
    private javax.swing.JTable cRegTable;
    private javax.swing.JTextField coRegSub1;
    private javax.swing.JTextField coRegSub2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}