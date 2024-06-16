/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBInsert;
import Model.DBupdate;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UpdateController {
    
    
    
    
    
    public static void MemberDetailsFromId(String NICnumber,String name,String age,String email,String mobilenumber,String fathername,String mothername,String amount, String id)
    {
    if (id.equals("") || NICnumber.equals("") || name.equals("") || age.equals("") || email.equals("") || mobilenumber.equals("") || fathername.equals("") || mothername.equals("") || amount.equals("") || id.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Not Update");
    }
    else
    {
        new DBupdate().UpdateMemberDetails(NICnumber, name, age, email, mobilenumber, fathername, mothername, amount, id);
        JOptionPane.showMessageDialog(null,"Update Successfully");
    }
    }
    
    public static void Addpayment(String PaymentId, String id,String month,String amount) {
        new DBInsert().AddPayments(PaymentId, id, month, amount);
        JOptionPane.showMessageDialog(null,"Update Successfully");
    }
}
