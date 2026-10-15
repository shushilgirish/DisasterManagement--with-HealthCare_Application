/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fundraisingteam;

/**
 *
 * @author devmi
 */
public class Fundigteam {
    
    private String teamname;
    private String Password;

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   public Fundigteam(String teamname, String Password) {
        this.teamname = teamname;
        this.Password = Password;
    }
    
     public Fundigteam(){
    
}
    
}
