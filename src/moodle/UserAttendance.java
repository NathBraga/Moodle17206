


package moodle;

/**
 *
 * @author 17206 Nathalia Braga
 */
public class UserAttendance {
    
    
    private String studentID;
    private String courseSubject;
    private String attendanceDate;
    private int attendance; 
    
    
    
    public UserAttendance(String studentID, String courseSubject, String attendanceDate, int attendance){
   
        this.studentID = studentID;
        this.courseSubject = courseSubject;
        this.attendanceDate = attendanceDate;
        this.attendance = attendance;
}

public String getStudentID(){
    return studentID;
}

public String getCourseSubject(){
    return courseSubject;
}

public String getAttendanceDate(){
    return attendanceDate;
}

public double getAttendance(){
    return attendance;
}
    
}
