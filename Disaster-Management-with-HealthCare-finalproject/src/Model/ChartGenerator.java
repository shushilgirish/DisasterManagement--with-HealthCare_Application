/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Business.Hospital.Doctor.Doctor;
import Business.Hospital.Doctor.DoctorDirectory;
import Business.Hospital.Model.Hospital;
import Business.Hospital.Model.HospitalDirectory;
import Bussiness.EmergencyResponseTeam.Ersreport;
import Patient.Patient;
import Patient.PatientDirectory;
import Person.Personteam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.Comparator;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author shush
 */

/**
 *
 * @author devmi
 */
public class ChartGenerator {
    Directoryinti diaster;
    String Disaster;
    Directoryinti ersreporters;
    Directoryinti Persont;
    PatientDirectory patitent;
    DoctorDirectory doctors;
    HospitalDirectory h;
    public ChartGenerator( Directoryinti diaster,Directoryinti Persont,Directoryinti ersreporters, HospitalDirectory hd){
    this.h=hd;
        this.diaster = diaster;
        this.Persont = Persont;
        this.ersreporters = ersreporters; 
        
        
    }
    public  JFreeChart createBarChart1() {
        // Create dataset
        CategoryDataset dataset = createDataset1(ersreporters);

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
                "City with maximum damage",
                "Cites",
                "Net loss in millions",
                dataset
        );

        // Customize chart if needed
        // For example:
        // chart.setBackgroundPaint(Color.white);

        return chart;
    }

    private static CategoryDataset createDataset1(Directoryinti ersreporters) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    List<Ersreport> sortedReporters = ersreporters.getErsreporters().stream()
            .sorted(Comparator.comparingDouble(Ersreport::getPropertiy_dmg).reversed())
            .collect(Collectors.toList());

    int n = 0;
    for (Ersreport t : sortedReporters) {
        if (n < 6) {
            dataset.addValue(t.getPropertiy_dmg(), t.getCity(), t.getDisastertype());
            n++;
        } else {
            break;
        }
    }

    return dataset;
}



    
    
    public  JFreeChart createBarChart2() {
        // Create dataset
        CategoryDataset dataset = createDataset2(ersreporters);

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Number of People Affected through Natural Calamities",
                "Cities",
                "Count",
                dataset
        );

        // Customize chart if needed
        // For example:
        // chart.setBackgroundPaint(Color.white);

        return chart;
    }

   private static CategoryDataset createDataset2(Directoryinti ersreporters) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    List<Ersreport> ersreportersList = ersreporters.getErsreporters().stream()
            .sorted(Comparator.comparingDouble(Ersreport::getNumber_ofpplaffected).reversed())
            .collect(Collectors.toList());

    int n = 0;
    for (Ersreport t : ersreportersList) {
        if (n < 6) {
            dataset.addValue(t.getNumber_ofpplaffected(), t.getCity(), t.getDisastertype());
            n++;
        } else {
            break;
        }
    }

    return dataset;
}

    
     public  JFreeChart createBarChart3() {
        // Create dataset
        CategoryDataset dataset = createDataset3(ersreporters);

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Magnitude of Disaster",
                "Cities",
                "Magnitude",
                dataset
        );

        // Customize chart if needed
        // For example:
        // chart.setBackgroundPaint(Color.white);

        return chart;
    }

 private CategoryDataset createDataset3(Directoryinti ersreporters) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    List<Ersreport> sortedReporters = ersreporters.getErsreporters().stream()
            .sorted(Comparator.comparingDouble(Ersreport:: getMagnitude).reversed())
            .collect(Collectors.toList());

    int n = 0;
    for (Ersreport t : sortedReporters) {
        if (n < 6) {
            dataset.addValue(t.getMagnitude(), t.getCity(), t.getDisastertype());
            n++;
        } else {
            break;
        }
    }

    return dataset;
}

    
        public  JFreeChart createBarChart4() {
        // Create dataset
        CategoryDataset dataset = createDataset4(ersreporters,Persont);

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Top 5 employers of ERS Team",
                "People Name",
                "Number of reports filed",
                dataset
        );

        // Customize chart if needed
        // For example:
        // chart.setBackgroundPaint(Color.white);

        return chart;
    }
    
    
  private CategoryDataset createDataset4(Directoryinti ersreporters, Directoryinti Persont) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    List<Ersreport> sortedReporters = ersreporters.getErsreporters().stream()
            .sorted(Comparator.comparingDouble(Ersreport::getNumber_ofpplaffected).reversed())
            .collect(Collectors.toList());

    // Count 'complete' statuses by ersid
    Map<String, Integer> completeCountByErsId = new HashMap<>();
    for (Ersreport report : sortedReporters) {
        if ("COMPLETE".equals(report.getStatus())) {
            completeCountByErsId.put(report.getErsid(), completeCountByErsId.getOrDefault(report.getErsid(), 0) + 1);
        }
    }

    // Sort by count and get top 3
    List<Map.Entry<String, Integer>> top3Entries = completeCountByErsId.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(3)
            .collect(Collectors.toList());

    // Add to dataset
    for (Map.Entry<String, Integer> entry : top3Entries) {
        String ersid = entry.getKey();
        Integer count = entry.getValue();
          for (Personteam e : Persont.getPersont()) {
            if (e.getId().equals(ersid)) {
                dataset.addValue(count, e.getName(), "Complete Status Count");
            }
        
          }
    }
    

    return dataset;}
  
  
   public  JFreeChart createBarChart5() {
        // Create dataset
        CategoryDataset dataset = createDataset5();

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Payroll of Doctors in a Hospital",
                "Doctorname",
                "Salary",
                dataset
        );

        // Customize chart if needed
        // For example:
        // chart.setBackgroundPaint(Color.white);

        return chart;
    }

 private CategoryDataset createDataset5() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
     
    Hospital hospital = h.FindHospitalbylocation("Boston");
    doctors = hospital.getDoctors();
