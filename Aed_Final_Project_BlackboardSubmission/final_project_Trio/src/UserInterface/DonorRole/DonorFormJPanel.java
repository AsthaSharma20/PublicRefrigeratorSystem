/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DonorRole;

import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Food.Food;
import Business.Food.Food.FoodType;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Astha Sharma
 */
public class DonorFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorFormJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private Organization donorOrg;
    private Enterprise enterprise;
    private Network city;
    
    public DonorFormJPanel(JPanel userProcessContainer,UserAccount useraccount,Organization donorOrg,Network city,Enterprise enterprise) {
        initComponents();
        this.donorOrg = (DonorOrganization)donorOrg;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.city = city;
        popComboBox();
    }
    
    public void popComboBox(){
        this.foodTypeCb.removeAllItems();
        for(Food.FoodType f : Food.FoodType.values()){
            foodTypeCb.addItem(f);
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

        createBtn = new javax.swing.JButton();
        dateTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        foodTypeCb = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        foodnameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        createBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createBtn.setText("SUBMIT");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        dateTxt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Food Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("No. of Items:");

        foodTypeCb.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        foodTypeCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dairy", "Beverage", "Vegeatble", "Fruit", "Eggs", "Meat", "Snacks", "Cereal", "Bread" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Food Type:");

        foodnameTxt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        foodnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodnameTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Date of Expiry :");

        quantityTxt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        quantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodTypeCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foodnameTxt)
                            .addComponent(quantityTxt)
                            .addComponent(dateTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(createBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(foodnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(foodTypeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createBtn)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void foodnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodnameTxtActionPerformed

    private void quantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        FoodType ft = (FoodType)foodTypeCb.getSelectedItem();
        String foodname = foodnameTxt.getText();
        int foodquantity = Integer.parseInt(quantityTxt.getText());
        Date d = Date.valueOf(dateTxt.getText());
        Food f = this.city.getFoodDir().createFood(ft, foodquantity, d);
        f.setFrom(enterprise);
        f.setDonor(useraccount);
        JOptionPane.showMessageDialog(null, "Thank you for your donations, Our deliverer will get to u soon!");
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JComboBox foodTypeCb;
    private javax.swing.JTextField foodnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField quantityTxt;
    // End of variables declaration//GEN-END:variables
}
