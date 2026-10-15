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

public class PharmaDepartmentDirectory {
    private List<PharmaDepartment> departmentList;

    public PharmaDepartmentDirectory() {
        departmentList = new ArrayList<>();

    }

    // Method to add a new department
    public void addDepartment(PharmaDepartment department) {
        departmentList.add(department);
    }

    // Method to get the list of departments
    public List<PharmaDepartment> getDepartmentList() {
        return departmentList;
    }

    // Optional: Method to print all departments
    public void printDepartments() {
        for (PharmaDepartment department : departmentList) {
            System.out.println(department);
        }
    }


}
