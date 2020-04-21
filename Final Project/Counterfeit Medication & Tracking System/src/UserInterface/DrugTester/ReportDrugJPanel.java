/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugTester;

import Business.Business;
import Business.WorkRequests.DrugTesterWorkRequest;
import Business.Enterprise;
import Business.FDAEnterprise;
import Business.HospitalEnterprise;
import Business.InspectingOrganization;
import Business.InventoryManagementOrganization;
import Business.Network;
import Business.WorkRequests.InventoryManagerWorkRequest;
import Business.WorkRequests.LawEnforcementInspectorWorkRequest;
import Business.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bobba
 */
public class ReportDrugJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    DrugTesterWorkRequest drugTesterWorkRequest;
    UserAccount userAccount;
    Business business;

    /**
     * Creates new form ReportDrugJPanel
     */
    public ReportDrugJPanel(JPanel userProcessContainer, DrugTesterWorkRequest drugTesterWorkRequest, UserAccount userAccount, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.drugTesterWorkRequest = drugTesterWorkRequest;
        this.userAccount = userAccount;
        this.business = business;
        reportStatusComboBox.removeAllItems();
        reportStatusComboBox.addItem("Illegitimate Drug");
        reportStatusComboBox.addItem("Proper Drug");
        reportStatusComboBox.addItem("Suspect Drug");
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
        reportStatusComboBox = new javax.swing.JComboBox();
        reportButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("TESTING FOR DRUG ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 40, 49));
        jLabel2.setText("SELECT OUTCOME");

        reportStatusComboBox.setBackground(new java.awt.Color(238, 238, 238));
        reportStatusComboBox.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        reportStatusComboBox.setForeground(new java.awt.Color(34, 40, 49));
        reportStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        reportStatusComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));

        reportButton.setBackground(new java.awt.Color(57, 62, 70));
        reportButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        reportButton.setForeground(new java.awt.Color(238, 238, 238));
        reportButton.setText("SUBMIT REPORT");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(238, 238, 238));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(459, 459, 459)
                            .addComponent(jLabel2)
                            .addGap(50, 50, 50)
                            .addComponent(reportStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(407, 407, 407)
                            .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:

        if (reportStatusComboBox.getSelectedItem() == null) {
            return;
        }

        String result = (String) reportStatusComboBox.getSelectedItem();

        drugTesterWorkRequest.getPackage1().setPackageStatus(result);
        drugTesterWorkRequest.getPackage1().setPackageStatus("Illegitimate Drug");

        if (reportStatusComboBox.getSelectedItem() == "Illegitimate Drug" || reportStatusComboBox.getSelectedItem() == "Suspect Drug") {
            LawEnforcementInspectorWorkRequest lawEnforcementInspectorWorkRequest = new LawEnforcementInspectorWorkRequest();
            lawEnforcementInspectorWorkRequest.setSender(userAccount);
            lawEnforcementInspectorWorkRequest.setRequestDate(new Date());
            lawEnforcementInspectorWorkRequest.setStatus(result);
            lawEnforcementInspectorWorkRequest.setResultTest(result);
            // managerWokrRequest.setLicenseNumber(Integer.parseInt(licenseNumberField.getText()));
            lawEnforcementInspectorWorkRequest.setMessage("Problem Reported");
            lawEnforcementInspectorWorkRequest.setDrug(drugTesterWorkRequest.getDrug());
            lawEnforcementInspectorWorkRequest.setEnterprise(drugTesterWorkRequest.getEnterprise());
            lawEnforcementInspectorWorkRequest.setPackage1(drugTesterWorkRequest.getPackage1());

            for (Network network : business.getNetworkDirectory().getNetworkList()) {
                FDAEnterprise e = (FDAEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

                //userAccount.getWorkQueue().getWorkRequestList().add(shipWorkRequest);
                JOptionPane.showMessageDialog(null, "Incident report sent");
                JOptionPane.showMessageDialog(null, "Processed succesfully");

                FDAEnterprise d1 = null;
                for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise1.getClass().equals(FDAEnterprise.class)) {
                        d1 = (FDAEnterprise) enterprise1;
                    }
                }

                InspectingOrganization inspectingOrganization = d1.getInspectingOrganization();
                inspectingOrganization.getWorkQueue().getWorkRequestList().add(lawEnforcementInspectorWorkRequest);
                //SalesManagementOrganization salesOrganization=e1.getSalesManagementOrganization();
                //  salesOrganization.getWorkQueue().getWorkRequestList().add(salesRequest);

                // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
                e.getDrugTestingOrganization().getSentWorkQueue().getWorkRequestList().add(lawEnforcementInspectorWorkRequest);
            }
        } else if (reportStatusComboBox.getSelectedItem() == "Proper Drug") {
            UserAccount sender = drugTesterWorkRequest.getSender();
            for (Network network : business.getNetworkDirectory().getNetworkList()) {
                Enterprise en = network.getEnterpriseDirectory().getMyEnterprise(sender);

                if (en.getClass().equals(HospitalEnterprise.class)) {
                    InventoryManagerWorkRequest inventoryManagerWorkRequest = new InventoryManagerWorkRequest();
                    inventoryManagerWorkRequest.setSender(userAccount);
                    inventoryManagerWorkRequest.setRequestDate(new Date());
                    inventoryManagerWorkRequest.setMessage("Drugs Reported is Normal");
                    inventoryManagerWorkRequest.setStatus("Drug Reported is Normal");
                    // shipmentManagerWorkRequest.setManuName(manuNameField.getText());
                    // wareHouseManagerWorkRequest.setDrugName(shipmentManagerWorkRequest.getDrName());
                    inventoryManagerWorkRequest.setDrug(drugTesterWorkRequest.getPackage1().getDrug());

                    FDAEnterprise e = (FDAEnterprise) network.getEnterpriseDirectory().getMyEnterprise(userAccount);

                    HospitalEnterprise e1 = null;
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise.getClass().equals(HospitalEnterprise.class)) {
                            e1 = (HospitalEnterprise) enterprise;
                        }
                    }

                    InventoryManagementOrganization inventoryManagementOrganization = e1.getInventoryManagementOrganization();
                    inventoryManagementOrganization.getWorkQueue().getWorkRequestList().add(inventoryManagerWorkRequest);

                    // userAccount.getWorkQueue().getWorkRequestList().add(salesRequest);
                    e.getDrugTestingOrganization().getSentWorkQueue().getWorkRequestList().add(inventoryManagerWorkRequest);

                    JOptionPane.showMessageDialog(null, "Work Request Sent");
                }
            }
        }

    }//GEN-LAST:event_reportButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reportButton;
    private javax.swing.JComboBox reportStatusComboBox;
    // End of variables declaration//GEN-END:variables
}
