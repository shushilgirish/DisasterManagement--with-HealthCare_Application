/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.EmergencyResponseTeam;

/**
 *
 * @author devmi
 */
public class Ersteam {
    
    String ersteamname;
    int team_ers_count;
    String stateofers;

    public String getErsteamname() {
        return ersteamname;
    }

    public void setErsteamname(String ersteamname) {
        this.ersteamname = ersteamname;
    }

    public int getTeam_ers_count() {
        return team_ers_count;
    }

    public void setTeam_ers_count(int team_ers_count) {
        this.team_ers_count = team_ers_count;
    }

    public String getStateofers() {
        return stateofers;
    }

    public void setStateofers(String stateofers) {
        this.stateofers = stateofers;
    }
    
    public Ersteam(){
        
    }
    
    public Ersteam(String ersteamname, int team_ers_count, String stateofers)
    {
        this.ersteamname = ersteamname;
        this.team_ers_count = team_ers_count;
        this.stateofers = stateofers;
        
    }
    
    @Override
public String toString(){
        return ersteamname;
}
}
