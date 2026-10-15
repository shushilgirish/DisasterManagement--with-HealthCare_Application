/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.util.Date;

/**
 *
 * @author shush
 */
public class Patient {
    private int paitient_id;
    private String PatientName;
    private String PatientDisease;
    private Date date;
    private String time;
    private int Age;  
    private String sex;
    private String bloodtype;
    private String Allergies;
    private boolean needhospitaladmmission;
    private String Country;
    private String City;
    private String State;
    private boolean is_affected;   
    private double  annual_income;
    private double  payment_due;

    public double getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(double annual_income) {
        this.annual_income = annual_income;
    }

    public double getPayment_due() {
        return payment_due;
    }

    public void setPayment_due(double payment_due) {
        this.payment_due = payment_due;
    }
    

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAllergies() {
        return Allergies;
    }

    public void setAllergies(String Allergies) {
        this.Allergies = Allergies;
    }

    public boolean isNeedhospitaladmmission() {
        return needhospitaladmmission;
    }

    public void setNeedhospitaladmmission(boolean needhospitaladmmission) {
        this.needhospitaladmmission = needhospitaladmmission;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public boolean isIs_affected() {
        return is_affected;
    }

    public void setIs_affected(boolean is_affected) {
        this.is_affected = is_affected;
    }

    public Patient(int paitient_id, String PatientName, String PatientDisease, Date date, String time, int Age, String sex, String bloodtype, String Allergies, boolean needhospitaladmmission, String Country, String City, String State, boolean is_affected) {
        this.paitient_id = paitient_id;
        this.PatientName = PatientName;
        this.PatientDisease = PatientDisease;
        this.date = date;
        this.time = time;
        this.Age = Age;
        this.sex = sex;
        this.bloodtype = bloodtype;
        this.Allergies = Allergies;
        this.needhospitaladmmission = needhospitaladmmission;
        this.Country = Country;
        this.City = City;
        this.State = State;
        this.is_affected = is_affected;
    }
    

   
    
    public int getPaitient_id() {
        return paitient_id;
    }

    public void setPaitient_id(int paitient_id) {
        this.paitient_id = paitient_id;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientDisease() {
        return PatientDisease;
    }

    public void setPatientDisease(String PatientDisease) {
        this.PatientDisease = PatientDisease;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

   

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public Patient(int paitient_id, String PatientName, String PatientDisease, Date date, String time, int Age, String sex, String bloodtype, String Allergies, boolean needhospitaladmmission, String Country, String City, String State, boolean is_affected, double annual_income, double payment_due) {
        this.paitient_id = paitient_id;
        this.PatientName = PatientName;
        this.PatientDisease = PatientDisease;
        this.date = date;
        this.time = time;
        this.Age = Age;
        this.sex = sex;
        this.bloodtype = bloodtype;
        this.Allergies = Allergies;
        this.needhospitaladmmission = needhospitaladmmission;
        this.Country = Country;
        this.City = City;
        this.State = State;
        this.is_affected = is_affected;
        this.annual_income = annual_income;
        this.payment_due = payment_due;
    }
    

}