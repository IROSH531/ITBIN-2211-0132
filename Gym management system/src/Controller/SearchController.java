
package Controller;

import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.UpdateDeleteMember;
import view.payment;

public class SearchController {
    
    public static void MemberSearch(String id){
        if(id.length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter a Member's Id", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try{
                ResultSet rs = new DBSearch().MemberSearch(id);
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(null, "Member Id does not Exit", "Error", JOptionPane.ERROR_MESSAGE);
                    UpdateDeleteMember.jTextField1.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Member Id has Found", "Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex){
                
            }
        }
    }
    
    public static void ShowMembers(String id){
        
        try{
            ResultSet rs = new DBSearch().MemberSearch(id);
            while(rs.next()) {
                String name = rs.getString("name");
                String nic = rs.getString("NICnumber");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String email = rs.getString("Email");
                String mnum = rs.getString("mobilenumber");
                String fathername = rs.getString("fathername");
                String mothername = rs.getString("mothername");
                String time = rs.getString("gymtime");
                String amount = rs.getString("amount");
                
                UpdateDeleteMember.jTextField1.setEditable(false);
                UpdateDeleteMember.jTextField10.setEditable(false);
                UpdateDeleteMember.jTextField5.setEditable(false);
                
                UpdateDeleteMember.jTextField3.setText(name);
                UpdateDeleteMember.jTextField2.setText(nic);
                UpdateDeleteMember.jTextField4.setText(age);
                UpdateDeleteMember.jTextField5.setText(gender);
                UpdateDeleteMember.jTextField6.setText(email);
                UpdateDeleteMember.jTextField7.setText(mnum);
                UpdateDeleteMember.jTextField8.setText(fathername);
                UpdateDeleteMember.jTextField9.setText(mothername);
                UpdateDeleteMember.jTextField10.setText(time);
                UpdateDeleteMember.jTextField11.setText(amount);
                
            }
        } catch (SQLException ex){
            
        }
    }
    
    //Payment Part
    public static void PayMemberSearch(String id, int checkid){
        
        try {
            ResultSet rs = new DBSearch().MemberSearch(id);
            while(rs.next())
            {
                checkid=1;
                payment.jTextField1.setEditable(false);
                payment.jTextField2.setText(rs.getString(3));
                payment.jTextField3.setText(rs.getString(7));
                payment.jTextField4.setText(rs.getString(6));
                payment.jTextField5.setText(rs.getString(11));
            }
            if(checkid==0)
            {
                JOptionPane.showMessageDialog(null,"Member Id does not Exist");
                
            ResultSet rs1 = new DBSearch().MemberPayById(id);
            DefaultTableModel tbl = (DefaultTableModel)payment.jTable1.getModel();
            while(rs1.next())
            {
                payment.jButton3.setVisible(false);
                JOptionPane.showMessageDialog(null,"payment is already done for this month");
                String paymentid = rs.getString("id");
                String name = rs.getString("month");
                String amount = rs.getString("amount");
                
                String tbData[]={paymentid, name, amount};
                tbl.addRow(tbData);
            }
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
