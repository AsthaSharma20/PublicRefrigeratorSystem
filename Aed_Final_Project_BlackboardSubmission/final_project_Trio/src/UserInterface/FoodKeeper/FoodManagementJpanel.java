/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodKeeper;

import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodStorageEnterprise;
import Business.Food.Food;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Refrigerator.refrigerator;
import Business.UserAccount.UserAccount;
import Business.Workqueue.DeliverWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author linhchen
 */
public class FoodManagementJpanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Network city;
    /**
     * Creates new form FoodManagementJpanel
     */
    public FoodManagementJpanel(JPanel userProcessContainer,Enterprise enterprise,UserAccount useraccount,Network city) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.useraccount=useraccount;
        this.enterprise=enterprise;
        this.city=city;
        popTbl();
        popCom();
        popCbx();
    }
    private void popCbx(){
        //please create refs
        RefrigeratorCbx.removeAllItems();
        for(refrigerator r:this.city.getRefriDir().getRefrilist()){
            RefrigeratorCbx.addItem(r);
        }
    }
    
    public void popUserCom(Organization organization){
        cbUserAccount.removeAllItems();
        for(UserAccount ua:organization.getUserAccountDirectory().getUserAccountList()){
            cbUserAccount.addItem(ua);
        }
    }
    
    public void popOrgCom(Enterprise e){
        cbSendOrg.removeAllItems();
        for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
            cbSendOrg.addItem(o);
        }
    }
    
    public void popCom(){
        cbSend.removeAllItems();
            for(Enterprise s:this.city.getEnterpriseDir().getEnterpriseList()){
                if(s.getEnterpriseType() == Enterprise.EnterpriseType.Deliever)
                    cbSend.addItem(s);
        }
    }
    private void popTbl(){
        DefaultTableModel dtm=(DefaultTableModel)TblFood.getModel();
        dtm.setRowCount(0);
        for(Food f:((FoodStorageEnterprise)this.enterprise).getFoodlist().getFoodlist()){
                Object[] row=new Object[4];
                row[0]=f.getFoodId();
                row[1]=f;
                row[2]=f.getDonor();
                row[3]=f.getQuantity();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TblFood = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        ViewDetailBtn = new javax.swing.JButton();
        btnViewReport = new javax.swing.JButton();
        RefrigeratorCbx = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbUserAccount = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbSendOrg = new javax.swing.JComboBox();
        cbSend = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 153, 153));

        TblFood.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FoodId", "FoodName", "Donator", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(TblFood);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnDelete.setText("Delete  ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        ViewDetailBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ViewDetailBtn.setText("View Details>>");
        ViewDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailBtnActionPerformed(evt);
            }
        });

        btnViewReport.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnViewReport.setText("View Test Report>>");
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        RefrigeratorCbx.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RefrigeratorCbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RefrigeratorCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefrigeratorCbxActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Send>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Choose the refrigerator:");

        cbUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUserAccountActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Select Enterprise:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Select UserAccount:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Select Organization:");

        cbSendOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSendOrgActionPerformed(evt);
            }
        });

        cbSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbSend, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSendOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap(308, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewReport)
                            .addComponent(ViewDetailBtn)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RefrigeratorCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ViewDetailBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RefrigeratorCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSendOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewDetailBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReportActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        


// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void RefrigeratorCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefrigeratorCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefrigeratorCbxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refrigerator r=(refrigerator)RefrigeratorCbx.getSelectedItem();
        
        int x=TblFood.getSelectedRow();
        if(x>=0){
        Food f=(Food)TblFood.getValueAt(x, 1);
        DeliverWorkRequest dwq=new DeliverWorkRequest();
        dwq.setRefrigerator(r);
        dwq.setFood(f);
        dwq.setStatus("Undelivered");
        dwq.setReceiver((UserAccount)cbUserAccount.getSelectedItem());
        this.city.getWorkqueue().getWorkRequestList().add(dwq);
        JOptionPane.showMessageDialog(null, "The deliver request has been sent to "+(refrigerator)RefrigeratorCbx.getSelectedItem()+" !");
            }else{
                JOptionPane.showMessageDialog(null, "Please Select one row!");
            }
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbSendOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSendOrgActionPerformed
        // TODO add your handling code here:
        Organization o = (Organization) cbSendOrg.getSelectedItem();
        if(o!=null){
            popUserCom(o);
        }
    }//GEN-LAST:event_cbSendOrgActionPerformed

    private void cbSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSendActionPerformed
        // TODO add your handling code here:
        Enterprise e = (Enterprise) cbSend.getSelectedItem();
        if(e!=null){
            popOrgCom(e);
        }
    }//GEN-LAST:event_cbSendActionPerformed

    private void cbUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUserAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUserAccountActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox RefrigeratorCbx;
    private javax.swing.JTable TblFood;
    private javax.swing.JButton ViewDetailBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JComboBox cbSend;
    private javax.swing.JComboBox cbSendOrg;
    private javax.swing.JComboBox cbUserAccount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
