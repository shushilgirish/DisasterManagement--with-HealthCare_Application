/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Bussiness.Admin.Admin;
import Bussiness.EmergencyResponseTeam.Ersreport;
import Bussiness.EmergencyResponseTeam.Ersteam;
import Bussiness.Government.governor;
import Bussiness.SearchandResue.Searchandresqueteam;
import Bussiness.SearchandResue.Searchreq;
import Bussiness.SearchandResue.Volunteers;
import Fundraisingteam.Fundigteam;
import Fundraisingteam.Requestin;
import Team.Allteam;
import Person.Personcitizen;
import Person.Personteam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author devmi
 */
public class Directoryinti {
    
    private ArrayList<Personcitizen> Person;
   private ArrayList<Ersteam> ers;
    private ArrayList<governor> gov;
    private ArrayList<Allteam> logteam;
     private ArrayList<Diastermangdirectory> diaster;  
    private ArrayList<Personteam> Persont;
    private ArrayList<Ersreport> ersreporters;
    private ArrayList<Reportforlogistics> logrep;
    private ArrayList<Requestin> request;
    private ArrayList<Volunteers> volun;
      private ArrayList<Searchreq> searchandrescue;
      private ArrayList<Test> test;
            private ArrayList<Fundigteam> fundigteam;
                 private ArrayList<Admin>  ad;
                 private ArrayList<Searchandresqueteam>srq;

    public ArrayList<Admin> getAd() {
        return ad;
    }

    public void setAd(ArrayList<Admin> ad) {
        this.ad = ad;
    }

    public ArrayList<Searchandresqueteam> getSrq() {
        return srq;
    }

    public void setSrq(ArrayList<Searchandresqueteam> srq) {
        this.srq = srq;
    }
                 
                 
    

    public ArrayList<Fundigteam> getFundigteam() {
        return fundigteam;
    }

    public void setFundigteam(ArrayList<Fundigteam> fundigteam) {
        this.fundigteam = fundigteam;
    }


    
    public ArrayList<Test> getTest() {
        return test;
    }

    public void setTest(ArrayList<Test> test) {
        this.test = test;
    }
      
    

    public ArrayList<Searchreq> getSearchandrescue() {
        return searchandrescue;
    }

    public void setSearchandrescue(ArrayList<Searchreq> searchandrescue) {
        this.searchandrescue = searchandrescue;
    }

 public Searchreq addNewrequestinsearchandres()
    {
        Searchreq newperson = new Searchreq();
        searchandrescue.add(newperson);
        return newperson;
    } 
   
public Ersteam adders()
    {
        Ersteam newperson = new Ersteam();
        ers.add(newperson);
        return newperson;
    }  
    
     
    
    
    public ArrayList<Volunteers> getVolun() {
        return volun;
    }

    public void setVolun(ArrayList<Volunteers> volun) {
        this.volun = volun;
    }
                
                

       public Volunteers addNewvolun()
    {
        Volunteers newperson = new Volunteers();
        volun.add(newperson);
        return newperson;
    }   
        
        
        

    public ArrayList<Requestin> getRequest() {
        return request;
    }

    public void setRequest(ArrayList<Requestin> request) {
        this.request = request;
    }
        
    public Personcitizen addNewPerson()
    {
        Personcitizen newperson = new Personcitizen();
        Person.add(newperson);
        return newperson;
    }  
    
    public Personteam addNewPersont()
    {
        Personteam newperson = new Personteam();
        Persont.add(newperson);
        return newperson;
    }  
    
     public Requestin addNewrequest()
    {
        Requestin newperson = new Requestin();
        request.add(newperson);
        return newperson;
    } 
    
    
    
    
    public Diastermangdirectory addNewdisaster()
    {
        Diastermangdirectory newperson = new Diastermangdirectory();
        diaster.add(newperson);
        return newperson;
    } 
    
    public Ersteam addNewers()
    {
        Ersteam newperson = new Ersteam();
        ers.add(newperson);
        return newperson;
    } 
    
     public Allteam addlogteam()
    {
        Allteam newperson = new Allteam();
        logteam.add(newperson);
        return newperson;
    } 
    
