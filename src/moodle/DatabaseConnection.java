
package moodle;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 17206 Nathalia Braga
 */
public class DatabaseConnection {

public static Connection getConnection(){
    
    Connection con = null;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Moodle17206Nathalia","root","Veralice13$");
        
    }catch(Exception ex){
        System.out.println(ex.getMessage());
    }
    
    return con;
}
}

