/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WarehouseManager;

import Business.DistributorEnterprise;
import Business.Drug;
import Business.Enterprise;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.SalesManagementOrganization;
import Business.WorkRequests.SalesManagerWorkRequest;
import Business.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class OrderDrugsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form OrderDrugsJPanel
     */
    public OrderDrugsJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
//        manufacturerComboBox.removeAllItems();
//        drugComboBox.removeAllItems();
        //  refresh();
    }

    public void refresh() {

        //manufacturerComboBox.removeAllItems();
        //drugComboBox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

            if (enterprise.getClass().equals(ManufacturerEnterprise.class)) {
                //manufacturerComboBox.addItem(enterprise);
                ManufacturerEnterprise manufacturerEnterprise = (ManufacturerEnterprise) enterprise;
                if (manufacturerEnterprise.getLicenseNumber() != 0) {
                    //                 manufacturerComboBox.addItem(enterprise);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        orderDrugButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        resultField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        drugNameField = new javax.swing.JTextField();
        drugComboBox = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Order Drugs");

        jLabel2.setText("Name:");

        jLabel3.setText("Drugs:");

        jLabel4.setText("Quantity:");

        orderDrugButton.setText("Order Drug");
        orderDrugButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDrugButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/backButton.jpg"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Result:");

        drugComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderDrugButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantityField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(33, 33, 33)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(drugNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(drugComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(388, 388, 388))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(drugComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(drugNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(orderDrugButton)
                .addGap(173, 173, 173))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderDrugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDrugButtonActionPerformed
        // TODO add your handling code here:

        // String drugname=(String)drugComboBox.getSelectedItem();
        // String manuName=(String)manufacturerComboBox.getSelectedItem();
              Drug drug = (Drug) drugComboBox.getSelectedItem();
        if (quantityField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the value for the quantity required");

        } else {
            if (quantityField.getText().isEmpty() == false) {
                try {
                    String stringPrice = quantityField.getText();
                    if (stringPrice.isEmpty() == false) {
                        int price = Integer.parseInt(stringPrice);

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter proper value for quantity");
                    return;
                }

            }
            SalesManagerWorkRequest salesManagerWorkRequest = new SalesManagerWorkRequest();
            salesManagerWorkRequest.setSender(userAccount);
            salesManagerWorkRequest.setRequestDate(new Date());
            salesManagerWorkRequest.setMessage("Request for Drugs");
            salesManagerWorkRequest.setStatus("Request for Drug Sent");
            //productManagerWorkRequest.setManuName(manufacturerComboBox.getSelectedItem());
            salesManagerWorkRequest.setQuant(Integer.parseInt(quantityField.getText()));
            //licenseManagerWorkRequest.setDrugManu(drugaManuTextArea.getText());
            salesManagerWorkRequest.setResult(resultField.getText());
            //  salesManagerWorkRequest.setDrName(drug.getDrugName());
            //    salesManagerWorkRequest.setDrug(drugNameField.getText());
            salesManagerWorkRequest.setDrName(drug.getDrugName());
            salesManagerWorkRequest.setDrug(drug);
       //     salesManagerWorkRequest.setManuName(manuNameField.getText());

            DistributorEnterprise e = (DistributorEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

            ManufacturerEnterprise e1 = null;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getClass().equals(ManufacturerEnterprise.class)) {
                    e1 = (ManufacturerEnterprise) enterprise;
                }
            }

            SalesManagementOrganization salesManagementOrganization = e1.getSalesManagementOrganization();
            salesManagementOrganization.getWorkQueue().getWorkRequestList().add(salesManagerWorkRequest);

            // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
            e.getWarehouseOrganization().getSentWorkQueue().getWorkRequestList().add(salesManagerWorkRequest);

            JOptionPane.showMessageDialog(null, "Order for Drugs Sent");
        }
    }//GEN-LAST:event_orderDrugButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> drugComboBox;
    private javax.swing.JTextField drugNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton orderDrugButton;
    private javax.swing.JTextField quantityField;
    private javax.swing.JTextField resultField;
    // End of variables declaration//GEN-END:variables
}