     public governor addgovern()
    {
        governor newperson = new governor();
        gov.add(newperson);
        return newperson;
    } 
        


    public ArrayList<Reportforlogistics> getLogrep() {
        return logrep;
    }

    public void setLogrep(ArrayList<Reportforlogistics> logrep) {
        this.logrep = logrep;
    }

     public Ersreport addNewReport()
    {
        Ersreport newreport = new Ersreport();
        ersreporters.add(newreport);
        return newreport;
    }
    
     
       public Reportforlogistics addlodNewReport()
    {
        Reportforlogistics newreport = new Reportforlogistics();
        logrep.add(newreport);
        return newreport;
    }
     
    public ArrayList<Personcitizen> getPerson() {
        return Person;
    }

    public void setPerson(ArrayList<Personcitizen> Person) {
        this.Person = Person;
    }

    public ArrayList<Ersteam> getErs() {
        return ers;
    }

    public void setErs(ArrayList<Ersteam> ers) {
        this.ers = ers;
    }

    public ArrayList<governor> getGov() {
        return gov;
    }

    public void setGov(ArrayList<governor> gov) {
        this.gov = gov;
    }

    public ArrayList<Allteam> getLogteam() {
        return logteam;
    }

    public void setLogteam(ArrayList<Allteam> logteam) {
        this.logteam = logteam;
    }

    public ArrayList<Diastermangdirectory> getDiaster() {
        return diaster;
    }

    public void setDiaster(ArrayList<Diastermangdirectory> diaster) {
        this.diaster = diaster;
    }

    public ArrayList<Personteam> getPersont() {
        return Persont;
    }

    public void setPersont(ArrayList<Personteam> Persont) {
        this.Persont = Persont;
    }

    public ArrayList<Ersreport> getErsreporters() {
        return ersreporters;
    }

    public void setErsreporters(ArrayList<Ersreport> ersreporters) {
        this.ersreporters = ersreporters;
    }

   
    

   public Directoryinti()
   {
   this.diaster = new ArrayList<Diastermangdirectory>();
    try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from disastermanagementdirectory";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Diastermangdirectory d = new Diastermangdirectory(rs.getString("disid"),rs.getString("disname"),rs.getString("state_affec"),rs.getString("city_name"),rs.getString("status"),"NA");
                diaster.add(d);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }    
   
        this.test = new ArrayList<Test>();
        Test t = new Test("Test1","Test1");
        test.add(t);

   this.ad = new ArrayList<Admin>();
        Admin r = new Admin("Admin11","Admin12341");
        ad.add(r);
 
  
    this.Person = new ArrayList<Personcitizen>();
    try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from personcitizen";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Personcitizen p1 = new Personcitizen(rs.getString("Name"),rs.getString("Password"),rs.getInt("Age"),rs.getString("Id"),rs.getString("Address"),rs.getString("dob"),rs.getString("Ssn"),rs.getString("phoneno"),rs.getString("Allergies"),rs.getString("Medication"),rs.getString("country"),rs.getString("state"),rs.getBoolean("is_affected"),rs.getString("needhospitaladmmission"),rs.getString("hospitaladmitdate"),rs.getString("dischargedate"),rs.getFloat("bankbalance"),rs.getString("affecteddisastername"),rs.getString("city"),rs.getInt("money"));
                Person.add(p1);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }    
   

    this.Persont = new ArrayList<Personteam>();
   
    try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from personteam";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                String id_personteam = rs.getString("Id"); 
                Personteam pt1 =   new Personteam(id_personteam,rs.getString("Team"),rs.getString("Name"),rs.getString("Password"),rs.getInt("Age"),id_personteam,rs.getString("Address"),rs.getString("dob"),rs.getString("Ssn"),rs.getString("phoneno"),rs.getString("Country"),rs.getString("City"),rs.getString("State"));
                Persont.add(pt1);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }    
    
