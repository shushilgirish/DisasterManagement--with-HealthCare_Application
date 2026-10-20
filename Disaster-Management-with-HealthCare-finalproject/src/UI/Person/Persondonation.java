/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Person;

import Bussiness.SearchandResue.Volunteers;
import Fundraisingteam.Requestin;
import Model.Directoryinti;
import Person.Personcitizen;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devmi
 */
public class Persondonation extends javax.swing.JPanel {

    JPanel userProcessContainer;
String id;
Directoryinti person;
Directoryinti volun;
Directoryinti requestin;
int n=0;
String name ="";
   Directoryinti searchandrescue;

/**
     * Creates new form NewJPanel1
     */
    public Persondonation(JPanel userProcessContainer, String id, Directoryinti person, Directoryinti volun,   Directoryinti searchandrescue,Directoryinti requestin){

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.id =id;
        this.person = person;
        this.volun = volun;
        this.searchandrescue = searchandrescue;
        this.requestin = requestin;
        populatetab();
    }
    
    
      public void  populatetab(){
         DefaultTableModel dtm = (DefaultTableModel) ngoReqTbl.getModel();
                dtm.setRowCount(0);        
for (Requestin dis : requestin.getRequest()) 
{
        if (dis.getStatus().equals("ONGOING"))
        {
            Object[] row = new Object[5];
            row[0] = dis;
            row[1] = dis.getAmount();
            row[2] = dis.getStatus();
            row[3] = dis.getRequestedby();
             row[4] = dis.getDescription();
           
           
     
           

            
            dtm.addRow(row);
        }
        }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngoReqTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fundsNeededTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setToolTipText("");
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("Make a Donation");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 35, -1, 30));

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel4.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 88, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1466, 92));

        ngoReqTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Amount", "Status", "Source", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ngoReqTbl);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 640, 210));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Funds Needed:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 141, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Description:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 110, 20));

        submitBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel3.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 87, 34));

        jLabel4.setText("(in dollars)");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        fundsNeededTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundsNeededTxtActionPerformed(evt);
            }
        });
        jPanel3.add(fundsNeededTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 160, -1));

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 410, 110));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 280, -1));

        jLabel2.setText("Enter the amount to be Deposited");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, 20));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 754));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
int selectedRow = ngoReqTbl.getSelectedRow();
int temp=0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {    
            for(Personcitizen p : person.getPerson())
            {
                if(p.getId().equals(id))
                {
                   Requestin p1 = (Requestin) ngoReqTbl.getValueAt(selectedRow, 0);  
try {
     temp = Integer.parseInt(jTextField1.getText());

} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Invalid input: Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
}                   if( p.getMoney() < temp )
                   {
                       System.out.println(p.getMoney());
                       JOptionPane.showMessageDialog(null, "Entered amount is greater than your bank amount", "Warning", JOptionPane.WARNING_MESSAGE);

                       break;
                   }
                  
                   else{
    System.out.println(p.getMoney());
                       p1.setAmount(p.getMoney()-temp);
                   
                       if(p1.getAmount()>0)
                       {
                            populatetab();
                           p1.setStatus("COMPLETED");
                      JOptionPane.showMessageDialog(null, "Amount has been submitted", "Information", JOptionPane.INFORMATION_MESSAGE);

                       }
                       else if(p1.getAmount()==0){
                            p1.setStatus("COMPLETED");
                      JOptionPane.showMessageDialog(null, "Donation amount has been filled  ", "Warning", JOptionPane.WARNING_MESSAGE);

                       }
                   }

                }
            }
                
        }   
    }//GEN-LAST:event_submitBtnActionPerformed

    private void fundsNeededTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundsNeededTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundsNeededTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = ngoReqTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Requestin p = (Requestin) ngoReqTbl.getValueAt(selectedRow, 0);          
            fundsNeededTxt.setText(String.valueOf(p.getAmount()));
            jTextArea1.setText(p.getDescription());
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField fundsNeededTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable ngoReqTbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
