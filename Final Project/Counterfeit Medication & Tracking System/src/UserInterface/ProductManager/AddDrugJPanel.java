/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductManager;

import Business.Business;
import Business.Drug;
import Business.Enterprise;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.Organization;
import Business.WorkRequests.ProductManagerWorkRequest;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class AddDrugJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    ProductManagerWorkRequest productManagerWorkRequest;
    UserAccount userAccount;
    //Network network;

    /**
     * Creates new form AddDrugJPanel
     */
    public AddDrugJPanel(JPanel userProcessContainer, Business business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productManagerWorkRequest = productManagerWorkRequest;
        this.userAccount = userAccount;
        this.business = business;
        //this.network=network;

        // System.out.println(""+productManagerWorkRequest.getDrugName());
        // drugNameField.setText(productManagerWorkRequest.getDrName());
        idField.setVisible(true);
        idLabel.setVisible(true);
        infoLabel.setVisible(false);
        drugNameField.setEditable(true);
        //  manuNameField.setText(productManagerWorkRequest..getManufacturerName());
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
        infoLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        drugNameField = new javax.swing.JTextField();
        drugContentsField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        actPriceField = new javax.swing.JTextField();
        drugMgField = new javax.swing.JTextField();
        drugForField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(238, 238, 238));
        setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 40, 49));
        jLabel1.setText("SUBMIT DRUG DETAILS");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));
        jLabel1.setMaximumSize(new java.awt.Dimension(209, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(209, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(209, 30));

        infoLabel.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 0, 0));
        infoLabel.setText("PLEASE ENTER A VALID PRICE VALUE!!!");

        saveButton.setBackground(new java.awt.Color(57, 62, 70));
        saveButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(238, 238, 238));
        saveButton.setText("SAVE DETAILS");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(238, 238, 238));
        backButton.setForeground(new java.awt.Color(238, 238, 238));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        backButton.setMaximumSize(new java.awt.Dimension(60, 60));
        backButton.setMinimumSize(new java.awt.Dimension(60, 60));
        backButton.setPreferredSize(new java.awt.Dimension(60, 60));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(34, 40, 49));
        idLabel.setText("DRUG ID");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 40, 49));
        jLabel4.setText("PRICE");

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(34, 40, 49));
        jLabel10.setText("DRUG MG");

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(34, 40, 49));
        jLabel11.setText("USES");

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(34, 40, 49));
        jLabel12.setText("CONTENTS");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 40, 49));
        jLabel2.setText("DRUG NAME");

        drugNameField.setBackground(new java.awt.Color(238, 238, 238));
        drugNameField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        drugNameField.setForeground(new java.awt.Color(34, 40, 49));
        drugNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        drugNameField.setMaximumSize(new java.awt.Dimension(200, 24));
        drugNameField.setMinimumSize(new java.awt.Dimension(200, 24));
        drugNameField.setPreferredSize(new java.awt.Dimension(200, 24));
        drugNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugNameFieldActionPerformed(evt);
            }
        });

        drugContentsField.setBackground(new java.awt.Color(238, 238, 238));
        drugContentsField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        drugContentsField.setForeground(new java.awt.Color(34, 40, 49));
        drugContentsField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        drugContentsField.setMaximumSize(new java.awt.Dimension(200, 24));
        drugContentsField.setMinimumSize(new java.awt.Dimension(200, 24));
        drugContentsField.setPreferredSize(new java.awt.Dimension(200, 24));
        drugContentsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugContentsFieldActionPerformed(evt);
            }
        });

        idField.setBackground(new java.awt.Color(238, 238, 238));
        idField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        idField.setForeground(new java.awt.Color(34, 40, 49));
        idField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        idField.setMaximumSize(new java.awt.Dimension(200, 24));
        idField.setMinimumSize(new java.awt.Dimension(200, 24));
        idField.setPreferredSize(new java.awt.Dimension(200, 24));

        actPriceField.setBackground(new java.awt.Color(238, 238, 238));
        actPriceField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        actPriceField.setForeground(new java.awt.Color(34, 40, 49));
        actPriceField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        actPriceField.setMaximumSize(new java.awt.Dimension(200, 24));
        actPriceField.setMinimumSize(new java.awt.Dimension(200, 24));
        actPriceField.setPreferredSize(new java.awt.Dimension(200, 24));
        actPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actPriceFieldActionPerformed(evt);
            }
        });

        drugMgField.setBackground(new java.awt.Color(238, 238, 238));
        drugMgField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        drugMgField.setForeground(new java.awt.Color(34, 40, 49));
        drugMgField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        drugMgField.setMaximumSize(new java.awt.Dimension(200, 24));
        drugMgField.setMinimumSize(new java.awt.Dimension(200, 24));
        drugMgField.setPreferredSize(new java.awt.Dimension(200, 24));
        drugMgField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugMgFieldActionPerformed(evt);
            }
        });

        drugForField.setBackground(new java.awt.Color(238, 238, 238));
        drugForField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        drugForField.setForeground(new java.awt.Color(34, 40, 49));
        drugForField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        drugForField.setMaximumSize(new java.awt.Dimension(200, 24));
        drugForField.setMinimumSize(new java.awt.Dimension(200, 24));
        drugForField.setPreferredSize(new java.awt.Dimension(200, 24));
        drugForField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugForFieldActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(30, 30, 30)
                        .add(backButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(500, 500, 500)
                        .add(infoLabel))
                    .add(layout.createSequentialGroup()
                        .add(479, 479, 479)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(saveButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel12)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(drugContentsField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(idLabel)
                                        .add(jLabel2)
                                        .add(jLabel11)
                                        .add(jLabel10)
                                        .add(jLabel4))
                                    .add(50, 50, 50)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(actPriceField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(drugMgField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(drugForField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, drugNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, idField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                    .add(layout.createSequentialGroup()
                        .add(536, 536, 536)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(backButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(drugNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(idField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idLabel))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(actPriceField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(drugMgField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(drugForField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(drugContentsField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12))
                .add(30, 30, 30)
                .add(saveButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 48, Short.MAX_VALUE)
                .add(infoLabel)
                .add(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        for (Network network : business.getNetworkDirectory().getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
                    for (UserAccount userAccount1 : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (userAccount == userAccount1) {
                            if (drugContentsField.getText().isEmpty() || drugMgField.getText().isEmpty() || drugForField.getText().isEmpty() || actPriceField.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Please enter all fields");
                            } else {
                                ManufacturerEnterprise manufacturerEnterprise = (ManufacturerEnterprise) enterprise;
                                Drug drug = manufacturerEnterprise.getDrugCatalog().newDrug();

                                drug.setDrugName(drugNameField.getText());
                                drug.setDrugContents(drugContentsField.getText());
                                drug.setDrugMg(drugMgField.getText());
                                drug.setDrugID(Integer.parseInt(idField.getText()));
                                drug.setDrugFor(drugForField.getText());
                                //drug.setManName(manufacturer.getManufacturerName());
                                try {
                                    String stringPrice = actPriceField.getText();
                                    if (stringPrice.isEmpty() == false) {
                                        int price = Integer.parseInt(stringPrice);
                                        drug.setActualPrice(price);

                                    } else {
                                        actPriceField.setText("N/A");
                                    }
                                } catch (NumberFormatException e) {
                                    infoLabel.setVisible(true);
                                }

                                JOptionPane.showMessageDialog(null, "Drug added");

                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void drugNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugNameFieldActionPerformed

    private void drugContentsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugContentsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugContentsFieldActionPerformed

    private void actPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actPriceFieldActionPerformed

    private void drugMgFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugMgFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugMgFieldActionPerformed

    private void drugForFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugForFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugForFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actPriceField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField drugContentsField;
    private javax.swing.JTextField drugForField;
    private javax.swing.JTextField drugMgField;
    private javax.swing.JTextField drugNameField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
