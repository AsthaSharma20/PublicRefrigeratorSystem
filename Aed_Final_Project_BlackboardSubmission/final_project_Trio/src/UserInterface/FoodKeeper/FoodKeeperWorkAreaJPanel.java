/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodKeeper;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodStorageEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Astha Sharma
 */
public class FoodKeeperWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization organization;
    Network city;
    
    /**
     * Creates new form FoodKeeperWorkAreaJPanel
     */
    public FoodKeeperWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network city) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.useraccount=useraccount;
        this.enterprise=enterprise;
        this.organization=organization;
        this.city=city;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManage = new javax.swing.JButton();
        BtnTest = new javax.swing.JButton();
        btnAnalysis = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        btnManage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnManage.setText("Manage Food>>");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        BtnTest.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtnTest.setText("Require Test>>");
        BtnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestActionPerformed(evt);
            }
        });

        btnAnalysis.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAnalysis.setText("Analysis>>");
        btnAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalysisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManage)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAnalysis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnTest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnManage)
                .addGap(18, 18, 18)
                .addComponent(BtnTest)
                .addGap(18, 18, 18)
                .addComponent(btnAnalysis)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        
        // TODO add your handling code here:
        FoodManagementJpanel fmjp= new FoodManagementJpanel(userProcessContainer,enterprise,useraccount,city);
        userProcessContainer.add("ManageOrganizationJPanel",fmjp);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageActionPerformed

    private void BtnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestActionPerformed
        RequireTestJpanel rtjp=new RequireTestJpanel(userProcessContainer,enterprise,useraccount,city);
        userProcessContainer.add("ManageOrganizationJPanel",rtjp);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTestActionPerformed

    private void btnAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalysisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalysisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTest;
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnManage;
    // End of variables declaration//GEN-END:variables
}