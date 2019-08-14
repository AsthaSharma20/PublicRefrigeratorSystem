/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.Business;
import Business.Network.Network;
import Business.Refrigerator.refrigerator;
import Business.Workqueue.TechnicianWorkRequest;
import Business.Workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 帅的一匹
 */
public class ManageRefrigeratorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRefrigeratorsJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    public ManageRefrigeratorsJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        popCom();
    }
    public void popCom(){
        cbNetwork.removeAllItems();
        for(Network n: business.getNetworkList()){
            cbNetwork.addItem(n);
        }
    }
    
    public void popTbl(){
        DefaultTableModel dtm = (DefaultTableModel)refriTbl.getModel();
        dtm.setRowCount(0);
        Network n = (Network)cbNetwork.getSelectedItem();
        for(refrigerator r:n.getRefriDir().getRefrilist()){
            Object[] row = new Object[2];
            row[0] = r.getRefrigeratorId();
            row[1] = r;
            dtm.addRow(row);
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

        btnBuild = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        refriTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbNetwork = new javax.swing.JComboBox();
        maintainBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        btnBuild.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBuild.setText("Build a refrigerator");
        btnBuild.setEnabled(false);
        btnBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuildActionPerformed(evt);
            }
        });

        refriTbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        refriTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(refriTbl);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Network:");

        cbNetwork.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNetworkActionPerformed(evt);
            }
        });

        maintainBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        maintainBtn.setText("Maintain it");
        maintainBtn.setEnabled(false);
        maintainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintainBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(maintainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintainBtn)
                    .addComponent(btnBuild))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuildActionPerformed
        // TODO add your handling code here:
        Network n = (Network)cbNetwork.getSelectedItem();
        BuildRefrigeratorJPanel b = new BuildRefrigeratorJPanel(userProcessContainer,n);
        userProcessContainer.add(b);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        btnBuild.setEnabled(false);
    }//GEN-LAST:event_btnBuildActionPerformed

    private void cbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNetworkActionPerformed
        // TODO add your handling code here:
        Network network = (Network) cbNetwork.getSelectedItem();
        if (network != null){
            popTbl();
            btnBuild.setEnabled(true);
            maintainBtn.setEnabled(true);
        }
    }//GEN-LAST:event_cbNetworkActionPerformed

    private void maintainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintainBtnActionPerformed
        // TODO add your handling code here:
        int r = refriTbl.getSelectedRow();
        if(r>=0){
            refrigerator refri = (refrigerator)refriTbl.getValueAt(r, 1);
            Network network = (Network) cbNetwork.getSelectedItem();
            TechnicianWorkRequest wq = new TechnicianWorkRequest();
            wq.setR(refri);
            wq.setStatus("Unmaintained");
            network.getWorkqueue().getWorkRequestList().add(wq);
            JOptionPane.showMessageDialog(null,"The technician will check the refrigerator later!");
        }else{
            JOptionPane.showMessageDialog(null,"Please select a row first!");
        }
    }//GEN-LAST:event_maintainBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuild;
    private javax.swing.JComboBox cbNetwork;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton maintainBtn;
    private javax.swing.JTable refriTbl;
    // End of variables declaration//GEN-END:variables
}