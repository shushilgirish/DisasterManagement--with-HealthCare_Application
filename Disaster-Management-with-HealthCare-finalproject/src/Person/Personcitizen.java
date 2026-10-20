/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author devmi
 */
public class Personcitizen {
    
    
    private String Name;
    String Password;
    private int Age;
    private String Id;
    private String Address;
    private String dob;
    private String Ssn;
    private String phoneno;
    private String Allergies;
    private String Medication;
    private String Country;
    private String City;
    private String State;
    private boolean is_affected;
    private String needhospitaladmmission;
    private String Hospitaladmitdate;
    private String dischargedate;
    private float bankbalance;
        private String Affecteddisastername;
        private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
        
        

    public Personcitizen() {
    }

    public String getAffecteddisastername() {
        return Affecteddisastername;
    }

    public void setAffecteddisastername(String Affecteddisastername) {
        this.Affecteddisastername = Affecteddisastername;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
        
        
        


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public String getAllergies() {
        return Allergies;
    }

    public void setAllergies(String Allergies) {
        this.Allergies = Allergies;
    }

    public String getMedication() {
        return Medication;
    }

    public void setMedication(String Medication) {
        this.Medication = Medication;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public boolean isIs_affected() {
        return is_affected;
    }

    public void setIs_affected(boolean is_affected) {
        this.is_affected = is_affected;
    }

    public String getNeedhospitaladmmission() {
        return needhospitaladmmission;
    }

    public void setNeedhospitaladmmission(String needhospitaladmmission) {
        this.needhospitaladmmission = needhospitaladmmission;
    }

    public String getHospitaladmitdate() {
        return Hospitaladmitdate;
    }

    public void setHospitaladmitdate(String Hospitaladmitdate) {
        this.Hospitaladmitdate = Hospitaladmitdate;
    }

    public String getDischargedate() {
        return dischargedate;
    }

    public void setDischargedate(String dischargedate) {
        this.dischargedate = dischargedate;
    }

  

    public float getBankbalance() {
        return bankbalance;
    }

    public void setBankbalance(float bankbalance) {
        this.bankbalance = bankbalance;
    }
    
    
    public Personcitizen(String Name,String Password,int Age,String Id,String Address,String dob,String Ssn,String phoneno,String Allergies,String Medications,String Country,String State,boolean is_affected,String needhospitaladmmission,String Hospitaladmitdate,String dischargedate,float bankbalance, String Affecteddisastername, String City,int money)    
    {
        this.Id = Id;
       this.Name =  Name;
   this.Password =  Password;
    this.Age =  Age;
   this.Id =  Id;
   this.Address =  Address;
   this.dob = dob;
   this.Ssn =  Ssn;
    this.phoneno =  phoneno;
    this.Allergies =  Allergies;
    this.Medication =  Medications;
    this.Country =  Country;
    this.State =  State;
    this.is_affected =  is_affected;
    this.money = money;
    this.bankbalance =  bankbalance;
       this.Affecteddisastername =  Affecteddisastername;
       this.City = City;
    }
   
}