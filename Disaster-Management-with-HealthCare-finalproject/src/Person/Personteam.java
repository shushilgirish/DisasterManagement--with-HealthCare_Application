/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author devmi
 */
 
public class Personteam {
     private String Name;
    private String Password;
    private int Age;
    private String Id;
    private String Address;
    private String dob;
    private String Ssn;
    private String phoneno;
    private String Country;
    private String City;
    private String State;
    private String Team;

    public Personteam() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String Ssn) {
        this.Ssn = Ssn;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

   
      public Personteam(String ID,String Team, String Name,String Password,int Age,String Id,String Address,String dob,String Ssn,String phoneno,String Country,String State, String City)    
    {
       this.Name =  Name;
   this.Password =  Password;
    this.Age =  Age;
   this.Id =  Id;
   this.Address =  Address;
   this.dob = dob;
   this.Ssn =  Ssn;
    this.phoneno =  phoneno;
   this.Team = Team;
    this.Country =  Country;
    this.State =  State;
    this.Id = ID;
    
       this.City = City;
    }
@Override
public String toString(){
        return Id;
}
}

