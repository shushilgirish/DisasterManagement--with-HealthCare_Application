/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Doctor;

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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorlists;
    private ArrayList<Doctor> doctorcompletelist;

    public ArrayList<Doctor> getDoctorcompletelist() {
        return doctorcompletelist;
    }

    public void setDoctorcompletelist(ArrayList<Doctor> doctorcompletelist) {
        this.doctorcompletelist = doctorcompletelist;
    }

    public ArrayList<Doctor> getDoctorlists() {
        return doctorlists;
    }

    public void setDoctorlists(ArrayList<Doctor> doctorlists) {
        this.doctorlists = doctorlists;
    }

    public DoctorDirectory() {
        this.doctorlists =new ArrayList<>();
        this.doctorcompletelist = new ArrayList<>();
       try {
    // Load the MySQL JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Establish a connection to the database
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "Rama@$111517105089");

    // Create a statement
    Statement st = conn.createStatement();

    // Define your SQL query
    String sql = "SELECT p.*, s.weekly_workedhours, s.monthly_income FROM doctor_record p JOIN doctor_salaries s ON p.id = s.doctor_id;";

    // Create a prepared statement and execute the query
    PreparedStatement pstmt = conn.prepareStatement(sql);
    ResultSet rs = pstmt.executeQuery();

    // Process the result set
    while (rs.next()) {
        // Retrieve values from the result set
        int id = rs.getInt("id");
        String doctorName = rs.getString("DoctorName");
        String specialization = rs.getString("Specialization");
        int weeklyWorkedHours = rs.getInt("weekly_workedhours");
        double monthlyIncome = rs.getDouble("monthly_income");

        // Create Doctor objects and add them to the ArrayLists
        Doctor d1 = new Doctor(id, doctorName, specialization, weeklyWorkedHours, monthlyIncome);
        Doctor d = new Doctor(id, doctorName, specialization);
        doctorlists.add(d);
        doctorcompletelist.add(d1);
    }

    // Close the resources
    rs.close();
    pstmt.close();
    st.close();
    conn.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

    }
      public Doctor AddDoctor(int patient_id, String DoctorName, String Specialization){
    Doctor d = new Doctor(patient_id, DoctorName, Specialization);
    return d;
    } 
    
    public Doctor FindDoctorbyid(int id){
        for(Doctor d:doctorlists){
            if(d.getPatient_id()== id){
                return d;
            }
        }
        return null;
    }
    
}
