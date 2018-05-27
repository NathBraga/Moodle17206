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
public class userCourse {
    
    private String courseName;
    private int courseHours;
    private String courseSubject1;
    private String courseSubject2;
    
    public userCourse(String courseName, int courseHours, String courseSubject1, String courseSubject2){
   
        this.courseName = courseName;
        this.courseHours = courseHours;
        this.courseSubject1 = courseSubject1;
        this.courseSubject2 = courseSubject2;
}


public String getCourseName(){
    return courseName;
}    

public int getCourseHours(){
    return courseHours;
    
}

public String getCourseSubject1(){
    return courseSubject1;
}

public String getCourseSubject2(){
    return courseSubject2;
}
}
