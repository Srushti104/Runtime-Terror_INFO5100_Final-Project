/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NetworkAdmin;

import Business.Business;
import Business.Enterprise;
import Business.Network;
import Business.Roles.EnterpriseAdminRole;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srush
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;


    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer,Network network,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.network=network;
        this.userAccount=userAccount;
        refresh();
    }
    
    
    
    
     public void refresh()
    {
        
        int rowCount = enterpriseTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) enterpriseTable.getModel()).removeRow(i);
        }

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            Object row[] = new Object[2];
            row[0] = e;
            for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getRole().getClass().equals(EnterpriseAdminRole.class)) {
                   // row[1] = ua.getEmployee().getFirstName() + " " + ua.getEmployee().getLastName();
                    row[1] = ua.getUserName();
                }
            }
            ((DefaultTableModel) enterpriseTable.getModel()).addRow(row);
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

        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        refreshButton.setText("Refresh");

        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Enterprise Name", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manage Enterprise");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addComponent(refreshButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(refreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(backButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        
        userProcessContainer.remove(this);
        
        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
         
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}