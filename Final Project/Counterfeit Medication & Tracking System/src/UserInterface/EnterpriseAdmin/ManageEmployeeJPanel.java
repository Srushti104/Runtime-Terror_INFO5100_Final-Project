/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EnterpriseAdmin;

import Business.Business;
import Business.Employee;
import Business.Enterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nived
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Network network;
    UserAccount userAccount;

    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = userAccount;
        refresh();
    }

    public void refresh() {
        int rowCount = employeeTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) employeeTable.getModel()).removeRow(i);
        }

        Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        for (Organization o : e.getOrganizationDirectory().getOrgList()) {
            Object row[] = new Object[3];
            for (Employee emp : o.getEmployeeDirectory().getEmployeeList()) {
                row[0] = emp;
                row[1] = emp.getLastName();
                row[2] = o;
                ((DefaultTableModel) employeeTable.getModel()).addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(238, 238, 238));
        setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1280, 700));
        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 40, 49));
        jLabel2.setText("MANAGE EMPLOYEE");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 173, 181)));
        jLabel2.setMaximumSize(new java.awt.Dimension(165, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(165, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(165, 30));

        refreshButton.setBackground(new java.awt.Color(238, 238, 238));
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

        employeeTable.setBackground(new java.awt.Color(238, 238, 238));
        employeeTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 173, 181), 1, true));
        employeeTable.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        employeeTable.setForeground(new java.awt.Color(34, 40, 49));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.setGridColor(new java.awt.Color(34, 40, 49));
        employeeTable.setMaximumSize(new java.awt.Dimension(680, 122));
        employeeTable.setMinimumSize(new java.awt.Dimension(680, 122));
        employeeTable.setPreferredSize(new java.awt.Dimension(680, 122));
        employeeTable.setRowHeight(20);
        employeeTable.setSelectionBackground(new java.awt.Color(0, 173, 181));
        employeeTable.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(employeeTable);

        backButton.setBackground(new java.awt.Color(238, 238, 238));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        backButton.setMaximumSize(new java.awt.Dimension(60, 60));
        backButton.setMinimumSize(new java.awt.Dimension(60, 60));
        backButton.setPreferredSize(new java.awt.Dimension(60, 60));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(57, 62, 70));
        addButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(238, 238, 238));
        addButton.setText("ADD EMPLOYEE");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(57, 62, 70));
        deleteButton.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(238, 238, 238));
        deleteButton.setText("DELETE EMPLOYEE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(558, 558, 558)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:

        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

        AddEmployeeJPanel addEmployeeJPanel = new AddEmployeeJPanel(userProcessContainer, network, userAccount);
        userProcessContainer.add("AddEmployee", addEmployeeJPanel);

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);

    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed
    private static List<Object> getRowAt(JTable jTable, int selectedRow) {
        List<Object> result = new ArrayList<>();
        int colCount = jTable.getColumnCount();
        for (int i = 0; i < colCount; i++) {
            result.add(jTable.getModel().getValueAt(selectedRow, i));
        }
        return result;
    }

    private Organization findEmployeeOrganization(Employee employee) {
        Enterprise e = network.getEnterpriseDirectory().getMyEnterprise(userAccount);
        for (Organization o : e.getOrganizationDirectory().getOrgList()) {
            for (Employee emp : o.getEmployeeDirectory().getEmployeeList()) {
                if (employee.equals(emp)) {
                    return o;
                }
            }
        }
        return null;
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = employeeTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        List<Object> rowValues = getRowAt(employeeTable, selectedRow);
        Employee selectedEmployee = (Employee) rowValues.get(0);
        int count = employeeTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
                if (selectionResult == JOptionPane.YES_OPTION) {

                    Organization employeeOrganization = findEmployeeOrganization(selectedEmployee);

                    if (employeeOrganization != null) {
                        List<Employee> employeeList = employeeOrganization.getEmployeeDirectory().getEmployeeList();
                        int employeeIndexInList = 0;
                        for (; employeeIndexInList < employeeList.size(); employeeIndexInList++) {
                            if (selectedEmployee.equals(employeeList.get(employeeIndexInList))) {
                                break;
                            }
                        }

                        if (employeeIndexInList < employeeList.size()) {
                            employeeList.remove(employeeIndexInList);
                            refresh();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
