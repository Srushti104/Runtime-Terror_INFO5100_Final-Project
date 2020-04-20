/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FDAInspector;

import Business.Business;
import Business.DistributorEnterprise;
import Business.Enterprise;
import Business.FDAEnterprise;
import Business.HospitalEnterprise;
import Business.InventoryItem;
import Business.WorkRequests.LawEnforcementInspectorWorkRequest;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import Business.WorkRequests.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srush
 */
public class FDAInspectorJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;

    /**
     * Creates new form ViewDrugIncidentsJPanel
     */
    public FDAInspectorJPanel(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        refresh();
    }

    public void refresh() {

        int rowcount = requestsTable.getRowCount();

        for (int i = rowcount - 1; i >= 0; i--) {
            ((DefaultTableModel) requestsTable.getModel()).removeRow(i);

        }
        for (Network network : business.getNetworkDirectory().getNetworkList()) {
            Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            Organization org = ((FDAEnterprise) e).getInspectingOrganization();

            for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {
                LawEnforcementInspectorWorkRequest lawEnforcementInspectorWorkRequest = (LawEnforcementInspectorWorkRequest) workRequest;
                Object row[] = new Object[7];
                row[0] = workRequest;
                row[1] = workRequest.getSender().getEmployee().getFirstName();

                if (workRequest.getReceiver() != null) {
                    row[2] = workRequest.getReceiver().getEmployee().getFirstName();

                }

                row[3] = workRequest.getStatus();
                row[4] = lawEnforcementInspectorWorkRequest.getEnterprise();
                row[5] = lawEnforcementInspectorWorkRequest.getPackage1();

                ((DefaultTableModel) requestsTable.getModel()).addRow(row);
            }

        }
    }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assignButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        refreshButton2 = new javax.swing.JButton();
        sendEmerReportButton = new javax.swing.JButton();

        assignButton.setText("Assign to me");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Enterprise", "Drug Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestsTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FDA Inspector Work Area");

        refreshButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton2ActionPerformed(evt);
            }
        });

        sendEmerReportButton.setBackground(new java.awt.Color(255, 51, 51));
        sendEmerReportButton.setText("Send Emergency Report");
        sendEmerReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmerReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(assignButton)
                                .addGap(210, 210, 210)
                                .addComponent(sendEmerReportButton))
                            .addComponent(refreshButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1)))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(refreshButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignButton)
                    .addComponent(sendEmerReportButton))
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:

        int row = requestsTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        WorkRequest workRequest = (WorkRequest) requestsTable.getValueAt(row, 0);

        if (workRequest.getReceiver() == null) {

            workRequest.setReceiver(userAccount);

            workRequest.setStatus("Pending");

            refresh();
        } else {
            JOptionPane.showMessageDialog(this, "The task is already assigned to other person");
        }
    }//GEN-LAST:event_assignButtonActionPerformed

    private void refreshButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton2ActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_refreshButton2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void sendEmerReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmerReportButtonActionPerformed
        // TODO add your handling code here:
//        int pid = Integer.parseInt(packIdField.getText());
//        lawEnforcementInspectorWorkRequest.getPackage1().setPackageStatus(statusField.getText());
//       int did = lawEnforcementInspectorWorkRequest.getPackage1().getDisLotID();
//        int mid = lawEnforcementInspectorWorkRequest.getPackage1().getManuLotID();
//       int hid = lawEnforcementInspectorWorkRequest.getPackage1().getHosID();
        int row = requestsTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        WorkRequest workRequest = (WorkRequest) requestsTable.getValueAt(row, 0);
        workRequest.setStatus("Sent To Enterprises");
        refresh();

        for (Network network : business.getNetworkDirectory().getNetworkList()) {
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getClass().equals(DistributorEnterprise.class)) {

                DistributorEnterprise distributorEnterprise = (DistributorEnterprise) enterprise;
                for (InventoryItem inventoryItem : distributorEnterprise.getInventoryCatalog().getInventoryList()) {

                    //System.out.println(""+mid);
                    // System.out.println(""+inventoryItem.getPackage1().getManuLotID());
                    inventoryItem.getPackage1().setPackageStatus("Illegetimate Drug");

                }

            }

            if (enterprise.getClass().equals(HospitalEnterprise.class)) {

                HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) enterprise;
                for (InventoryItem inventoryItem : hospitalEnterprise.getInventoryCatalog().getInventoryList()) {

//                    if (inventoryItem.getPackage1().getDisLotID() == did) {
                    inventoryItem.getPackage1().setPackageStatus("Illegetimate Drug");

//                    }
//                    if (!patientField.getText().isEmpty()) {
//
//                        for (Transaction transaction : network.getTransactionHistory().getTransactionList()) {
//                            if (transaction.getPackage().getPackageID() == lawEnforcementInspectorWorkRequest.getPackage1().getPackageID()) {
//                                Doctor doc = transaction.getDoctor();
//
//                                for (Package1 package1 : doc.getDrugCatalog().getPackPatientList()) {
//                                    if (package1.getHosID() == hid) {
//                                        package1.setPackageStatus("Illegetimate Drug");
//
//                                    }
//                                }
//                            }
//                        }
//
                 }
                }
            }

        }

        JOptionPane.showMessageDialog(null, "Emergency Report sent to the Enterprises");
    }//GEN-LAST:event_sendEmerReportButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton2;
    private javax.swing.JTable requestsTable;
    private javax.swing.JButton sendEmerReportButton;
    // End of variables declaration//GEN-END:variables
}
