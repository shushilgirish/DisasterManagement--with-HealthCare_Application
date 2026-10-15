/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Model;

/**
 *
 * @author shush
 */
public class Vaccine {
     private int vaccineId;
    private String vaccineName;
    private Business.Hospital.Model.Disease disease;

    // Constructor
    public Vaccine(int vaccineId, String vaccineName,Disease disease) {
        this.vaccineId = vaccineId;
        this.vaccineName = vaccineName;
        this.disease =disease;
    }

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

}