//    ArrayList<String> doctorname = new ArrayList<>();
//    ArrayList<Double> doctorsalaries = new ArrayList<>();
//    for(Doctor doc:doctors.getDoctorcompletelist()){
//        doctorname.add(doc.getDoctorName());
//        doctorsalaries.add(doc.getMonthly_income());
//    }
    List<Doctor> sortedDoctors = doctors.getDoctorcompletelist().stream()
        .sorted(Comparator.comparingDouble(Doctor::getMonthly_income).reversed())
        .collect(Collectors.toList());

    int n = 0;
    for (Doctor t : sortedDoctors) {
        if (n < 6) {
            dataset.addValue(t.getMonthly_income(), t.getDoctorName(), t.getSpecialization());
            n++;
//            System.out.println(t.getMonthly_income());
        } else {
            break;
        }
    }
  return dataset;}
 
 public  JFreeChart createBarChart6() {
        // Create dataset
        CategoryDataset dataset = createDataset5();

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Timesheet of Doctor",
                "Doctorname",
                "Hours_Worked",
                dataset
        );

        // Customize chart if needed
        // For example:
        // chart.setBackgroundPaint(Color.white);

        return chart;
    }

 private CategoryDataset createDataset6() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
     
    Hospital hospital = h.FindHospitalbylocation("Boston");
    doctors = hospital.getDoctors();

    List<Doctor> sortedDoctors = doctors.getDoctorcompletelist().stream()
        .sorted(Comparator.comparingDouble(Doctor::getWeekly_workedhours).reversed())
        .collect(Collectors.toList());

    int n = 0;
    for (Doctor t : sortedDoctors) {
        if (n < 6) {
            dataset.addValue(t.getWeekly_workedhours(), t.getDoctorName(), t.getSpecialization());
            n++;
//            System.out.println(t.getMonthly_income());
        } else {
            break;
        }
    }
  return dataset;}
 
 public  JFreeChart createBarChart7() {
        // Create dataset
        CategoryDataset dataset = createDataset5();

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Patient Expenses",
                "Doctorname",
                "Hours_Worked",
                dataset
        );

        // Customize chart if needed
        // For example:
        // chart.setBackgroundPaint(Color.white);

        return chart;
    }

 private CategoryDataset createDataset7() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
     
    Hospital hospital = h.FindHospitalbylocation("Boston");
//    doctors = hospital.getDoctors();
    patitent = hospital.getPatients();
    List<Patient> sortedDoctors = patitent.getPatientcompletelists().stream()
        .sorted(Comparator.comparingDouble(Patient::getPayment_due).reversed())
        .collect(Collectors.toList());

    int n = 0;
    for (Patient t : sortedDoctors) {
        if (n < 6) {
            dataset.addValue(t.getPayment_due(), t.getPatientName(), t.getCity());
            n++;
//            System.out.println(t.getMonthly_income());
        } else {
            break;
        }
    }
  return dataset;}
 
}




    
    

    


    

