/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.EmergencyResponseTeam;

/**
 *
 * @author devmi
 */
public class Ersreport {
    private String Diaster_id;
    private double number_ofpplaffected;
    private double number_ofchildaffected;
    private double propertiy_dmg;
    private double number_ofpplcriticalcndition;
    private double number_ofminorinjuries;
    private String startdatetime;
    private String enddatetime;
    private float magnitude;
    private double numberpplmisssing;
    private String Severity;
    private String Description;
    private double immediateadmit;
    private String Status;
    private String Assignedtologid;
    private String logstatus;
    private String disastertype;
    private String city;
    private String state;
        private String ersid;

       public String getErsid() {
        return ersid;
    }

    public void setErsid(String ersid) {
        this.ersid = ersid;
    }
    
    

    public String getDisastertype() {
        return disastertype;
    }

    public void setDisastertype(String disastertype) {
        this.disastertype = disastertype;
    }

    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    

    public String getAssignedtologid() {
        return Assignedtologid;
    }

    public void setAssignedtologid(String Assignedtologid) {
        this.Assignedtologid = Assignedtologid;
    }

    public String getLogstatus() {
        return logstatus;
    }

    public void setLogstatus(String logstatus) {
        this.logstatus = logstatus;
    }
    
    
    

   

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
   

    public String getDiaster_id() {
        return Diaster_id;
    }

    public void setDiaster_id(String Diaster_id) {
        this.Diaster_id = Diaster_id;
    }

    public double getNumber_ofpplaffected() {
        return number_ofpplaffected;
    }

    public void setNumber_ofpplaffected(double number_ofpplaffected) {
        this.number_ofpplaffected = number_ofpplaffected;
    }

    public double getNumber_ofchildaffected() {
        return number_ofchildaffected;
    }

    public void setNumber_ofchildaffected(double number_ofchildaffected) {
        this.number_ofchildaffected = number_ofchildaffected;
    }

    public double getPropertiy_dmg() {
        return propertiy_dmg;
    }

    public void setPropertiy_dmg(double propertiy_dmg) {
        this.propertiy_dmg = propertiy_dmg;
    }

    public double getNumber_ofpplcriticalcndition() {
        return number_ofpplcriticalcndition;
    }

    public void setNumber_ofpplcriticalcndition(double number_ofpplcriticalcndition) {
        this.number_ofpplcriticalcndition = number_ofpplcriticalcndition;
    }

    public double getNumber_ofminorinjuries() {
        return number_ofminorinjuries;
    }

    public void setNumber_ofminorinjuries(double number_ofminorinjuries) {
        this.number_ofminorinjuries = number_ofminorinjuries;
    }

    public String getStartdatetime() {
        return startdatetime;
    }

    public void setStartdatetime(String startdatetime) {
        this.startdatetime = startdatetime;
    }

    public String getEnddatetime() {
        return enddatetime;
    }

    public void setEnddatetime(String enddatetime) {
        this.enddatetime = enddatetime;
    }

    public float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public double getNumberpplmisssing() {
        return numberpplmisssing;
    }

    public void setNumberpplmisssing(double numberpplmisssing) {
        this.numberpplmisssing = numberpplmisssing;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getImmediateadmit() {
        return immediateadmit;
    }

    public void setImmediateadmit(double immediateadmit) {
        this.immediateadmit = immediateadmit;
    }
    
    
    
    public Ersreport(){
        
    }
public Ersreport( String ersid,String Diaster_id,double number_ofpplaffected,double number_ofchildaffected, double propertiy_dmg, double number_ofpplcriticalcndition,double number_ofminorinjuries,String startdatetime, String enddatetime, float magnitude,double numberpplmisssing,String Severity,String Description,double immediateadmit,String assigned_toid, String logstatus,String disastertype,String city,String state,String Status)
{
    this.ersid = ersid;
 this.Diaster_id = Diaster_id;
    this.number_ofpplaffected = number_ofpplaffected;
    this.number_ofchildaffected = number_ofchildaffected;
    this.propertiy_dmg = propertiy_dmg;
    this.number_ofpplcriticalcndition = number_ofpplcriticalcndition;
    this.number_ofminorinjuries = number_ofminorinjuries;
    this.startdatetime = startdatetime;
    this.enddatetime = enddatetime;
    this.magnitude = magnitude;
    this.numberpplmisssing = numberpplmisssing;
    this.Severity = Severity;
    this.Description = Description;
    this.immediateadmit = immediateadmit;
    this.Assignedtologid = assigned_toid;
    this.logstatus = logstatus;
    this.disastertype = disastertype;
    this.city = city;
    this.state = state;
    this.Status = Status;
}

@Override
public String toString(){
        return Diaster_id;
}
}
