/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalManager;

import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.Network;
import Business.Doctor;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ManageDoctorJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form ManagePatientJPanel
     */
    public ManageDoctorJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        refresh();
    }

    public void refresh() {

        int rowCount = doctorTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) doctorTable.getModel()).removeRow(i);
        }

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getClass().equals(HospitalEnterprise.class)) {
                HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) enterprise;

                for (Doctor doc : hospitalEnterprise.getDoctorDirectory().getDoctorList()) {
                    Object row[] = new Object[5];
                    row[0] = doc.getFirstName() + " " + doc.getLastName();
                    row[0] = doc.getFirstName();
                    row[1] = doc.getAddress().getLine1();
                    row[2] = doc.getAddress().getLine2();
                    row[3] = doc.getAddress().getCity();
                    row[4] = doc.getAddress().getZipcode();

                    ((DefaultTableModel) doctorTable.getModel()).addRow(row);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        doctorTable.setBackground(new java.awt.Color(238, 238, 238));
        doctorTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        doctorTable.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        doctorTable.setForeground(new java.awt.Color(34, 40, 49));
        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Address 1", "Address 2", "City", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorTable.setGridColor(new java.awt.Color(34, 40, 49));
        doctorTable.setMaximumSize(new java.awt.Dimension(1000, 122));
        doctorTable.setMinimumSize(new java.awt.Dimension(1000, 122));
        doctorTable.setPreferredSize(new java.awt.Dimension(1000, 122));
        doctorTable.setRowHeight(20);
        doctorTable.setSelectionBackground(new java.awt.Color(0, 173, 181));
        doctorTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(doctorTable);

        refreshButton.setBackground(new java.awt.Color(238, 238, 238));
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/refresh.png"))); // NOI18N
        refreshButton.setBorder(null);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(238, 238, 238));
        backButton.setForeground(new java.awt.Color(238, 238, 238));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setPreferredSize(new java.awt.Dimension(60, 60));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("DOCTOR PROFILE");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable doctorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
