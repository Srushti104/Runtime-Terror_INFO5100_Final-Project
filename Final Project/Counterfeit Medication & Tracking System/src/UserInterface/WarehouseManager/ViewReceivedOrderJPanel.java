/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WarehouseManager;

import Business.DistributorEnterprise;
import Business.Drug;
import Business.Enterprise;
import Business.LotOfDrug;
import Business.Network;
import Business.Order;
//import Business.Order;
import Business.Organization;
import Business.Package1;
import Business.Transaction;
import Business.UserAccount;
import Business.WorkRequests.WarehouseManagerWorkRequest;
import Business.WorkRequests.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ViewReceivedOrderJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form ViewReceivedOrderJPanel
     */
    public ViewReceivedOrderJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        addDrugButton.setEnabled(false);
        //viewSuspectDrugsButton.setVisible(false);
        Refresh();
    }

    public void Refresh() {
        int rowcount = requestsTable.getRowCount();

        for (int i = rowcount - 1; i >= 0; i--) {
            ((DefaultTableModel) requestsTable.getModel()).removeRow(i);

        }

        Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);

        /*  SupplierEnterprise e1 = null;
        for(Enterprise enterprise:business.getEnterpriseDirectory().getEnterpriseList())
        {
            if(enterprise.getClass().equals(SupplierEnterprise.class))
                
            {
                e1=(SupplierEnterprise)enterprise;
            }
        }*/
        Organization org = ((DistributorEnterprise) e).getWarehouseOrganization();
        for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {
            WarehouseManagerWorkRequest wareHouseManagerWorkRequest = (WarehouseManagerWorkRequest) workRequest;
            Object row[] = new Object[7];
            row[0] = workRequest;
            row[1] = workRequest.getSender().getEmployee().getFirstName();

            if (workRequest.getReceiver() != null) {
                row[2] = workRequest.getReceiver().getEmployee().getFirstName();

            }

            row[3] = workRequest.getStatus();
            row[4] = wareHouseManagerWorkRequest.getDrug();
            row[5] = wareHouseManagerWorkRequest.getQuantity();
            row[6] = wareHouseManagerWorkRequest.getOrder();
            //  row[4]=workRequest.getDrugName();
            //  row[5]=workRequest.getQuantity();

            ((DefaultTableModel) requestsTable.getModel()).addRow(row);
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
        assignButton = new javax.swing.JButton();
        addDrugButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestsTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        checkCounterfeitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("VIEW REQUESTS");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        assignButton.setBackground(new java.awt.Color(238, 238, 238));
        assignButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        assignButton.setForeground(new java.awt.Color(238, 238, 238));
        assignButton.setText("ASSIGN TO ME");
        assignButton.setMaximumSize(new java.awt.Dimension(200, 33));
        assignButton.setMinimumSize(new java.awt.Dimension(200, 33));
        assignButton.setPreferredSize(new java.awt.Dimension(200, 33));
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        addDrugButton.setBackground(new java.awt.Color(238, 238, 238));
        addDrugButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        addDrugButton.setForeground(new java.awt.Color(238, 238, 238));
        addDrugButton.setText("ADD TO INVENTORY");
        addDrugButton.setMaximumSize(new java.awt.Dimension(200, 33));
        addDrugButton.setMinimumSize(new java.awt.Dimension(200, 33));
        addDrugButton.setPreferredSize(new java.awt.Dimension(200, 33));
        addDrugButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugButtonActionPerformed(evt);
            }
        });

        requestsTable.setBackground(new java.awt.Color(238, 238, 238));
        requestsTable.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        requestsTable.setForeground(new java.awt.Color(34, 40, 49));
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
        requestsTable.setGridColor(new java.awt.Color(34, 40, 49));
        requestsTable.setRowHeight(20);
        requestsTable.setSelectionBackground(new java.awt.Color(0, 173, 181));
        requestsTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(requestsTable);

        refreshButton.setBackground(new java.awt.Color(238, 238, 238));
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/refresh.png"))); // NOI18N
        refreshButton.setBorder(null);
        refreshButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        refreshButton.setMaximumSize(new java.awt.Dimension(40, 40));
        refreshButton.setMinimumSize(new java.awt.Dimension(40, 40));
        refreshButton.setPreferredSize(new java.awt.Dimension(40, 40));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(238, 238, 238));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        backButton.setMaximumSize(new java.awt.Dimension(60, 60));
        backButton.setMinimumSize(new java.awt.Dimension(60, 60));
        backButton.setPreferredSize(new java.awt.Dimension(60, 60));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        checkCounterfeitButton.setBackground(new java.awt.Color(238, 238, 238));
        checkCounterfeitButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        checkCounterfeitButton.setForeground(new java.awt.Color(238, 238, 238));
        checkCounterfeitButton.setText("CHECK COUNTERFEIT");
        checkCounterfeitButton.setMaximumSize(new java.awt.Dimension(200, 33));
        checkCounterfeitButton.setMinimumSize(new java.awt.Dimension(200, 33));
        checkCounterfeitButton.setPreferredSize(new java.awt.Dimension(200, 33));
        checkCounterfeitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCounterfeitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(569, 569, 569)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(checkCounterfeitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(addDrugButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDrugButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCounterfeitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(288, 288, 288))
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

            workRequest.setStatus("Order Received");

            //addDrugButton.setEnabled(true);
            Refresh();
        } else {
            JOptionPane.showMessageDialog(this, "The task is already assigned to other person");
        }
    }//GEN-LAST:event_assignButtonActionPerformed

    private void addDrugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        WarehouseManagerWorkRequest wareHouseManagerWorkRequest = (WarehouseManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        if (wareHouseManagerWorkRequest.getReceiver() != null && userAccount == wareHouseManagerWorkRequest.getReceiver()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getClass().equals(DistributorEnterprise.class)) {
                    DistributorEnterprise distributorEnterprise = (DistributorEnterprise) enterprise;

                    int q = wareHouseManagerWorkRequest.getQuantity();

                    Order ord = wareHouseManagerWorkRequest.getOrder();

                    for (LotOfDrug lotOfDrug : ord.getLotOfDrugsList()) {
                        for (Package1 p : lotOfDrug.getPackageList()) {
                            distributorEnterprise.getInventoryCatalog().newInventoryItem(p);
                            addDrugButton.setEnabled(false);
                        }

                    }

                    JOptionPane.showMessageDialog(null, "Drugs added to Inventory");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please assign it and then proceed/Task might be assigned to other person");
        }
    }//GEN-LAST:event_addDrugButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        Refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void checkCounterfeitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCounterfeitButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = requestsTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }

        WarehouseManagerWorkRequest wareHouseManagerWorkRequest = (WarehouseManagerWorkRequest) requestsTable.getValueAt(selectedRow, 0);

        for (Transaction transaction : network.getTransactionHistory().getTransactionList()) {
            Order ord = wareHouseManagerWorkRequest.getOrder();

            for (LotOfDrug lotOfDrug : ord.getLotOfDrugsList()) {

                for (Package1 p : lotOfDrug.getPackageList()) {
                    if (transaction.getPackage().getPackageID() == p.getPackageID()) {
                        if (transaction.getManufacturerEnterprise() == null || transaction.getDistributorEnterprise() == null) {
                            JOptionPane.showMessageDialog(null, "Drugs are suspected");
                            addDrugButton.setEnabled(false);
                            //viewSuspectDrugsButton.setVisible(true);
                            //viewSuspectDrugsButton.setVisible(true);
                            p.setPackageStatus("Suspect Drug");

                            //viewSuspectDrugsButton.setEnabled(true);
                            int lotid = p.getDisLotID();

                            for (Package1 p1 : lotOfDrug.getPackageList()) {
                                if (p1.getDisLotID() == lotid) {
                                    p1.setPackageStatus("Suspect Drug");

                                }
                            }

                        } else if (transaction.getManufacturerEnterprise() != null && transaction.getManufacturerEnterprise().getLicenseNumber() == 0) {
                            JOptionPane.showMessageDialog(null, "Not a licensed manufacturer,drugs are not safe");
                        }

                    }

                }

            }

        }

        addDrugButton.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Drugs are safe");


    }//GEN-LAST:event_checkCounterfeitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrugButton;
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkCounterfeitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable requestsTable;
    // End of variables declaration//GEN-END:variables
}
