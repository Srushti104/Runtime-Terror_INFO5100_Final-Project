/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.Business;
import Business.Drug;
import Business.Package1;
import Business.Doctor;
import Business.UserAccount;
import java.awt.CardLayout;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ViewDrugsPurchasedJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;

    /**
     * Creates new form ViewDrugsPurchasedJPanel
     */
    public ViewDrugsPurchasedJPanel(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        refresh();
    }

    public void refresh() {
        int rowcount = drugPurchasedJtable.getRowCount();

        for (int i = rowcount - 1; i >= 0; i--) {
            ((DefaultTableModel) drugPurchasedJtable.getModel()).removeRow(i);

        }
        Doctor doc = userAccount.getDoctor();
        Drug tempDrug = null;
        Set<String> drugNameSet = new HashSet<>();
        for (Package1 package1 : doc.getDrugCatalog().getPackDoctorList()) //  for(InventoryItem inventoryItem:storeInventory.getInventoryList())
        {
            Object row[] = new Object[3];

//            if (package1.getDrug() == tempDrug) {
//                break;
//            } else {
            if (drugNameSet.add(package1.getDrug().getDrugName())) {

                row[0] = package1.getDrug().getDrugName();
                row[1] = doc.getDrugCatalog().getTotalQuantity(package1.getDrug());
                // row[2]=hospitalEnterprise.getInventoryCatalog().getTotalQuantity(inventoryItem.getPackage1().getDrug());

                tempDrug = package1.getDrug();

                ((DefaultTableModel) drugPurchasedJtable.getModel()).addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        drugPurchasedJtable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("DRUGS PURCHASED");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));
        jLabel1.setMaximumSize(new java.awt.Dimension(165, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(165, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(165, 30));

        drugPurchasedJtable.setBackground(new java.awt.Color(238, 238, 238));
        drugPurchasedJtable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        drugPurchasedJtable.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        drugPurchasedJtable.setForeground(new java.awt.Color(34, 40, 49));
        drugPurchasedJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        drugPurchasedJtable.setMaximumSize(new java.awt.Dimension(680, 122));
        drugPurchasedJtable.setMinimumSize(new java.awt.Dimension(680, 122));
        drugPurchasedJtable.setName(""); // NOI18N
        drugPurchasedJtable.setPreferredSize(new java.awt.Dimension(680, 122));
        drugPurchasedJtable.setRowHeight(20);
        drugPurchasedJtable.setSelectionBackground(new java.awt.Color(0, 173, 181));
        drugPurchasedJtable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(drugPurchasedJtable);

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(558, 558, 558)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable drugPurchasedJtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
