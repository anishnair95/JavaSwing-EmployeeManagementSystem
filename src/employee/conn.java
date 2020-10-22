package employee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3308/project12","root","");
            s = c.createStatement();
        }catch(Exception e) {
//            e.printStackTrace();
            System.out.println("Error:"+e);
        }
    }
    
}
 
