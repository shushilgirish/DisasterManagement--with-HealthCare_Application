/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author devmi
 */
public class Reportforlogistics {
    private String Diaster_id;
    private double number_ofvolunteers;
    private double number_ofvehicles;
    private double propertiy_sheltertobuils;
    private double compensatation;
    private double foodpackets;
    private String Medicalsupplies;
    private double blankets;
    private String assignidlog;
    private String Status;
    private String Disastername;
    private String descri;
    private String city;
    private String id;
    private String govid;
    private String gov_status;

    public String getGovid() {
        return govid;
    }

    public void setGovid(String govid) {
        this.govid = govid;
    }

    public String getGov_status() {
        return gov_status;
    }

    public void setGov_status(String gov_status) {
        this.gov_status = gov_status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  
    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    public String getDisastername() {
        return Disastername;
    }

    public void setDisastername(String Disastername) {
        this.Disastername = Disastername;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
    
    

    public String getDiaster_id() {
        return Diaster_id;
    }

    public void setDiaster_id(String Diaster_id) {
        this.Diaster_id = Diaster_id;
    }

    public double getNumber_ofvolunteers() {
        return number_ofvolunteers;
    }

    public void setNumber_ofvolunteers(double number_ofvolunteers) {
        this.number_ofvolunteers = number_ofvolunteers;
    }

    public double getNumber_ofvehicles() {
        return number_ofvehicles;
    }

    public void setNumber_ofvehicles(double number_ofvehicles) {
        this.number_ofvehicles = number_ofvehicles;
    }

    public double getPropertiy_sheltertobuils() {
        return propertiy_sheltertobuils;
    }

    public void setPropertiy_sheltertobuils(double propertiy_sheltertobuils) {
        this.propertiy_sheltertobuils = propertiy_sheltertobuils;
    }

    public double getCompensatation() {
        return compensatation;
    }

    public void setCompensatation(double compensatation) {
        this.compensatation = compensatation;
    }

    public double getFoodpackets() {
        return foodpackets;
    }

    public void setFoodpackets(double foodpackets) {
        this.foodpackets = foodpackets;
    }

  
    public String getMedicalsupplies() {
        return Medicalsupplies;
    }

    public void setMedicalsupplies(String Medicalsupplies) {
        this.Medicalsupplies = Medicalsupplies;
    }

    public double getBlankets() {
        return blankets;
    }

    public void setBlankets(double blankets) {
        this.blankets = blankets;
    }

    public String getAssignidlog() {
        return assignidlog;
    }

    public void setAssignidlog(String assignidlog) {
        this.assignidlog = assignidlog;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Reportforlogistics(String assignidlog,String Diaster_id, double number_ofvolunteers, double number_ofvehicles, double propertiy_sheltertobuils, double compensatation, double foodpackets, String Medicalsupplies, double blankets, String Status, String descri, String city, String govid, String gov_status) {
        this.assignidlog = assignidlog;
        this.Diaster_id = Diaster_id;
        this.number_ofvolunteers = number_ofvolunteers;
        this.number_ofvehicles = number_ofvehicles;
        this.propertiy_sheltertobuils = propertiy_sheltertobuils;
        this.compensatation = compensatation;
        this.foodpackets = foodpackets;
        this.Medicalsupplies = Medicalsupplies;
        this.blankets = blankets;
        this.Status = Status;
        this.descri = descri;
        this.city = city;
        this.govid = govid;
        this.gov_status = gov_status;
    }

    public Reportforlogistics() {
    }
   
    @Override
public String toString(){
        return assignidlog;
}
}
