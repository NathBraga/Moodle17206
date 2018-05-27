/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle;

/**
 *
 * @author 17206 Nathalia Braga
 */
public class StudentCourseUser {
    
    
    private String studentID;
    private String courseName;
    private String branch; 
    
    
    public StudentCourseUser(String studentID, String branch ,String courseName){
   
        this.studentID = studentID;
        this.branch = branch;
        this.courseName = courseName;
      
}

public String getStudentID(){
    return studentID;
}

public String getBranch(){
    return branch;
}

public String getCourseName(){
    return courseName;
}    

}
