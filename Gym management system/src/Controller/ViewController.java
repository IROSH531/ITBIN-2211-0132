
package Controller;

import Model.ConnectionProvider;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewController {
    
    public void loadTable(DefaultTableModel model){
        try{
            ResultSet rs = new DBSearch().MemberAll();
            Object columnData[] = new Object[11];
            while (rs.next()){
                columnData[0] = rs.getString("id");
                columnData[1] = rs.getString("NICnumber");
                columnData[2] = rs.getString("name");
                columnData[3] = rs.getString("age");
                columnData[4] = rs.getString("gender");
                columnData[5] = rs.getString("Email");
                columnData[6] = rs.getString("mobilenumber");
                columnData[7] = rs.getString("fathername");
                columnData[8] = rs.getString("mothername");
                columnData[9] = rs.getString("gymtime");
                columnData[10] = rs.getString("amount");
                model.addRow(columnData);
            }
           // model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
        
        } catch (SQLException e){
            
        }
    }
    
    public void loadPayTable(DefaultTableModel model, String id){
        
        try {
            ResultSet rs = new DBSearch().MemberPayById(id);
            while(rs.next()) {
                String month = rs.getString("month");
                String amount = rs.getString("amount");
                String tableData[] ={month, amount};
                model.addRow(tableData);
            }

        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
