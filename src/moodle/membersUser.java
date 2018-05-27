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
public class membersUser {
    
    
    private String memberID;
    private String memberFullName;
    private String memberPhone;    
    
    
    public membersUser(String memberID, String memberFullName, String memberPhone){
   
        this.memberID = memberID;
        this.memberFullName = memberFullName;
        this.memberPhone = memberPhone;
}

public String getMemberID(){
    return memberID;
}

public String getMemberFullName(){
    return memberFullName;
}

public String getMemberPhone(){
    return memberPhone;
}
    
}
