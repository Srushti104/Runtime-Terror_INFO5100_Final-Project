/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugTester;

import Business.Business;
import Business.Enterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class DrugTesterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DrugTesterJPanel
     */
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;

    public DrugTesterJPanel(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewReportedIncidentsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        viewReportedIncidentsButton.setText("View Reported Incidents");
        viewReportedIncidentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportedIncidentsButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Drug Tester Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewReportedIncidentsButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(viewReportedIncidentsButton)
                .addGap(172, 172, 172))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewReportedIncidentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportedIncidentsButtonActionPerformed
        // TODO add your handling code here:
        for (Network network : business.getNetworkDirectory().getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
                    for (UserAccount userAccount1 : organization.getUserAccountDirectory().getUserAccountList()) {

                        if (userAccount == userAccount1) {

                            ViewReportedIncidentsJPanel viewReportedIncidentsJPanel = new ViewReportedIncidentsJPanel(userProcessContainer, network, userAccount);
                            userProcessContainer.add("viewReportedIncidentsJPanel", viewReportedIncidentsJPanel);

                            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                            cardLayout.next(userProcessContainer);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_viewReportedIncidentsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewReportedIncidentsButton;
    // End of variables declaration//GEN-END:variables
}
