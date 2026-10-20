/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Donor;

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
public class DonorDirectory {
    private ArrayList<Donor> donorlists;

    public DonorDirectory() {
        this.donorlists= new ArrayList<>();
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from donor_record";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            
            while(rs.next()){
//                Object o[]={rs.getInt("id"),rs.getString("donor_name"),rs.getString("donor_type"),rs.getString("blood_type"),rs.getInt("donor_age"),rs.getString("health_condition"),rs.getString("organ_donation")};
                Donor d = new Donor(rs.getInt("id"),rs.getString("donor_name"),rs.getString("donor_type"),rs.getString("blood_type"),rs.getInt("donor_age"),rs.getString("donor_gender"),rs.getString("health_condition"),rs.getString("organ_donation"));
                donorlists.add(d);
                
            }
            rs.close();
    pstmt.close();
    st.close();
    conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public ArrayList<Donor> getDonorlists() {
        return donorlists;
    }

    public void setDonorlists(ArrayList<Donor> donorlists) {
        this.donorlists = donorlists;
    }
    
    public Donor AddDonor(int donor_id, String donor_name, String donor_type, String blood_type, int donor_age, String donor_gender, String health_condition, String organ_donation){
    Donor d = new Donor(donor_id, donor_name, donor_type, blood_type, donor_age, donor_gender, health_condition, organ_donation);
    donorlists.add(d);
    return d;
    } 
    
    public Donor FindDonorbyid(int id){
        for(Donor d:donorlists){
            if(d.getDonor_id() == id){
                return d;
            }
        }
        return null;
    }
}
