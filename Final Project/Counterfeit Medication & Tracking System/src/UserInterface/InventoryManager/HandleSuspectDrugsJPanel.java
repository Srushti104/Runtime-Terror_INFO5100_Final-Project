/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InventoryManager;

import Business.Enterprise;
import Business.FDAEnterprise;
import Business.HospitalEnterprise;
import Business.InventoryItem;
import Business.Network;
import Business.Package1;
import Business.ReturnsProcessOrganization;
import Business.UserAccount;
import Business.WorkRequests.ReturnProcessorWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srush
 */
public class HandleSuspectDrugsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form HandleSuspectDrugsJPanel
     */
    public HandleSuspectDrugsJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        refresh();
    }

    public void refresh() {
        int rowcount = requestsTable.getRowCount();

        for (int i = rowcount - 1; i >= 0; i--) {
            ((DefaultTableModel) requestsTable.getModel()).removeRow(i);

        }

        Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) e;

        for (InventoryItem inventoryItem : hospitalEnterprise.getInventoryCatalog().getInventoryList()) {
            if (inventoryItem.getPackage1().getPackageStatus().equalsIgnoreCase("Illegetimate Drug")) {

                Object row[] = new Object[7];
                row[0] = inventoryItem.getPackage1();
                row[1] = inventoryItem.getPackage1().getPackageID();

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

        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        sendToFdaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 43, 27));

        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 39, 26, 24));

        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Package Name", "Package ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 69, -1, 92));

        sendToFdaButton.setBackground(new java.awt.Color(255, 51, 0));
        sendToFdaButton.setText("Send To FDA");
        sendToFdaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToFdaButtonActionPerformed(evt);
            }
        });
        add(sendToFdaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 191, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Handle Suspect Drugs");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 11, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void sendToFdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToFdaButtonActionPerformed
        // TODO add your handling code here:

        int row = requestsTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        Enterprise e2 = network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) e2;

        Package1 package1 = (Package1) requestsTable.getValueAt(row, 0);
        InventoryItem itm = null;
        int si = hospitalEnterprise.getInventoryCatalog().getInventoryList().size();

        while (si > 0) {
            for (InventoryItem inventoryItem1 : hospitalEnterprise.getInventoryCatalog().getInventoryList()) {
                if (package1.getPackageID() == inventoryItem1.getPackage1().getPackageID()) {
                    itm = inventoryItem1;
                    break;
                }
            }
            si--;
            hospitalEnterprise.getInventoryCatalog().getInventoryList().remove(itm);
        }

        ReturnProcessorWorkRequest returnProcessorWorkRequest = new ReturnProcessorWorkRequest();
        returnProcessorWorkRequest.setSender(userAccount);
        returnProcessorWorkRequest.setRequestDate(new Date());
        returnProcessorWorkRequest.setMessage("Drug Disposed");
        returnProcessorWorkRequest.setStatus("Drug Disposed");
        returnProcessorWorkRequest.setResult("Drug Disposed");
        returnProcessorWorkRequest.setPackage1(package1);
        //salesManagerWorkRequest.setManuName(manuName);

        FDAEnterprise e1 = null;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getClass().equals(FDAEnterprise.class)) {
                e1 = (FDAEnterprise) enterprise;
            }
        }

        ReturnsProcessOrganization returnsProcessOrganization = e1.getReturnsProcessOrganization();
        returnsProcessOrganization.getWorkQueue().getWorkRequestList().add(returnProcessorWorkRequest);

        // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
        hospitalEnterprise.getInventoryManagementOrganization().getSentWorkQueue().getWorkRequestList().add(returnProcessorWorkRequest);

        JOptionPane.showMessageDialog(null, "Drugs disposed");

        JOptionPane.showMessageDialog(null, "Removed from the inventory", "Success", JOptionPane.INFORMATION_MESSAGE);
        refresh();
    }//GEN-LAST:event_sendToFdaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable requestsTable;
    private javax.swing.JButton sendToFdaButton;
    // End of variables declaration//GEN-END:variables
}
