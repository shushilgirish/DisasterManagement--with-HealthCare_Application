/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.SearchandResue;

/**
 *
 * @author devmi
 */
public class Volunteers {
    private String eventittle;
    private String Description;
    private String Date;
    private String Location;
    private int volunteersrequired;
    private String Status;
    private String idvol;
    private int nopplsignedup;

    public int getNopplsignedup() {
        return nopplsignedup;
    }

    public void setNopplsignedup(int nopplsignedup) {
        this.nopplsignedup = nopplsignedup;
    }
    
    
    

    public String getEventittle() {
        return eventittle;
    }

    public void setEventittle(String eventittle) {
        this.eventittle = eventittle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getVolunteersrequired() {
        return volunteersrequired;
    }

    public void setVolunteersrequired(int volunteersrequired) {
        this.volunteersrequired = volunteersrequired;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getIdvol() {
        return idvol;
    }

    public void setIdvol(String idvol) {
        this.idvol = idvol;
    }
    
    
    
    public Volunteers(String idvol,String eventittle, String Description, String Date, String Location, int volunteersrequired, String Status, int nopplsignedup) {
        this.eventittle = eventittle;
        this.Description = Description;
        this.Date = Date;
        this.Location = Location;
        this.volunteersrequired = volunteersrequired;
        this.Status = Status;
        this.idvol = idvol;
        this.nopplsignedup = nopplsignedup;
    }

    public Volunteers() {
    }

   
    
      @Override
public String toString(){
        return idvol;
}
    
}
