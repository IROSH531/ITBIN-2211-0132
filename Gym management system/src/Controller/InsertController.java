/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static view.NewMember.jLabel7;

/**
 *
 * @author user
 */
public class InsertController {
    
    public void MemberIncrement(){
        try {
            int id = 1;
            String str1 = String.valueOf(id);
            jLabel7.setText(str1);
            ResultSet rs = new DBSearch().MemberAutoIncrement();
            while (rs.next()) {
                id = rs.getInt(1);
                id = id+1;
                String str = String.valueOf(id);
                jLabel7.setText (str);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public static void AddMember(String id,String NICnumber,String name,String age,String gender,String email,String mobilenumber,String fathername,String mothername,String gymtime,String amount) {
        if (id.equals("") || NICnumber.equals("") || name.equals("") || age.equals("") || gender.equals("") || email.equals("") || mobilenumber.equals("") || fathername.equals("") || mothername.equals("") || gymtime.equals("") || amount.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Fill All the Details", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    else
    {
        new Model.DBInsert().AddMember(id, NICnumber, name, age, gender, email, mobilenumber, fathername, mothername, gymtime, amount);
        JOptionPane.showMessageDialog(null,"Details has been Inserted", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
}
