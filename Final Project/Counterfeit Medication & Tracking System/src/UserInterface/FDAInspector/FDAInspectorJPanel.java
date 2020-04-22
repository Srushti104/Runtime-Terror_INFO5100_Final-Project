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
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import Business.WorkRequests.LawEnforcementInspectorWorkRequest;
import Business.WorkRequests.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class FDAInspectorJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;

    /**
     * Creates new form LawEnforcementInspectorJPanel
     */
    public FDAInspectorJPanel(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        //     lawLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/DEABadge.jpg")));
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        assignButton = new javax.swing.JButton();
        sendEmerReportButton = new javax.swing.JButton();
        refreshButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setForeground(new java.awt.Color(51, 0, 51));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("FDA DRUG INSPECTOR WORK-AREA");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        requestsTable.setBackground(new java.awt.Color(238, 238, 238));
        requestsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        requestsTable.setForeground(new java.awt.Color(34, 40, 49));
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
        requestsTable.setGridColor(new java.awt.Color(34, 40, 49));
        requestsTable.setMaximumSize(new java.awt.Dimension(1000, 122));
        requestsTable.setMinimumSize(new java.awt.Dimension(1000, 122));
        requestsTable.setPreferredSize(new java.awt.Dimension(1000, 122));
        requestsTable.setRowHeight(20);
        requestsTable.setSelectionBackground(new java.awt.Color(0, 173, 181));
        requestsTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(requestsTable);

        assignButton.setBackground(new java.awt.Color(57, 62, 70));
        assignButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        assignButton.setForeground(new java.awt.Color(238, 238, 238));
        assignButton.setText("ASSIGN TO ME");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        sendEmerReportButton.setBackground(new java.awt.Color(57, 62, 70));
        sendEmerReportButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        sendEmerReportButton.setForeground(new java.awt.Color(238, 238, 238));
        sendEmerReportButton.setText("SEND EMERGENCY REPORT");
        sendEmerReportButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        sendEmerReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmerReportButtonActionPerformed(evt);
            }
        });

        refreshButton2.setBackground(new java.awt.Color(238, 238, 238));
        refreshButton2.setForeground(new java.awt.Color(238, 238, 238));
        refreshButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/refresh.png"))); // NOI18N
        refreshButton2.setBorder(null);
        refreshButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        refreshButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        refreshButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1000, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(417, 417, 417)
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(refreshButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(assignButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(50, 50, 50)
                                .add(sendEmerReportButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(120, 120, 120)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30)
                .add(refreshButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(assignButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(sendEmerReportButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
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

    private void sendEmerReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmerReportButtonActionPerformed
        // TODO add your handling code here:

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

                        inventoryItem.getPackage1().setPackageStatus("Illegetimate Drug");

                    }

                }

                if (enterprise.getClass().equals(HospitalEnterprise.class)) {

                    HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) enterprise;
                    for (InventoryItem inventoryItem : hospitalEnterprise.getInventoryCatalog().getInventoryList()) {

                        inventoryItem.getPackage1().setPackageStatus("Illegetimate Drug");
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Emergency Report sent to the Enterprises");
    }//GEN-LAST:event_sendEmerReportButtonActionPerformed

    private void refreshButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton2ActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_refreshButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton2;
    private javax.swing.JTable requestsTable;
    private javax.swing.JButton sendEmerReportButton;
    // End of variables declaration//GEN-END:variables
}
