/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurse;

import Business.Hospital.Accountant.Accountant;
import Business.Hospital.Doctor.Doctor;
import Business.Model.Supplier.Supplier;
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
public class NurseDirectory {
    private ArrayList<Nurse> Nurselists;
    
    public ArrayList<Nurse> getNurselists() {
        return Nurselists;
    }

    public void setNurselists(ArrayList<Nurse> Nurselists) {
        this.Nurselists = Nurselists;
    }
    public NurseDirectory() {
        this.Nurselists = new ArrayList<>();
        
         try{ Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from nurse_record";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
               Nurse n = new Nurse(rs.getInt("ID"),rs.getString("name"),rs.getInt("prof_exp"));
                Nurselists.add(n);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    }

    
