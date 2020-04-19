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

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        refreshButton.setBackground(new java.awt.Color(238, 238, 238));
        refreshButton.setForeground(new java.awt.Color(238, 238, 238));
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

        enterpriseTable.setBackground(new java.awt.Color(238, 238, 238));
        enterpriseTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        enterpriseTable.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        enterpriseTable.setForeground(new java.awt.Color(34, 40, 49));
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
        enterpriseTable.setGridColor(new java.awt.Color(34, 40, 49));
        enterpriseTable.setMaximumSize(new java.awt.Dimension(480, 122));
        enterpriseTable.setMinimumSize(new java.awt.Dimension(480, 122));
        enterpriseTable.setPreferredSize(new java.awt.Dimension(480, 122));
        enterpriseTable.setRowHeight(20);
        enterpriseTable.setSelectionBackground(new java.awt.Color(0, 173, 181));
        enterpriseTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(enterpriseTable);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("Manage Enterprise");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));
        jLabel1.setMaximumSize(new java.awt.Dimension(187, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(187, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(187, 30));

        backButton.setBackground(new java.awt.Color(238, 238, 238));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setLabel("");
        backButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        backButton.setMaximumSize(new java.awt.Dimension(60, 60));
        backButton.setMinimumSize(new java.awt.Dimension(60, 60));
        backButton.setPreferredSize(new java.awt.Dimension(60, 60));
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
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(546, 546, 546)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        
        userProcessContainer.remove(this);
        
        CardLayout cardLayout=(CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
         
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
