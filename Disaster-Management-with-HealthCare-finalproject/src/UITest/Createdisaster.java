/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UITest;

import Bussiness.EmergencyResponseTeam.Ersreport;
import Model.Diastermangdirectory;
import Model.Directoryinti;
import Nurse.Nurse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;
import java.util.UUID;
import javax.swing.JOptionPane;


/**
 *
 * @author devmi
 */
public class Createdisaster extends javax.swing.JPanel {

JPanel userProcessContainer;
Directoryinti diaster;
/**
     * Creates new form Governmentperson
     */
    public Createdisaster(JPanel userProcessContainer, Directoryinti diaster) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.diaster = diaster;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Earthquake", "Floods", "Cyclone", "Forest-Fire" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 216, 124, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calfornia", "New York" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 285, 124, -1));

        jLabel1.setText("Disaster Type");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 219, -1, -1));

        jLabel2.setText("State");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 285, 48, 23));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 394, 125, -1));

        jLabel3.setText("affected_people_count");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 335, 142, 23));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 449, -1, -1));

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CREATE A DISASTER");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, 785, 86));

        jLabel5.setText("City");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 396, 979, 23));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 335, 125, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   String Department =  (String) jComboBox1.getSelectedItem();
    String Department2 =  (String) jComboBox2.getSelectedItem();
    int affectedpp_count = Integer.parseInt(jTextField2.getText());

 
        
Diastermangdirectory usc = diaster.addNewdisaster(); 
 usc.setCity_name(jTextField1.getText());
 usc.setState_affec(Department2);
 usc.setDisname(Department);
usc.setId(UUID.randomUUID().toString().substring(0, 2));
 usc.setStatus("INPROGRESS");
 usc.setIdofers("NA");
 
   try{ Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","root");

            String sql = "update `personcitizen` SET `needhospitaladmmission`= 'yes' where City = '"+jTextField1.getText()+"' ORDER BY RAND() LIMIT "+String.valueOf(affectedpp_count);
            PreparedStatement ptstmt = conn.prepareStatement(sql);
            ptstmt.execute();

            JOptionPane.showMessageDialog(null, "Record updated successfully");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
