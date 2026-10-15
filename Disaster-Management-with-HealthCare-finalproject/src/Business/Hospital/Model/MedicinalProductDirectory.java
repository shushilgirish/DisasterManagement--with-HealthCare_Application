package Business.Hospital.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MedicinalProductDirectory {
    private ArrayList<MedicinalProduct> medicinalProducts;

    public ArrayList<MedicinalProduct> getMedicinalProducts() {
        return medicinalProducts;
    }

    public void setMedicinalProducts(ArrayList<MedicinalProduct> medicinalProducts) {
        this.medicinalProducts = medicinalProducts;
    }

    public MedicinalProductDirectory() {
        this.medicinalProducts = new ArrayList<>();
        
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from medicinalproduct";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            
            while(rs.next()){
                Business.Hospital.Model.MedicinalProduct  m = new Business.Hospital.Model.MedicinalProduct(rs.getInt("productid"),rs.getString("productName"),rs.getDouble("price"),rs.getString("medicine_type"),rs.getDate("expiry_date"),rs.getInt("supplier_id"));
                medicinalProducts.add(m);
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
