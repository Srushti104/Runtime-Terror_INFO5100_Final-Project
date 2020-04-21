/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InventoryManager;

import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.InventoryItem;
import Business.WorkRequests.InventoryManagerWorkRequest;
import Business.LotOfDrug;
import Business.Network;
import Business.Order;
import Business.Organization;
import Business.Package1;
import Business.Doctor;
import Business.Transaction;
import Business.UserAccount;
import Business.WorkRequests.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ViewReceivedOrdersJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form ViewReceivedOrdersJPanel
     */
    public ViewReceivedOrdersJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        addInventoryButton.setEnabled(false);
        // sendButton.setEnabled(false);
        Refresh();
        buttonEnable();
    }

    public void Refresh() {
        int rowcount = requestsTable.getRowCount();

        for (int i = rowcount - 1; i >= 0; i--) {
            ((DefaultTableModel) requestsTable.getModel()).removeRow(i);

        }

        Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

        if (e.getClass().equals(HospitalEnterprise.class)) {
            HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) e;
            Organization org = ((HospitalEnterprise) e).getInventoryManagementOrganization();
            for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {

                InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) workRequest;
                UserAccount sender = inventoryManagerWorkRequest.getSender();
                Object row[] = new Object[7];
                row[0] = workRequest;

                row[1] = workRequest.getSender();

                if (workRequest.getReceiver() != null) {
                    row[2] = workRequest.getReceiver().getEmployee().getFirstName();

                }

                row[3] = workRequest.getStatus();
                row[4] = inventoryManagerWorkRequest.getDrug();
                if (sender.getEmployee() != null) {
                    row[5] = inventoryManagerWorkRequest.getQuantity();
                } else {
                    row[5] = inventoryManagerWorkRequest.getQt();
                }
                row[6] = inventoryManagerWorkRequest.getOrder();
                //  row[4]=workRequest.getDrugName();
                //  row[5]=workRequest.getQuantity();

                ((DefaultTableModel) requestsTable.getModel()).addRow(row);
            }
        }

    }

    public void buttonEnable() {

        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }
        InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getClass().equals(HospitalEnterprise.class)) {
                HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) enterprise;
                {
                    for (UserAccount userAccount : hospitalEnterprise.getUserAccountDirectory().getUserAccountList()) {
                        if (inventoryManagerWorkRequest.getSender() == userAccount) {
                            checkCounterFietButton.setVisible(false);
                            addInventoryButton.setVisible(false);
                            sendButton.setEnabled(true);
                        }
                    }
                }
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
        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        addInventoryButton = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        checkCounterFietButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("View Received Orders");

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        requestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Drug Name", "Quantity", "Order"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestsTable);

        addInventoryButton.setText("Add To Inventory");
        addInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInventoryButtonActionPerformed(evt);
            }
        });

        assignButton.setText("Assign to me");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        checkCounterFietButton.setText("Check Counterfeit");
        checkCounterFietButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCounterFietButtonActionPerformed(evt);
            }
        });

        sendButton.setText("Send To Doctor");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(assignButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkCounterFietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addInventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addInventoryButton)
                    .addComponent(assignButton)
                    .addComponent(checkCounterFietButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendButton)
                .addGap(158, 158, 158))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        Refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInventoryButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        if (inventoryManagerWorkRequest.getReceiver() != null && userAccount == inventoryManagerWorkRequest.getReceiver()) {

            Enterprise e2 = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            if (e2.getClass().equals(HospitalEnterprise.class)) {

                HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) e2;

                int q = inventoryManagerWorkRequest.getQuantity();

                Order ord = inventoryManagerWorkRequest.getOrder();

                for (LotOfDrug lotOfDrug : ord.getLotOfDrugsList()) {
                    for (Package1 p : lotOfDrug.getPackageList()) {
                        hospitalEnterprise.getInventoryCatalog().newInventoryItem(p);
                        addInventoryButton.setEnabled(false);
                    }
                }

                    //hospitalEnterprise.getInventoryCatalog().newInventoryItem(inventoryManagerWorkRequest.getOrder());
                    JOptionPane.showMessageDialog(this, "Drugs added to Inventory");
                    inventoryManagerWorkRequest.setStatus("added to hospital inventory");
                    Refresh();
                
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please assign it and then proceed/Task might be assigned to other person");
        }
    }//GEN-LAST:event_addInventoryButtonActionPerformed

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

            workRequest.setStatus("Order Recieved");

            addInventoryButton.setEnabled(true);

            Refresh();
            buttonEnable();
            sendButton.setEnabled(false);
            if (workRequest.getSender().getDoctor() != null) {
                sendButton.setEnabled(true);
                addInventoryButton.setEnabled(false);
                checkCounterFietButton.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "The task is already assogned to other person");
        }
    }//GEN-LAST:event_assignButtonActionPerformed

    private void checkCounterFietButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCounterFietButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        for (Transaction transaction : network.getTransactionHistory().getTransactionList()) {
            Order ord = inventoryManagerWorkRequest.getOrder();

            for (LotOfDrug lotOfDrug : ord.getLotOfDrugsList()) {

                for (Package1 p : lotOfDrug.getPackageList()) {
                    if (transaction.getPackage().getPackageID() == p.getPackageID()) {
                        if (transaction.getManufacturerEnterprise() == null || transaction.getDistributorEnterprise() == null || transaction.getHospitalEnterprise() == null) {
                            if (p.getPackageStatus() == "Suspect Drug") {
                                JOptionPane.showMessageDialog(null, "Drugs are suspected");
                                addInventoryButton.setEnabled(false);
                                p.setPackageStatus("Suspect Drug");

                                int lotid = p.getDisLotID();

                                for (Package1 p1 : lotOfDrug.getPackageList()) {
                                    if (p1.getDisLotID() == lotid) {
                                        p1.setPackageStatus("Suspect Drug");

                                    }
                                }

                            }
                        }

                    }

                }

            }

        }

        JOptionPane.showMessageDialog(null, "Drugs are safe");


    }//GEN-LAST:event_checkCounterFietButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        WorkRequest workRequest = (WorkRequest) requestsTable.getValueAt(selectedRow, 0);

        if (workRequest.getReceiver() != null) {

           // workRequest.setReceiver(userAccount);

            workRequest.setStatus("Sent to doctor");
            Refresh();
        }
            InventoryManagerWorkRequest inventoryManagerWorkRequest = (InventoryManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);
            UserAccount sender = inventoryManagerWorkRequest.getSender();
            Doctor doc = sender.getDoctor();
           
            Order order = new Order();
            HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);
            Enterprise en1 = network.getEnterpriseDirectory().getMyEnterprise(inventoryManagerWorkRequest.getSender());

            if (order.getOrderSize() < inventoryManagerWorkRequest.getQt()) {

                int i1 = inventoryManagerWorkRequest.getQt();

                while (i1 > 0) {
                    LotOfDrug lotOfDrug = new LotOfDrug();
                    for (int j = 0; j < 5 && i1 > 0; j++) {
                        InventoryItem tempPackage = null;
                        for (InventoryItem itm : hospitalEnterprise.getInventoryCatalog().getInventoryList()) {

                            if (inventoryManagerWorkRequest.getDrug() == itm.getPackage1().getDrug()) {

                                if (itm.getPackage1().getPackageStatus() != "Illegetimate Drug") {
                                    /*for(Transaction transaction1:network.getTransactionHistory().getTransactionList())
                               {
                                   if(transaction1.getPackage1().getPackageID()==itm.getPackage1().getPackageID())
                                   {
                                       if(transaction1.getDispenser()!= null)
                                       {
                                           
                                       }
                                  
                                   
                                       
                                   }
                               }*/

                                    lotOfDrug.addPackage(itm.getPackage1());
                                    doc.getDrugCatalog().newDrugPackage(itm.getPackage1());
                                    for (Transaction transaction : network.getTransactionHistory().getTransactionList()) {
                                        if (transaction.getPackage().getPackageID() == itm.getPackage1().getPackageID()) {

                                            transaction.setDoctor(doc);
                                            transaction.setTransactionStatus("Sold to Doctor");

                                        }
                                    }
                                    itm.getPackage1().setHosID(lotOfDrug.getLotID());
                                    tempPackage = itm;
                                    break;
                                }

                            }
                        }
                        hospitalEnterprise.getInventoryCatalog().getInventoryList().remove(tempPackage);

                        i1--;
                    }
                    order.addLot(lotOfDrug);
                }

            }


            HospitalEnterprise en2 = (HospitalEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            JOptionPane.showMessageDialog(null, "Drugs sent To Doctor");


    }//GEN-LAST:event_sendButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInventoryButton;
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkCounterFietButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable requestsTable;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
