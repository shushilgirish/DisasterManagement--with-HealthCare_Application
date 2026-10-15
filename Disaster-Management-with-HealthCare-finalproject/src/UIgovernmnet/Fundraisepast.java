/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIgovernmnet;

import Bussiness.EmergencyResponseTeam.Ersreport;
import Bussiness.SearchandResue.Volunteers;
import Fundraisingteam.Requestin;
import Model.Directoryinti;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devmi
 */
public class Fundraisepast extends javax.swing.JPanel {

    JPanel userProcessContainer;
Directoryinti diaster;
String id;
Directoryinti logrep;
Directoryinti gov;
Directoryinti volun;
Directoryinti request;
    /**
     * Creates new form Homepage
     */
    public Fundraisepast(JPanel userProcessContainer, Directoryinti diaster, String id,Directoryinti gov, Directoryinti logrep, Directoryinti volun, Directoryinti request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.diaster = diaster;
        this.id = id;
        this.logrep = logrep;
        this.gov = gov;
        this.volun = volun;
        this.request = request;
        populatatetab();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblersrep1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtiddd = new javax.swing.JTextField();
        txtrequestedby = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        txtamountrequired = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Amontremaingtoberaised = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarearrr = new javax.swing.JTextArea();
        txtreason = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        backBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        tblersrep1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Amount ", "Description"
            }
        ));
        jScrollPane1.setViewportView(tblersrep1);

        add(jScrollPane1);
        jScrollPane1.setBounds(160, 110, 910, 194);

        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(950, 320, 72, 22);
        add(txtiddd);
        txtiddd.setBounds(290, 350, 64, 22);

        txtrequestedby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrequestedbyActionPerformed(evt);
            }
        });
        add(txtrequestedby);
        txtrequestedby.setBounds(290, 400, 64, 22);

        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        add(txtstatus);
        txtstatus.setBounds(290, 450, 64, 22);
        add(txtamountrequired);
        txtamountrequired.setBounds(550, 350, 64, 22);

        jLabel1.setText("Id");
        add(jLabel1);
        jLabel1.setBounds(180, 350, 50, 16);

        jLabel3.setText("Requested By");
        add(jLabel3);
        jLabel3.setBounds(170, 400, 71, 16);

        jLabel5.setText("Status");
        add(jLabel5);
        jLabel5.setBounds(180, 450, 32, 20);

        jLabel6.setText("Amount Raised");
        add(jLabel6);
        jLabel6.setBounds(420, 350, 81, 16);

        jLabel2.setText("Description");
        add(jLabel2);
        jLabel2.setBounds(170, 500, 120, 16);

        jLabel4.setText("Amount Remaing");
        add(jLabel4);
        jLabel4.setBounds(420, 400, 110, 16);
        add(Amontremaingtoberaised);
        Amontremaingtoberaised.setBounds(550, 400, 64, 22);

        txtarearrr.setColumns(20);
        txtarearrr.setRows(5);
        jScrollPane2.setViewportView(txtarearrr);

        add(jScrollPane2);
        jScrollPane2.setBounds(290, 500, 362, 40);
        add(txtreason);
        txtreason.setBounds(550, 450, 64, 22);

        jLabel7.setText("Reason");
        add(jLabel7);
        jLabel7.setBounds(420, 450, 38, 16);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel8.setText("Past Raise Request");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 30));

        backBtn1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn1.setText("BACK");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 88, 20));

        add(jPanel3);
        jPanel3.setBounds(10, 0, 1190, 92);
    }// </editor-fold>//GEN-END:initComponents

    
    public void populatatetab(){
         DefaultTableModel dtm = (DefaultTableModel) tblersrep1.getModel();
                dtm.setRowCount(0);        
for (Requestin dis : request.getRequest()) 
{
    if(dis.getStatus().equals("COMPLETE")){
 
            Object[] row = new Object[3];
            row[0] = dis;
            row[1] = dis.getAmount();
            row[2] = dis.getDescription();
            dtm.addRow(row);
    }
}
    
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblersrep1.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) tblersrep1.getModel();
            Requestin disaster = (Requestin) model.getValueAt(selectedRow, 0);
            txtstatus.setText(disaster.getStatus()) ;
            txtamountrequired.setText(String.valueOf(disaster.getAmount()));
            txtiddd.setText(disaster.getId());
            txtrequestedby.setText(disaster.getRequestedby());
            Amontremaingtoberaised.setText(String.valueOf(disaster.getAmount() - disaster.getAmountraised()));
            txtreason.setText(disaster.getReason());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void txtrequestedbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrequestedbyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrequestedbyActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amontremaingtoberaised;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblersrep1;
    private javax.swing.JTextField txtamountrequired;
    private javax.swing.JTextArea txtarearrr;
    private javax.swing.JTextField txtiddd;
    private javax.swing.JTextField txtreason;
    private javax.swing.JTextField txtrequestedby;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
