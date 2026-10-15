/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Accountant;

import Business.Hospital.Doctor.Doctor;
import Nurse.Nurse;
import Patient.Patient;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shush
 */
public class Accountant {
    
// Attributes
    private int id;
    private String name;
    private Map<Business.Hospital.Doctor.Doctor, Double> DoctorsSalaries;
    private Map<Nurse, Double> NurseSalaries;
    private Map<Patient, Double> patientExpenses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Doctor, Double> getDoctorsSalaries() {
        return DoctorsSalaries;
    }

    public void setDoctorsSalaries(Map<Doctor, Double> DoctorsSalaries) {
        this.DoctorsSalaries = DoctorsSalaries;
    }

    public Map<Nurse, Double> getNurseSalaries() {
        return NurseSalaries;
    }

    public void setNurseSalaries(Map<Nurse, Double> NurseSalaries) {
        this.NurseSalaries = NurseSalaries;
    }

    public Map<Patient, Double> getPatientExpenses() {
        return patientExpenses;
    }

    public void setPatientExpenses(Map<Patient, Double> patientExpenses) {
        this.patientExpenses = patientExpenses;
    }

   
   
 
    // Add or update patient expense
    public void setPatientExpense(Patient patient, double expense) {
        patientExpenses.put(patient, expense);
    }
 
    
    // Tally total expenses for all patients
    public double calculateTotalPatientExpenses() {
        return patientExpenses.values().stream().mapToDouble(Double::doubleValue).sum();
    }
    
   
}
