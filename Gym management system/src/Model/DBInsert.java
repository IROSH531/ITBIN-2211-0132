/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.sun.istack.internal.logging.Logger;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import sun.util.logging.PlatformLogger;



public class DBInsert {
    Statement stmt;

    public void AddMember(String id,String NICnumber,String name,String age,String gender,String email,String mobilenumber,String fathername,String mothername,String gymtime,String amount) {
        stmt = ConnectionProvider.ConnectDb();
        String query=String.format("INSERT INTO member(id, NICnumber, name,age,gender,email,mobilenumber,fathername,mothername,gymtime, amount)"
              +"VALUES('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')",id, NICnumber, name,age,gender,email,mobilenumber,fathername,mothername,gymtime, amount);
        
        try {
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void AddPayments(String PaymentId, String id,String month,String amount) {
        stmt = ConnectionProvider.ConnectDb();
        String query=String.format("INSERT INTO payment(paymentId, id, month, amount)"
              +"VALUES('%s','%s','%s','%s')", PaymentId, id, month, amount);
        
        try {
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}