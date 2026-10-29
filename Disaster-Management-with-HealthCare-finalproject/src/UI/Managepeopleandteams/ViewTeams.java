/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Managepeopleandteams;

import Bussiness.EmergencyResponseTeam.Ersreport;
import Bussiness.EmergencyResponseTeam.Ersteam;
import Model.Directoryinti;
import Model.Reportforlogistics;
import Person.Personteam;
import Team.Allteam;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
       import javax.swing.JOptionPane;

/**
 *
 * @author devmi
 */
public class ViewTeams extends javax.swing.JPanel {

  JPanel userProcessContainer;
Directoryinti diaster;
String id;
Directoryinti logrep;
Directoryinti gov;
Directoryinti volun;
Directoryinti request;
Directoryinti ers;
Directoryinti Persont;
Directoryinti logteam;


    /**
    /**
     * Creates new form NewJPanel
     */
    public ViewTeams(Directoryinti logteam,Directoryinti erst,JPanel userProcessContainer, Directoryinti ers, Directoryinti diaster, String id,Directoryinti gov, Directoryinti logrep, Directoryinti volun, Directoryinti request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.diaster = diaster;
        this.id = id;
        this.logrep = logrep;
        this.gov = gov;   
        this.volun = volun;
        this.request = request;
        this.ers = ers;
        this.ers = ers;
        this.logteam = logteam;
                populatetab();


    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        selectOrganizationJComboBox = new javax.swing.JComboBox();
        teamname = new javax.swing.JTextField();
        teamsize = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtfunction = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        selectOrganizationJComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Number of People"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 540, 190));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("Manage Organization Employee");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 46, -1, -1));

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Managepeopleandteams/Back.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 46, -1, 29));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 112));

        selectOrganizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ersteam", "Logistics" }));
        jPanel1.add(selectOrganizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 210, -1));
        jPanel1.add(teamname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 210, -1));
        jPanel1.add(teamsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 210, -1));

        jLabel2.setText("Team Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, 20));

        jLabel4.setText("Organization");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel5.setText("Team size");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Managepeopleandteams/add.png"))); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, -1));
        jPanel1.add(txtfunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 210, -1));

        jLabel6.setText("State of Function");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, 20));

        selectOrganizationJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ersteam", "Logistics" }));
        jPanel1.add(selectOrganizationJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 200, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Managepeopleandteams/search-interface-symbol.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed
public void populatetab(){
            String Department =  (String) selectOrganizationJComboBox1.getSelectedItem();
     if(Department.equals("Ersteam")) { 
    DefaultTableModel dtm = (DefaultTableModel) employeeTable.getModel();
                dtm.setRowCount(0);        
for (Ersteam dis : ers.getErs()) 
{
           Object[] row = new Object[2];
            row[0] = dis;
            row[1] = dis.getTeam_ers_count();
           dtm.addRow(row);
}         
}
     
     if(Department.equals("Logistics")) { 
    DefaultTableModel dtm = (DefaultTableModel) employeeTable.getModel();
                dtm.setRowCount(0);        
for (Allteam dis : logteam.getLogteam()) 
{
           Object[] row = new Object[2];
            row[0] = dis;
            row[1] = dis.getLogteamname();
           dtm.addRow(row);
}         
}
}

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         
String Department = (String) selectOrganizationJComboBox.getSelectedItem();
System.out.println(Department);

try {
if (Department.equals("ers") || Department.equals("Ersteam")) { 
        Ersteam p = ers.addNewers();
        p.setErsteamname(teamname.getText());
        p.setStateofers(txtfunction.getText());
        
        // Validating and setting team size
        int teamSize = Integer.parseInt(teamsize.getText());
        p.setTeam_ers_count(teamSize);
} else if (Department.equals("Logistics") || Department.equals("log")) {
        Allteam p = logteam.addlogteam();
        p.setLogteamname(teamname.getText());
        p.setStateoflog(txtfunction.getText());
        
        // Validating and setting team size
        int teamSize = Integer.parseInt(teamsize.getText());
        p.setTeam_log_count(teamSize);
    } else {
        // Department not recognized
        JOptionPane.showMessageDialog(null, "Department not recognized", "Warning", JOptionPane.WARNING_MESSAGE);
    }
} catch (NumberFormatException e) {
    // This block will execute if team size is not a valid integer
    JOptionPane.showMessageDialog(null, "Invalid team size format", "Warning", JOptionPane.WARNING_MESSAGE);
} catch (Exception e) {
    // Handle other unexpected exceptions
    JOptionPane.showMessageDialog(null, "Incorrect Values or null values", "Warning",JOptionPane.ERROR_MESSAGE);
}
 
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
String Department = (String) selectOrganizationJComboBox1.getSelectedItem();
if (Department.equals("Ersteam") || Department.equals("ers")) {
    DefaultTableModel dtm = (DefaultTableModel) employeeTable.getModel();
    dtm.setRowCount(0);
    for (Ersteam dis : ers.getErs()) {
        Object[] row = new Object[2];
        row[0] = dis;
        row[1] = dis.getTeam_ers_count();
        dtm.addRow(row);
    }
} else if (Department.equals("Logistics") || Department.equals("log")) {  // Corrected syntax here
    DefaultTableModel dtm = (DefaultTableModel) employeeTable.getModel();
    dtm.setRowCount(0);
    for (Allteam dis : logteam.getLogteam()) {
        Object[] row = new Object[2];
        row[0] = dis;
        row[1] = dis.getLogteamname();
        dtm.addRow(row);
    }
}

        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox selectOrganizationJComboBox;
    private javax.swing.JComboBox selectOrganizationJComboBox1;
    private javax.swing.JTextField teamname;
    private javax.swing.JTextField teamsize;
    private javax.swing.JTextField txtfunction;
    // End of variables declaration//GEN-END:variables
}
