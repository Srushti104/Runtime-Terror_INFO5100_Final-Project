/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesManager;

import Business.Business;
import Business.DistributorEnterprise;
import Business.Enterprise;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class SalesManagerJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;

    /**
     * Creates new form SalesManagerJPanel
     */
    public SalesManagerJPanel(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount=userAccount;
      //  salesPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/salesmgr.jpg")));
        
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
        viewOrderRequestButton = new javax.swing.JButton();
        viewSentOrdersButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("SALES MANAGER WORK-AREA");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        viewOrderRequestButton.setBackground(new java.awt.Color(57, 62, 70));
        viewOrderRequestButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        viewOrderRequestButton.setForeground(new java.awt.Color(238, 238, 238));
        viewOrderRequestButton.setLabel("VIEW ORDER REQUESTS");
        viewOrderRequestButton.setMaximumSize(new java.awt.Dimension(200, 33));
        viewOrderRequestButton.setMinimumSize(new java.awt.Dimension(200, 33));
        viewOrderRequestButton.setPreferredSize(new java.awt.Dimension(200, 33));
        viewOrderRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderRequestButtonActionPerformed(evt);
            }
        });

        viewSentOrdersButton.setBackground(new java.awt.Color(57, 62, 70));
        viewSentOrdersButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        viewSentOrdersButton.setForeground(new java.awt.Color(238, 238, 238));
        viewSentOrdersButton.setLabel("VIEW SENT REQUESTS");
        viewSentOrdersButton.setMaximumSize(new java.awt.Dimension(200, 33));
        viewSentOrdersButton.setMinimumSize(new java.awt.Dimension(200, 33));
        viewSentOrdersButton.setPreferredSize(new java.awt.Dimension(200, 33));
        viewSentOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSentOrdersButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(514, 514, 514)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(viewOrderRequestButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(viewSentOrdersButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(513, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(120, 120, 120)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(100, 100, 100)
                .add(viewOrderRequestButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(50, 50, 50)
                .add(viewSentOrdersButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewOrderRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderRequestButtonActionPerformed
        // TODO add your handling code here:
        
        for(Network network:business.getNetworkDirectory().getNetworkList())
        {
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList())
                
            {
                for(Organization organization:enterprise.getOrganizationDirectory().getOrgList())
                {
                for(UserAccount userAccount1:organization.getUserAccountDirectory().getUserAccountList())
                {
                    if(userAccount == userAccount1){
                        ViewOrdersJPanel viewOrdersJPanel=new ViewOrdersJPanel(userProcessContainer,network,userAccount);
                        userProcessContainer.add("ViewORdRE",viewOrdersJPanel);
                        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
                        cardLayout.next(userProcessContainer);

                    }

                }
            }
        }
        }

    }//GEN-LAST:event_viewOrderRequestButtonActionPerformed

    private void viewSentOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSentOrdersButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        for(Network network:business.getNetworkDirectory().getNetworkList())
        {
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList())
        {
            
        for(Organization organization:enterprise.getOrganizationDirectory().getOrgList())
        {
            for(UserAccount userAccount1:organization.getUserAccountDirectory().getUserAccountList())
            {
                if(userAccount==userAccount1)
                {
        
        if(enterprise.getClass().equals(ManufacturerEnterprise.class))
        {
        ManufacturerEnterprise e=(ManufacturerEnterprise)network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        Organization org=e.getSalesManagementOrganization();
        ViewSentOrdersJPanel viewSentOrdersJPanel=new ViewSentOrdersJPanel(userProcessContainer,org.getSentWorkQueue());
        userProcessContainer.add("ViewSentordersJPanel", viewSentOrdersJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
                }
        
        else if(enterprise.getClass().equals(DistributorEnterprise.class))
        {
        DistributorEnterprise e=(DistributorEnterprise)network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        Organization org=e.getSalesManagementOrganization();
        ViewSentOrdersJPanel viewSentOrdersJPanel=new ViewSentOrdersJPanel(userProcessContainer,org.getSentWorkQueue());
        userProcessContainer.add("ViewSordJPanel", viewSentOrdersJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
                }
            }
        }
        }
        }
        }
    }//GEN-LAST:event_viewSentOrdersButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewOrderRequestButton;
    private javax.swing.JButton viewSentOrdersButton;
    // End of variables declaration//GEN-END:variables
}
