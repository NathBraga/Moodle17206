

package moodle;

/**
 *
 * @author 17206 Nathalia Braga
 */
public class ResultsUser {
    
    private String studentID;
    private String courseSubject;
    private String exame;
    private double result; 
    
    
    public ResultsUser(String studentID, String courseSubject, String exame, double result){
   
        this.studentID = studentID;
        this.courseSubject = courseSubject;
        this.exame = exame;
        this.result = result;
}

public String getStudentID(){
    return studentID;
}

public String getCourseSubject(){
    return courseSubject;
}

public String getExame(){
    return exame;
}

public double getResult(){
    return result;
}
    
}
