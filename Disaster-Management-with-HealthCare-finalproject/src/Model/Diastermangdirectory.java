/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author devmi
 */
public class Diastermangdirectory {
    
 private String disname;
  private  String state_affec;
  private  String city_name;
  private  String disid;
  private  String status;
  private String idofers;

   public Diastermangdirectory() {
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisid() {
        return disid;
    }

    public void setDisid(String disid) {
        this.disid = disid;
    }

    public String getIdofers() {
        return idofers;
    }

    public void setIdofers(String idofers) {
        this.idofers = idofers;
    }

   
    
  

    public String getId() {
        return disid;
    }

    public void setId(String disid) {
        this.disid = disid;
    }
    
    


    public String getDisname() {
        return disname;
    }

    public void setDisname(String disname) {
        this.disname = disname;
    }

    public String getState_affec() {
        return state_affec;
    }

    public void setState_affec(String state_affec) {
        this.state_affec = state_affec;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    
    public Diastermangdirectory(String dsid,String disname,String state_affec, String city_name,String status,String iddis)
    {
        this.city_name = city_name;
        this.disname = disname;
        this.state_affec = state_affec;
        this.disid = dsid;
        this.status = status;
        this.idofers = iddis;
        
    }
    
    @Override
public String toString(){
        return disid;
}

    
}
