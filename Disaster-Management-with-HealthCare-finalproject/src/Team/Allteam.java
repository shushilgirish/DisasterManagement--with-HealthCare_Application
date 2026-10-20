/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team;

import Person.Personcitizen;

/**
 *
 * @author devmi
 */
public class Allteam {
    
    String logteamname;
    int team_log_count;
    String stateoflog;
    

    

    public String getStateoflog() {
        return stateoflog;
    }

    public void setStateoflog(String stateoflog) {
        this.stateoflog = stateoflog;
    }
    
    
    public String getLogteamname() {
        return logteamname;
    }

    public void setLogteamname(String logteamname) {
        this.logteamname = logteamname;
    }

    public int getTeam_log_count() {
        return team_log_count;
    }

    public void setTeam_log_count(int team_log_count) {
        this.team_log_count = team_log_count;
    }

   public Allteam(){
        
    }
    
    public Allteam(String logteamname, int team_log_count, String stateoflog)
    {
        this.logteamname = logteamname;
        this.team_log_count = team_log_count;
        this.stateoflog = stateoflog;
        
    }
    
    
}




