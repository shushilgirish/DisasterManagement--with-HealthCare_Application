/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Donor;

/**
 *
 * @author shush
 */
public class Donor {
    private int donor_id;
    private String donor_name;
    private String donor_type;
    private String blood_type;
    private int donor_age;
    private String donor_gender;
    private String health_condition;
    private String organ_donation;

    public Donor(int donor_id, String donor_name, String donor_type, String blood_type, int donor_age, String donor_gender, String health_condition, String organ_donation) {
        this.donor_id = donor_id;
        this.donor_name = donor_name;
        this.donor_type = donor_type;
        this.blood_type = blood_type;
        this.donor_age = donor_age;
        this.donor_gender = donor_gender;
        this.health_condition = health_condition;
        this.organ_donation = organ_donation;
    }

    public int getDonor_id() {
        return donor_id;
    }

    public void setDonor_id(int donor_id) {
        this.donor_id = donor_id;
    }

    public String getDonor_name() {
        return donor_name;
    }

    public void setDonor_name(String donor_name) {
        this.donor_name = donor_name;
    }

    public String getDonor_type() {
        return donor_type;
    }

    public void setDonor_type(String donor_type) {
        this.donor_type = donor_type;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public int getDonor_age() {
        return donor_age;
    }

    public void setDonor_age(int donor_age) {
        this.donor_age = donor_age;
    }

    public String getDonor_gender() {
        return donor_gender;
    }

    public void setDonor_gender(String donor_gender) {
        this.donor_gender = donor_gender;
    }

    public String getHealth_condition() {
        return health_condition;
    }

    public void setHealth_condition(String health_condition) {
        this.health_condition = health_condition;
    }

    public String getOrgan_donation() {
        return organ_donation;
    }

    public void setOrgan_donation(String organ_donation) {
        this.organ_donation = organ_donation;
    }
    
}
