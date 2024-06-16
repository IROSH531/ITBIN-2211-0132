/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class DBdelete {
    
   Statement stmt; 
    
    
    public void DeleteMember(String id)
    {
        stmt = ConnectionProvider.ConnectDb();
        try{
            stmt.executeUpdate("delete from member where id='"+id+"'");
            
        }
        catch(SQLException ex){
            
        }
    }
}
