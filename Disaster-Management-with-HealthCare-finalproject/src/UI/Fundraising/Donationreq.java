/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Fundraising;

import Fundraisingteam.Requestin;
import Model.Directoryinti;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author devmi
 */
public class Donationreq extends javax.swing.JPanel {

   Directoryinti request;
    Directoryinti Persont;
    JPanel userProcessContainer;
    String id;
    /**
     * Creates new form NewJPanel
     */
    public Donationreq(JPanel userProcessContainer, Directoryinti request,Directoryinti Persont,String id) {
        initComponents();
        this.request = request;
        this.userProcessContainer = userProcessContainer;
        this.Persont = Persont;
        this.id = id;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fundsNeededTxt = new javax.swing.JTextField();
        descriptionTxt2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtarearrr1 = new javax.swing.JTextArea();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("Fund Raise Request");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel3.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 88, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1466, 92));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel2.setText("Fund Raise Request: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Funds Needed:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 141, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Description:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 141, -1));

        submitBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 87, 34));

        jLabel4.setText("(in dollars)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        fundsNeededTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundsNeededTxtActionPerformed(evt);
            }
        });
        jPanel2.add(fundsNeededTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 160, -1));

        descriptionTxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descriptionTxt2KeyTyped(evt);
            }
        });
        jPanel2.add(descriptionTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 162, -1));

        jLabel7.setText("Reason");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 90, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DisasterM2 Medium.jpeg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 640, 470));

        txtarearrr1.setColumns(20);
        txtarearrr1.setRows(5);
        jScrollPane3.setViewportView(txtarearrr1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 320, 130));

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1466, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
       Requestin r = request.addNewrequest();
       
       r.setAmount(Double.parseDouble(fundsNeededTxt.getText()));
       r.setAmountraised(0);
       r.setDescription(txtarearrr1.getText());
       r.setId("NA");
       r.setReason(descriptionTxt2.getText());
       r.setRequestedby(id);
       r.setRequestedfrom(id);
       r.setStatus("ONGOING");
       JOptionPane.showMessageDialog(null, "Fundraise request created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
      
    }//GEN-LAST:event_submitBtnActionPerformed

    private void fundsNeededTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundsNeededTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundsNeededTxtActionPerformed

    private void descriptionTxt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionTxt2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTxt2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField descriptionTxt2;
    private javax.swing.JTextField fundsNeededTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextArea txtarearrr1;
    // End of variables declaration//GEN-END:variables
}
