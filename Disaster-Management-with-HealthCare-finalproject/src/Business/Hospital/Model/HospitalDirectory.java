/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Model;

import Business.Hospital.Donor.Donor;
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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalists;

    public ArrayList<Hospital> getHospitalists() {
        return hospitalists;
    }

    public void setHospitalists(ArrayList<Hospital> hospitalists) {
        this.hospitalists = hospitalists;
    }

    public HospitalDirectory() {
        this.hospitalists = new ArrayList<>();
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from hospital_record";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            
            while(rs.next()){
                Hospital  h = new Hospital(rs.getInt("id"),rs.getString("hospital_name"),rs.getString("name"),rs.getString("contact_person"),rs.getString("contact_number"),rs.getString("country"),rs.getString("state"),rs.getString("city"));
                hospitalists.add(h);
              }
            rs.close();
    pstmt.close();
    st.close();
    conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public Hospital FindHospitalbylocation(String city){
        for(Hospital h:hospitalists){
            if(h.getCity().equals(city)){
                return h;
            }
        }
        return null;
    } 
   
}
