/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.SearchandResue;

/**
 *
 * @author devmi
 */
public class Searchandresqueteam {
      private String teamname;
    private String Password;

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getTotalsize() {
        return Password;
    }

    public void setTotalsize(String Password) {
        this.Password = Password;
    }

    public Searchandresqueteam(String teamname, String Password) {
        this.teamname = teamname;
        this.Password = Password;
    }

  
    
    
    
     @Override
public String toString(){
        return teamname;
}
}

