/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anish
 */
import java.sql.*;
public class conn {
    public Connection c;
    public Statement s;
    
    conn()
    {
        try
        {
       Class.forName("com.mysql.jdbc.Driver");
       c=DriverManager.getConnection("jdbc:mysql:///project3","root","");
       s=c.createStatement();
       
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
        
}
