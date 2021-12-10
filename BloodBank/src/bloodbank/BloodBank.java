/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class BloodBank {
    
    static Connection con= null;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
        // TODO code application logic here
        
      public static Connection db(){  
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=BLOOD_BANK_MANAGEMENT_SYSTEM;user=sa;password=samithasan";
        
        con = DriverManager.getConnection(url);
        
        
        String sql = "Select * from City ";
            PreparedStatement pst = con.prepareStatement(sql);
            System.out.println("samit");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int id = rs.getInt("City_ID");
                String name = rs.getString("City_name");
                System.out.println(id+"  "+name);
            }

        }catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
 
           

         }
        return con;
      }
    
}
