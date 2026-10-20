/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shush
 */
public class FoodProductDirectory {
    private ArrayList<FoodProducts> foodproducts;

    public ArrayList<FoodProducts> getFoodproducts() {
        return foodproducts;
    }

    public void setFoodproducts(ArrayList<FoodProducts> foodproducts) {
        this.foodproducts = foodproducts;
    }

    public FoodProductDirectory() {
        this.foodproducts = new ArrayList<>();
         
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from foodproducts";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            
            while(rs.next()){
                FoodProducts  m = new FoodProducts(rs.getInt("productid"),rs.getString("productName"),rs.getDouble("price"),rs.getInt("supplier_id"));
                foodproducts.add(m);
              }
            rs.close();
    pstmt.close();
    st.close();
    conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
   
}
