/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Model;


import Business.Hospital.Accountant.AccountantDirectory;
import Business.Hospital.Doctor.DoctorDirectory;
import Business.Hospital.Donor.DonorDirectory;
import Business.Model.Supplier.SupplierDirectory;
import Business.WorkQueue.WorkQueue;
import Nurse.NurseDirectory;
import Patient.PatientDirectory;
import UserInterface.DonorViewJPanel;
import java.math.BigInteger;

/**
 *
 * @author shush
 */
public class Hospital {
    private int hospital_id;
    private String hospital_name;
    private String name;
    private String  contact_person;
    private String contact_number;
    private long hospital_revenue;
    private DoctorDirectory Doctors;
    private String country;
    private String state;
    private String city;
    private Patient.PatientDirectory Patients;
    private Business.Hospital.Donor.DonorDirectory Donors;
    private Business.Hospital.Accountant.AccountantDirectory Accountants;
    private Business.Hospital.Model.MedicalDevicesDirectory medicalDevicesDirectory;
    private MedicinalProductDirectory medicinalProductDirectory; 
    private Business.WorkQueue.WorkQueue WorkQueue;
    private NurseDirectory Nurses;
    private SupplierDirectory Suppliers;

    public NurseDirectory getNurses() {
        return Nurses;
    }

    public void setNurses(NurseDirectory Nurses) {
        this.Nurses = Nurses;
    }

    public SupplierDirectory getSuppliers() {
        return Suppliers;
    }

    public void setSuppliers(SupplierDirectory Suppliers) {
        this.Suppliers = Suppliers;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private Nurse.NurseDirectory nurseDirectory;
    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public DoctorDirectory getDoctors() {
        return Doctors;
    }

    public void setDoctors(DoctorDirectory Doctors) {
        this.Doctors = Doctors;
    }

    public PatientDirectory getPatients() {
        return Patients;
    }

    public void setPatients(PatientDirectory Patients) {
        this.Patients = Patients;
    }

    public DonorDirectory getDonors() {
        return Donors;
    }

    public void setDonors(DonorDirectory Donors) {
        this.Donors = Donors;
    }

    public AccountantDirectory getAccountants() {
        return Accountants;
    }

    public void setAccountants(AccountantDirectory Accountants) {
        this.Accountants = Accountants;
    }

    public MedicalDevicesDirectory getMedicalDevicesDirectory() {
        return medicalDevicesDirectory;
    }

    public void setMedicalDevicesDirectory(MedicalDevicesDirectory medicalDevicesDirectory) {
        this.medicalDevicesDirectory = medicalDevicesDirectory;
    }

    public MedicinalProductDirectory getMedicinalProductDirectory() {
        return medicinalProductDirectory;
    }

    public void setMedicinalProductDirectory(MedicinalProductDirectory medicinalProductDirectory) {
        this.medicinalProductDirectory = medicinalProductDirectory;
    }

    public WorkQueue getWorkQueue() {
        return WorkQueue;
    }

    public void setWorkQueue(WorkQueue WorkQueue) {
        this.WorkQueue = WorkQueue;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NurseDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public Hospital(int hospital_id, String hospital_name, String name, String contact_person, String contact_number, String country, String state, String city) {
        this.hospital_id = hospital_id;
        this.hospital_name = hospital_name;
        this.name = name;
        this.contact_person = contact_person;
        this.contact_number = contact_number;
        this.medicalDevicesDirectory = new MedicalDevicesDirectory();
        this.medicinalProductDirectory = new MedicinalProductDirectory();
        this.WorkQueue = new WorkQueue();
        this.Nurses = new NurseDirectory();
        this.Patients = new PatientDirectory();
        this.Doctors = new DoctorDirectory();
        this.Donors = new DonorDirectory();
        this.Suppliers = new SupplierDirectory();
        this.Accountants = new AccountantDirectory();
        this.country = country;
        this.state = state;
        this.city = city;
        
    }

   

          
}
