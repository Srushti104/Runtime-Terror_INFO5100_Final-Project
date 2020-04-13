/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WarehouseManager;

import Business.Business;
import Business.DistributorEnterprise;
import Business.Enterprise;
import Business.InventoryItem;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import UserInterface.BusinessAdmin.AdminJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nived
 */
public class WarehouseManagerJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;

    /**
     * Creates new form WarehouseManagerJPanel
     */
    public WarehouseManagerJPanel(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount=userAccount;
//        imaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/warehouse.jpg")));
//        
//        infoLabel.setVisible(false);
//        alertLabel.setVisible(false);
        
        
        
     //  refresh();
    }
    
    public void refresh()
    {
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
                            if(enterprise.getClass().equals(DistributorEnterprise.class))
                            {
                                DistributorEnterprise distributorEnterprise=(DistributorEnterprise)enterprise;
                                
                                if(distributorEnterprise.getLicenseNumber()==0)
                                {
                                    orderDrugButton.setVisible(false);
                                    checkInventoryButton.setVisible(false);
                                    viewRequestedOrdersButton.setVisible(false);
                                    viewRecievedOrderButton.setVisible(false);
                                    
                                }
                                boolean flag=false;
                                for(InventoryItem inventoryItem:distributorEnterprise.getInventoryCatalog().getInventoryList())
                                {
                                    if(inventoryItem.getPackage1().getPackageStatus().equalsIgnoreCase("Illegetimate Drug"))
                                    {
                                        flag=true;
                                    }
                                
                                
                                }
                                
                                
                            }
                        }
                    }
                }
            }
        }
        
//        for(Network network:business.getNetworkDirectory().getNetworkList())
//        {
//            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList())
//            {
//                if(enterprise.getClass().equals(DistributorEnterprise.class))
//                {
//                    
//                DistributorEnterprise distributorEnterprise=(DistributorEnterprise)enterprise;
//            
////            for(Transaction transaction:network.getTransactionHistory().getTransactionList())
////            {
////                if(transaction.getDistributorEnterprise() == null)
////                {
////                    return;
////                }
////             if(transaction.getDistributorEnterprise().getEnterpriseName()== distributorEnterprise.getEnterpriseName())
////             {
////                
////             }
////            }
//                }
//            }
//        }
        
        
        
        
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
        orderDrugButton = new javax.swing.JButton();
        viewRequestedOrdersButton = new javax.swing.JButton();
        checkInventoryButton = new javax.swing.JButton();
        viewRecievedOrderButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Warehouse Manager Work Area");

        orderDrugButton.setText("Order Drugs");
        orderDrugButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDrugButtonActionPerformed(evt);
            }
        });

        viewRequestedOrdersButton.setText("View Requested Orders");
        viewRequestedOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestedOrdersButtonActionPerformed(evt);
            }
        });

        checkInventoryButton.setText("Check Inventory");
        checkInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInventoryButtonActionPerformed(evt);
            }
        });

        viewRecievedOrderButton.setText("View Received Orders");
        viewRecievedOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecievedOrderButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jLabel1)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(viewRecievedOrderButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(checkInventoryButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(orderDrugButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(viewRequestedOrdersButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                .add(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(orderDrugButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(viewRequestedOrdersButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(checkInventoryButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(viewRecievedOrderButton)
                .add(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderDrugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDrugButtonActionPerformed
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
                            OrderDrugsJPanel orderDrugsJPanel=new OrderDrugsJPanel(userProcessContainer,network,userAccount);
                            userProcessContainer.add("OrderDRugs",orderDrugsJPanel);
                            
                            CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
                            cardLayout.next(userProcessContainer);
                            
                            
                            
                            
                            
                            
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_orderDrugButtonActionPerformed

    private void viewRequestedOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestedOrdersButtonActionPerformed
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
        
        
        DistributorEnterprise e=(DistributorEnterprise)network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        Organization org=e.getWarehouseOrganization();
        ViewRequestedOrdersJPanel viewRequestedOrdersJPanel=new ViewRequestedOrdersJPanel(userProcessContainer,org.getSentWorkQueue());
        userProcessContainer.add("viewReqOrders", viewRequestedOrdersJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
                }
            }
        }
        }
        }
       
    }//GEN-LAST:event_viewRequestedOrdersButtonActionPerformed

    private void checkInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInventoryButtonActionPerformed
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
                            CheckWarehouseInventoryJPanel checkWarehouseInventoryJPanel=new CheckWarehouseInventoryJPanel(userProcessContainer,network,userAccount);
                            userProcessContainer.add("CheckInv",checkWarehouseInventoryJPanel);
                            
                            CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
                            cardLayout.next(userProcessContainer);
                            
                            
                            
                            
                            
                            
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_checkInventoryButtonActionPerformed

    private void viewRecievedOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecievedOrderButtonActionPerformed
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
                        ViewReceivedOrderJPanel viewReceivedOrderJPanel=new ViewReceivedOrderJPanel(userProcessContainer,network,userAccount);
                        userProcessContainer.add("ViewRece",viewReceivedOrderJPanel);
                        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
                        cardLayout.next(userProcessContainer);

                    }

                }
            }
        }
        }

    }//GEN-LAST:event_viewRecievedOrderButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkInventoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orderDrugButton;
    private javax.swing.JButton viewRecievedOrderButton;
    private javax.swing.JButton viewRequestedOrdersButton;
    // End of variables declaration//GEN-END:variables
}