this.ersreporters = new ArrayList<Ersreport>();
 try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from ersreport";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                String id_personteam = rs.getString("ersid"); 
                Ersreport eres =   new Ersreport(id_personteam,rs.getString("Diaster_id"),rs.getDouble("number_ofpplaffected"),rs.getDouble("number_ofchildaffected"),rs.getDouble("propertiy_dmg"),rs.getDouble("number_ofpplcriticalcndition"),rs.getDouble("number_ofminorinjuries"),rs.getString("startdatetime"),rs.getString("enddatetime"),rs.getFloat("magnitude"),rs.getDouble("numberpplmisssing"),rs.getString("Severity"),rs.getString("Description"),rs.getDouble("immediateadmit"),rs.getString("Assignedtologid"),rs.getString("logstatus"),rs.getString("disastertype"),rs.getString("city"),rs.getString("state"),rs.getString("Status"));
                ersreporters.add(eres);
            }


        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
 this.logrep = new ArrayList<Reportforlogistics>();
 try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from reportforlogistics";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Reportforlogistics eres =   new Reportforlogistics(rs.getString("assignidlog"), rs.getString("Diaster_id"),rs.getDouble("number_ofvolunteers"),rs.getDouble("number_ofvehicles"),rs.getDouble("propertiy_sheltertobuils"),rs.getDouble("compensatation"),rs.getDouble("foodpackets"),rs.getString("Medicalsupplies"),rs.getDouble("blankets"),rs.getString("Status"),rs.getString("descri"),rs.getString("city"),rs.getString("govid"),rs.getString("gov_status"));
                logrep.add(eres);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
 
  this.searchandrescue = new ArrayList<Searchreq>();
    try{ Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from searchreq";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Searchreq d = new Searchreq(rs.getString("customerid"),rs.getString("decription"),rs.getString("userid"),rs.getString("Subject"),rs.getString("Location"),rs.getString("Nameofuser"),rs.getString("Nameofcustomer"),rs.getString("Date"),rs.getString("status"));
                searchandrescue.add(d);
            }
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    this.volun = new ArrayList<>();
    try{ Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from Volunteers";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Volunteers v = new Volunteers(rs.getString("idvol"),rs.getString("eventTitle"),rs.getString("Description"),rs.getString("Date"),rs.getString("Location"),rs.getInt("volunteersRequired"),rs.getString("Status"),rs.getInt("nopplsignedup"));
                volun.add(v);
            }
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    this.request = new ArrayList<>();
    try{ Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from requestin";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Requestin v = new Requestin(rs.getString("id"),rs.getString("Reason"),rs.getString("Description"),rs.getDouble("amount"),rs.getString("Status"),rs.getString("Requestedby"),rs.getDouble("amountraised"),rs.getString("Requestedfrom"));
                request.add(v);
            }
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    this.gov = new ArrayList<>();
    try{ Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from governor";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                governor v = new governor(rs.getString("loginId"),rs.getString("name"),rs.getString("password"),rs.getString("stateOfGov"),rs.getString("phoneNo"),rs.getString("ssn"),rs.getString("emailId"),rs.getDouble("money"));
                gov.add(v);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    this.ers = new ArrayList<>();
    try{ Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Rama@$111517105089");
            Statement st= conn.createStatement();
            String sql="select * from ersteam";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            while(rs.next()){
                Ersteam v1 = new Ersteam(rs.getString("ersteamname"),rs.getInt("team_ers_count"),rs.getString("stateofers"));
                ers.add(v1);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }  
    
                 
     this.logteam = new ArrayList<Allteam>();
        Allteam t2 = new Allteam("Logistics",10,"Boston");
        Allteam t3 = new Allteam("Logistics",10,"New York");

        logteam.add(t2);
            logteam.add(t3);

    
    
    this.test = new ArrayList<Test>();
        Test t1 = new Test("Test1","Test1");
        test.add(t1);

   this.ad = new ArrayList<Admin>();
        Admin r1 = new Admin("Admin11","Admin12341!");
        ad.add(r1);
        
        this.fundigteam = new ArrayList<Fundigteam>();
        Fundigteam e12 = new Fundigteam("Fund123","rer453454!");
        fundigteam.add(e12);
        
        this.srq = new ArrayList<Searchandresqueteam>();
        Searchandresqueteam e122 = new Searchandresqueteam("Search123","rer453454!");
        srq.add(e122);
        
        
        
        
     
        
       
        
   }
   
}
        

   
   
    

