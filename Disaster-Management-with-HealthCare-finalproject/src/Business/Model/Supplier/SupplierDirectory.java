/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model.Supplier;

import Business.Hospital.Model.FoodProducts;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shush
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierlists;

    public ArrayList<Supplier> getSupplierlists() {
        
        return supplierlists;
    }

    public void setSupplierlists(ArrayList<Supplier> supplierlists) {
        this.supplierlists = supplierlists;
    }
    public Supplier AddSupplier(int Supplier_id, int age, String phonenumber, String Supplier_Name, double ratings){
     Supplier sp  = new Supplier(Supplier_id, age,phonenumber,Supplier_Name,ratings);
     supplierlists.add(sp);
     return sp;
    }
    public SupplierDirectory(){
      
         this.supplierlists = new ArrayList<>();
         try{ Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from supplier_record";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
               Supplier sp = new Supplier(rs.getInt("ID"),rs.getInt("age"),rs.getString("phonenumber"),rs.getString("supplier_name"),rs.getDouble("ratings"));
                supplierlists.add(sp);
                System.out.print(sp.getAge());
                                System.out.print("null");

            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
   
}
