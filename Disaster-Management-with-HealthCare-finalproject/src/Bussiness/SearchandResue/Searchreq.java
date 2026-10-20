/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.SearchandResue;

/**
 *
 * @author devmi
 */
public class Searchreq {
    private String customerid;
    private String decription;
    private String userid;
    private String Subject;
    private String Location;
    private String Nameofuser;
        private String Nameofcustomer;
        private String Date;
        private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
        

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
        
        

    public String getNameofuser() {
        return Nameofuser;
    }

    public void setNameofuser(String Nameofuser) {
        this.Nameofuser = Nameofuser;
    }

    public String getNameofcustomer() {
        return Nameofcustomer;
    }

    public void setNameofcustomer(String Nameofcustomer) {
        this.Nameofcustomer = Nameofcustomer;
    }

        

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

  

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    public Searchreq(String customerid, String decription, String userid, String Subject, String Location, String Nameofuser, String Nameofcustomer, String Date, String status) {
        this.customerid = customerid;
        this.decription = decription;
        this.userid = userid;
        this.Subject = Subject;
        this.Location = Location;
        this.Nameofuser = Nameofuser;
        this.Nameofcustomer = Nameofcustomer;
        this.Date = Date;
        this.status = status;
    }

    public Searchreq() {
    }

@Override
public String toString(){
        return customerid;
}


  
    
}
