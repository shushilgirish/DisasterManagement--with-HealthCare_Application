/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Doctor;

/**
 *
 * @author shush
 */
public class Doctor {
    private int patient_id;
    private String DoctorName;
    private String Specialization;
    private int weekly_workedhours;
    private double monthly_income;

    public int getWeekly_workedhours() {
        return weekly_workedhours;
    }

    public void setWeekly_workedhours(int weekly_workedhours) {
        this.weekly_workedhours = weekly_workedhours;
    }

    public double getMonthly_income() {
        return monthly_income;
    }

    public void setMonthly_income(double monthly_income) {
        this.monthly_income = monthly_income;
    }

    public Doctor(int patient_id, String DoctorName, String Specialization) {
        this.patient_id = patient_id;
        this.DoctorName = DoctorName;
        this.Specialization = Specialization;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public Doctor(int patient_id, String DoctorName, String Specialization, int weekly_workedhours, double monthly_income) {
        this.patient_id = patient_id;
        this.DoctorName = DoctorName;
        this.Specialization = Specialization;
        this.weekly_workedhours = weekly_workedhours;
        this.monthly_income = monthly_income;
    }
    
    
    
}
