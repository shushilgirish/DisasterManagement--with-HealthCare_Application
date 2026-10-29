package Business.Hospital.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MedicalDevicesDirectory {
    private ArrayList<MedicalDevices> medicalDevices;

    public ArrayList<MedicalDevices> getMedicalDevices() {
        return medicalDevices;
    }

    public void setMedicalDevices(ArrayList<MedicalDevices> medicalDevices) {
        this.medicalDevices = medicalDevices;
    }

    public MedicalDevicesDirectory() {
        medicalDevices = new ArrayList<>();
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from medical_equipment";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            
            while(rs.next()){
                Business.Hospital.Model.MedicalDevices  m = new Business.Hospital.Model.MedicalDevices(rs.getInt("productid"),rs.getString("productName"),rs.getDouble("price"),rs.getString("deviceType"),rs.getInt("supplier_id"));
                medicalDevices.add(m);
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
