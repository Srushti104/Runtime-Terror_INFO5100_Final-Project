/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Doctor;
import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.NetworkDirectory;
import Business.Roles.AdminRole;
import Business.Roles.DoctorRole;
import Business.Roles.Role;
import Business.UserAccount;
import UserInterface.HospitalManager.HospitalManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class LogoutJPanel extends javax.swing.JPanel {

    private MainJFrame mainJFrame;
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    /**
     * Creates new form LogoutJPanel
     */
    public LogoutJPanel(MainJFrame frame, UserAccount userAccount, JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        mainJFrame = frame;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;

        if (userAccount.getRole() instanceof DoctorRole) {
            userNameLabel.setText(userAccount.getDoctor().getFirstName() + " " + userAccount.getDoctor().getLastName());
        } else if (userAccount != null) {
            userNameLabel.setText(userAccount.getEmployee().getFirstName() + " " + userAccount.getEmployee().getLastName());
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

        userNameLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(34, 40, 49));
        setMaximumSize(new java.awt.Dimension(1280, 100));
        setMinimumSize(new java.awt.Dimension(1280, 100));
        setPreferredSize(new java.awt.Dimension(1280, 100));

        userNameLabel.setBackground(new java.awt.Color(34, 40, 49));
        userNameLabel.setFont(new java.awt.Font("Courier New", 2, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(238, 238, 238));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        logoutJButton.setBackground(new java.awt.Color(238, 238, 238));
        logoutJButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(34, 40, 49));
        logoutJButton.setText("LOGOUT");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(userNameLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 530, Short.MAX_VALUE)
                .add(logoutJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(logoutJButton)
                    .add(userNameLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        // TODO add your handling code here:
        mainJFrame.logoutUser(userProcessContainer);

    }//GEN-LAST:event_logoutJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton logoutJButton;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
