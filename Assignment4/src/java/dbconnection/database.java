/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

/**
 *
 * @author admin
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class database {
    
    public Statement st;
    
    public void connect()
    {
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fileupload?zeroDateTimeBehavior=convertToNull","root","");
             st = con.createStatement();
            
            System.out.println("connected");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
   
    
}
