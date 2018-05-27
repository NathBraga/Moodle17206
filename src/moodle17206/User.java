

package moodle17206;

/**
 *
 * @author 17206 Nathalia Braga
 */
public class User {

    private String courseName;
    private String studentID;
    private String studentFName;
    private String studentLName;
    private String studentPhone;
    private String branch; 
    
    
    public User(String studentID, String studentFName, String studentLName, String studentPhone, String branch ,String courseName){
   
        this.studentID = studentID;
        this.studentFName = studentFName;
        this.studentLName = studentLName;
        this.studentPhone = studentPhone;
        this.branch = branch;
        this.courseName = courseName;
      
}

public String getStudentID(){
    return studentID;
}

public String getStudentFName(){
    return studentFName;
}

public String getStudentLName(){
    return studentLName;
}

public String getStudentPhone(){
    return studentPhone;
}

public String getBranch(){
    return branch;
}

public String getCourseName(){
    return courseName;
}    

}
