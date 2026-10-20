/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Model.Directoryinti;
import UI.Managepeopleandteams.ViewTeams;
import UI.Managepeopleandteams.Viewpplinteams;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author devmi
 */
public class Manggebyadmin extends javax.swing.JPanel {
 JPanel userProcessContainer;
Directoryinti diaster;
String id;
Directoryinti logrep;
Directoryinti gov;
Directoryinti volun;
Directoryinti request;
Directoryinti ers;
Directoryinti Persont;
Directoryinti erst;
Directoryinti logteam;
    /**
    /**
     * Creates new form NewJPanel
     */
    public Manggebyadmin(Directoryinti logteam,Directoryinti Persont,JPanel userProcessContainer, Directoryinti ers, Directoryinti diaster, String id,Directoryinti gov, Directoryinti logrep, Directoryinti volun, Directoryinti request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.diaster = diaster;
        this.id = id;
        this.logrep = logrep;
        this.gov = gov;   
        this.volun = volun;
        this.request = request;
        this.ers = ers;
        this.Persont=Persont;
        this.logteam = logteam;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageEmployeeBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        manageUserAccountBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("                                  Admin");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 401, 110));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 257));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        manageEmployeeBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        manageEmployeeBtn.setText("Add Teams");
        manageEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeBtnActionPerformed(evt);
            }
        });
        jPanel4.add(manageEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 330, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.jpeg"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 7, 330, 260));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageUserAccountBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        manageUserAccountBtn.setText("MANAGE EMPLOYEES");
        manageUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountBtnActionPerformed(evt);
            }
        });
        jPanel6.add(manageUserAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 272, 340, 47));
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 266));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images (1) Medium.jpeg"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 250, 260));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(661, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeBtnActionPerformed
        ViewTeams manageEmployeeJPanel = new ViewTeams(logteam, erst,userProcessContainer,  ers,  diaster,  id, gov,  logrep,  volun,  request);
        userProcessContainer.add("ViewTeams", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeBtnActionPerformed

    private void manageUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountBtnActionPerformed
        Viewpplinteams muajp = new Viewpplinteams(userProcessContainer, Persont);
        userProcessContainer.add("Viewpplinteams", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton manageEmployeeBtn;
    private javax.swing.JButton manageUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}
