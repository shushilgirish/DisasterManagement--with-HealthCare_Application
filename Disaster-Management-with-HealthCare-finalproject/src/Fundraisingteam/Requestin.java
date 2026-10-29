/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fundraisingteam;

/**
 *
 * @author devmi
 */
public class Requestin {
    
      private String id;
    private String Reason;
       private String Description;
    private double amount;
    private String Status;
    private String Requestedby;
    private double amountraised;
     private String Requestedfrom;
     
     

    public String getRequestedfrom() {
        return Requestedfrom;
    }

    public void setRequestedfrom(String Requestedfrom) {
        this.Requestedfrom = Requestedfrom;
    }
     
     

    public double getAmountraised() {
        return amountraised;
    }

    public void setAmountraised(double amountraised) {
        this.amountraised = amountraised;
    }
    
    

    public String getRequestedby() {
        return Requestedby;
    }

    public void setRequestedby(String Requestedby) {
        this.Requestedby = Requestedby;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Requestin(String id, String Reason, String Description, double amount, String Status, String Requestedby, double amountraised, String Requestedfrom) {
        this.id = id;
        this.Reason = Reason;
        this.Description = Description;
        this.amount = amount;
        this.Status = Status;
        this.Requestedby = Requestedby;
        this.amountraised = amountraised;
        this.Requestedfrom = Requestedfrom;
    }

    public Requestin() {
    }
 
      @Override
public String toString(){
        return id;
}
 
}
