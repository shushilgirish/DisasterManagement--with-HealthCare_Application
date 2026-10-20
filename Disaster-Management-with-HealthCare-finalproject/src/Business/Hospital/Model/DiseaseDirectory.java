/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shush
 */
// DiseaseDirectory class
class DiseaseDirectory {
    private List<Disease> diseaseList;

    public DiseaseDirectory() {
        diseaseList = new ArrayList<>();

        // Add sample disease entries
        diseaseList.add(new Disease(1, "Diabetes"));
        diseaseList.add(new Disease(2, "Hypertension"));
        diseaseList.add(new Disease(3, "Coronary Heart Disease"));
        diseaseList.add(new Disease(4, "Alzheimer's Disease"));
        diseaseList.add(new Disease(5, "Osteoarthritis"));
    }

    // Method to add a new disease
    public void addDisease(Disease disease) {
        diseaseList.add(disease);
    }

    // Method to get the list of diseases
    public List<Disease> getDiseaseList() {
        return diseaseList;
    }

    // Method to print all diseases
    public void printDiseases() {
        for (Disease disease : diseaseList) {
            System.out.println(disease);
        }
    }


}

