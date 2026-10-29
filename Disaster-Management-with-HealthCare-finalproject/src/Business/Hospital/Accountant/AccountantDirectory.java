/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Accountant;

import java.util.ArrayList;

/**
 *
 * @author shush
 */
public class AccountantDirectory {
    private ArrayList<Accountant> accountlists;

    public ArrayList<Accountant> getAccountlists() {
        return accountlists;
    }

    public void setAccountlists(ArrayList<Accountant> accountlists) {
        this.accountlists = accountlists;
    }

    public AccountantDirectory() {
        this.accountlists=new ArrayList<>();
    }
    
}
