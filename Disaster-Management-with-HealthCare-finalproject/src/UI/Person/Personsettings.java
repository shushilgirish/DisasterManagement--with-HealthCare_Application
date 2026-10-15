/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Person;

import Model.Directoryinti;
import Person.Personcitizen;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author devmi
 */
public class Personsettings extends javax.swing.JPanel {

JPanel userProcessContainer;
String id;
Directoryinti person;
Directoryinti volun;
int n=0;
/**
     * Creates new form NewJPanel1
     */
    public Personsettings(JPanel userProcessContainer, String id, Directoryinti person, Directoryinti volun) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.id =id;
        this.person = person;
        this.volun = volun;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewuserjpanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        SSN3 = new javax.swing.JLabel();
        Role = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        txtphonenumber = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        viewuserjpanel1.setBackground(new java.awt.Color(255, 255, 255));
        viewuserjpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setText(" Name");
        viewuserjpanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 105, -1));

        SSN3.setText("Phone Number");
        viewuserjpanel1.add(SSN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 105, 20));

        Role.setText("Email -Id");
        viewuserjpanel1.add(Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 105, -1));
        viewuserjpanel1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 289, -1));

        txtphonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenumberActionPerformed(evt);
            }
        });
        viewuserjpanel1.add(txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 289, 20));
        viewuserjpanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 289, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Personal Details");
        viewuserjpanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 760, 70));

        jLabel6.setText("Password");
        viewuserjpanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 70, -1));
        viewuserjpanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 290, -1));

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        viewuserjpanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 112, 52));

        jButton1.setText(">>Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        viewuserjpanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewuserjpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewuserjpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtphonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenumberActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        boolean isUpdated = false; // Flag to check if updates are made
        StringBuilder errorMessage = new StringBuilder();

        for (Personcitizen stu : person.getPerson()) {
            if (stu.getId().equals(id)) {
                // Validate Name
                if (txt.getText().trim().isEmpty()) {
                    errorMessage.append("Name cannot be empty.\n");
                } else {
                    stu.setName(txt.getText());
                    isUpdated = true;
                }

                // Validate Email
                String email = txtemail.getText();
                if (email.trim().isEmpty() || !email.contains("@") || !email.contains(".")) {
                    errorMessage.append("Invalid email format.\n");
                } else {
                    stu.setCountry(email);
                    isUpdated = true;
                }

                // Validate Phone Number
                String phoneNumber = txtphonenumber.getText();
                if (phoneNumber.trim().isEmpty() || !phoneNumber.matches("\\d+")) {
                    errorMessage.append("Invalid phone number.\n");
                } else {
                    stu.setPhoneno(phoneNumber);
                    isUpdated = true;
                }

                // Validate and Set Password (assuming it's the same as phone number for now)
                if (phoneNumber.trim().isEmpty()) {
                    errorMessage.append("Password cannot be empty.\n");
                } else {
                    stu.setPassword(phoneNumber);
                    isUpdated = true;
                }

                // Break the loop once the matching Governor is found and processed
                break;
            }
        }

        // Show error message or success message
        if (errorMessage.length() > 0) {
            JOptionPane.showMessageDialog(null, errorMessage.toString(), "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (isUpdated) {
            JOptionPane.showMessageDialog(null, "Information updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Role;
    private javax.swing.JLabel SSN3;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JPanel viewuserjpanel1;
    // End of variables declaration//GEN-END:variables
}
