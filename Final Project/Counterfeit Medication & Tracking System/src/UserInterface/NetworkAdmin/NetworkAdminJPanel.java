/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NetworkAdmin;

import Business.Business;
import Business.Network;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class NetworkAdminJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;
    /**
     * Creates new form NetworkAdminJPanel
     */
    public NetworkAdminJPanel(JPanel userProcessContainer,Network network,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.network=network;
        this.userAccount=userAccount;
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
        addEnterpriseButton = new javax.swing.JButton();
        manageEnterpriseButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Network Admin Work Area");

        addEnterpriseButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        addEnterpriseButton.setText("Add Enterprises");
        addEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnterpriseButtonActionPerformed(evt);
            }
        });

        manageEnterpriseButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        manageEnterpriseButton.setText("Manage Enterprises");
        manageEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(280, 280, 280)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(manageEnterpriseButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(addEnterpriseButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(20, 20, 20)))
                .add(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(51, 51, 51)
                .add(jLabel1)
                .add(46, 46, 46)
                .add(addEnterpriseButton)
                .add(18, 18, 18)
                .add(manageEnterpriseButton)
                .add(147, 147, 147))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseButtonActionPerformed
        // TODO add your handling code here:
        
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer,network,userAccount);
        userProcessContainer.add("ManageEnterprises",manageEnterpriseJPanel);
        
        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseButtonActionPerformed

    private void addEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnterpriseButtonActionPerformed
        // TODO add your handling code here:
        
        AddEnterpriseJPanel addEnterpriseJPanel=new AddEnterpriseJPanel(userProcessContainer,network,userAccount);
        userProcessContainer.add("AddEnterprise",addEnterpriseJPanel);
        
        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_addEnterpriseButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEnterpriseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEnterpriseButton;
    // End of variables declaration//GEN-END:variables
}
