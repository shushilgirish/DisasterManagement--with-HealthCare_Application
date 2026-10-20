package Business.Hospital.Model;
import java.awt.CardLayout;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.List;

// Disease class
class Disease {
    // Attributes
    private int diseaseId;
    private String diseaseName;

    // Constructor
    public Disease(int diseaseId, String diseaseName) {
        this.diseaseId = diseaseId;
        this.diseaseName = diseaseName;
    }

    // Getters and Setters
    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    // Override toString for display purposes
    @Override
    public String toString() {
        return "Disease ID: " + diseaseId + ", Name: " + diseaseName;
    }
}

