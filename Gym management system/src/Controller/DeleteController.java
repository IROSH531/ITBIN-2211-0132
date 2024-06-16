/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBdelete;
import javax.swing.JOptionPane;
import view.UpdateDeleteMember;



/**
 *
 * @author user
 */
public class DeleteController {
    
    public static void DeleteUser (String id){
        int a=JOptionPane.showConfirmDialog(null,"Do You Really Want to Delete this Member","Warning",JOptionPane.YES_NO_OPTION);     //in this show massage to user to ask wont to delete member
        
        if (a==0)
        {
            id = UpdateDeleteMember.jTextField1.getText();
            new DBdelete().DeleteMember(id); //this is delete code part
            JOptionPane.showMessageDialog(null,"Delete Successfully");
        }
    }
}
