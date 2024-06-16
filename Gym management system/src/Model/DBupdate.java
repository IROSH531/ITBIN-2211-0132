/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;


public class DBupdate {
    Statement stmt;
    
    public void UpdateMemberDetails (String NICnumber,String name,String age,String email,String mobilenumber,String fathername,String mothername,String amount,String id)
    { 
        stmt = ConnectionProvider.ConnectDb();
        String query;
        query = String.format("UPDATE member SET NICnumber='%s',name='%s',age='%s',email='%s',mobilenumber='%s',fathername='%s',mothername='%s',amount='%s' WHERE id='%s'",
                NICnumber, name, age, email, mobilenumber, fathername, mothername, amount, id);

        try {
            stmt.executeUpdate(query);
        }
        catch(SQLException ex)
        {
            
        }
    }
    
}
