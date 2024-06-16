
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBSearch {
    Statement stmt = null;
    ResultSet result = null;
    
    public ResultSet MemberAutoIncrement(){      
        stmt = ConnectionProvider.ConnectDb();      
        try {
            String query = "select id from member";
            result = stmt.executeQuery(query);
                
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return result;
    }
    
    public ResultSet MemberSearch(String id){      
        stmt = ConnectionProvider.ConnectDb();      
        try {
            String query = ("select *from member where id = '"+id+"'");
            result = stmt.executeQuery(query);
                
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return result;
    }
    
    public ResultSet MemberAll(){      
        stmt = ConnectionProvider.ConnectDb();      
        try {
            String query = ("select * from member");
            result = stmt.executeQuery(query);
                
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return result;
    }
    
    //Member Payments
    public ResultSet MemberPayById(String id){      
        stmt = ConnectionProvider.ConnectDb();      
        try {
            String query = ("select * from payment where id = '"+id+"'");
            result = stmt.executeQuery(query);
                
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return result;
    }
}
