/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.Government;

/**
 *
 * @author devmi
 */

public class governor {
    
    private String name;
    private String password;
    private String stateOfGov;
    private String phoneNo; // Changed to String
    private String ssn; // Changed to String
    private String loginId;
    private String emailId;
    private double money;

    public governor(String loginId, String name, String password, String stateOfGov, String phoneNo, String ssn, String emailId, double money) {
        this.name = name;
        this.password = password;
        this.stateOfGov = stateOfGov;
        this.phoneNo = phoneNo;
        this.ssn = ssn;
        this.money = money;
        this.loginId = loginId;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStateOfGov() {
        return stateOfGov;
    }

    public void setStateOfGov(String stateOfGov) {
        this.stateOfGov = stateOfGov;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    

    // ... getters and setters ...

    public governor() {
        // Empty constructor
    }

    // ... rest of the code ...
@Override
public String toString(){
        return loginId;
}
    
    
}
