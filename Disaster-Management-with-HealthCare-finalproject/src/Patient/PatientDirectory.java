/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Nurse.Nurse;
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
public class PatientDirectory {
    private ArrayList<Patient> patientlists;
    private ArrayList<Patient> patientcompletelists;

    public ArrayList<Patient> getPatientlists() {
        return patientlists;
    }

    public void setPatientlists(ArrayList<Patient> patientlists) {
        this.patientlists = patientlists;
    }

    public ArrayList<Patient> getPatientcompletelists() {
        return patientcompletelists;
    }

    public void setPatientcompletelists(ArrayList<Patient> patientcompletelists) {
        this.patientcompletelists = patientcompletelists;
    }
    

    public ArrayList<Patient> getPatient() {
        return patientlists;
    }

    public void setPatient(ArrayList<Patient> patientlists) {
        this.patientlists = patientlists;
    }

    public PatientDirectory() {
        this.patientlists = new ArrayList<>();
        this.patientcompletelists = new ArrayList<>();
         try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "Rama@$111517105089");

            // Create a statement
            Statement st = conn.createStatement();

            // Define your SQL query
            String sql = "select p.*,s.payment_due,s.annual_income from paitient_record p join paitient_payment s on p.id = s.paitient_id;";

            // Create a prepared statement and execute the query
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            // Process the result set
            while (rs.next()) {
                // Retrieve values from the result set
                int id = rs.getInt("ID");
                String patientName = rs.getString("PatientName");
                String patientDisease = rs.getString("PatientDisease");
                java.sql.Date date = rs.getDate("date");
                String time = rs.getString("time");
                int age = rs.getInt("Age");
                String sex = rs.getString("sex");
                String bloodType = rs.getString("bloodtype");
                String allergies = rs.getString("Allergies");
                boolean needHospitalAdmission = rs.getBoolean("needhospitaladmmission");
                String country = rs.getString("Country");
                String city = rs.getString("City");
                String state = rs.getString("State");
                boolean isAffected = rs.getBoolean("is_affected");
                double annualIncome = rs.getDouble("annual_income");
                double paymentDue = rs.getDouble("payment_due");

                // Create Patient objects and add them to the ArrayLists
                Patient patient = new Patient(id, patientName, patientDisease, date, time, age, sex, bloodType, allergies, needHospitalAdmission, country, city, state, isAffected);
                Patient patientComplete = new Patient(id, patientName, patientDisease, date, time, age, sex, bloodType, allergies, needHospitalAdmission, country, city, state, isAffected, annualIncome, paymentDue);

                patientlists.add(patient);
                patientcompletelists.add(patientComplete);
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
    
    
}
