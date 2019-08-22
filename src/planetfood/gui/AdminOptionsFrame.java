package planetfood.gui;

import java.awt.Color;
import javax.swing.JFrame;
import planetfood.pojo.UserProfile;

public class AdminOptionsFrame extends javax.swing.JFrame {
     
    public AdminOptionsFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        //DbConnection.getConnection();
        lblUserName.setText("Hello "+UserProfile.getUSername());
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jrbAddEmp = new javax.swing.JRadioButton();
        jrbViewEmp = new javax.swing.JRadioButton();
        jrbEditEmp = new javax.swing.JRadioButton();
        jrbRemoveEmp = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrbViewOrders = new javax.swing.JRadioButton();
        jrbViewDatewise = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jrbAddCat = new javax.swing.JRadioButton();
        jrbEditCat = new javax.swing.JRadioButton();
        jrbViewCat = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jrbAddProd = new javax.swing.JRadioButton();
        jrbViewProd = new javax.swing.JRadioButton();
        jrbEditProd = new javax.swing.JRadioButton();
        jrbRemoveProd = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 53, 63));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLANET FOOD ADMIN PANEL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Make A Choice");

        jPanel2.setBackground(new java.awt.Color(147, 166, 197));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Emp Options"));
        jPanel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N

        buttonGroup1.add(jrbAddEmp);
        jrbAddEmp.setText("Add Emp");
        jrbAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAddEmpActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbViewEmp);
        jrbViewEmp.setText("View Emp");
        jrbViewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbViewEmpActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbEditEmp);
        jrbEditEmp.setText("Edit Emp");
        jrbEditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditEmpActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbRemoveEmp);
        jrbRemoveEmp.setText("Remove Emp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAddEmp)
                    .addComponent(jrbViewEmp)
                    .addComponent(jrbEditEmp)
                    .addComponent(jrbRemoveEmp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jrbAddEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbViewEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbEditEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbRemoveEmp)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(147, 166, 197));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Report Options"));

        buttonGroup3.add(jrbViewOrders);
        jrbViewOrders.setText("View Orders");

        buttonGroup3.add(jrbViewDatewise);
        jrbViewDatewise.setText("View DateWise");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbViewOrders)
                    .addComponent(jrbViewDatewise))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jrbViewOrders)
                .addGap(18, 18, 18)
                .addComponent(jrbViewDatewise)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(147, 166, 197));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Category Options"));

        buttonGroup4.add(jrbAddCat);
        jrbAddCat.setText("Add Category");

        buttonGroup4.add(jrbEditCat);
        jrbEditCat.setText("Edit Category");
        jrbEditCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditCatActionPerformed(evt);
            }
        });

        buttonGroup4.add(jrbViewCat);
        jrbViewCat.setText("View Category");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAddCat)
                    .addComponent(jrbEditCat)
                    .addComponent(jrbViewCat))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jrbAddCat)
                .addGap(18, 18, 18)
                .addComponent(jrbEditCat)
                .addGap(18, 18, 18)
                .addComponent(jrbViewCat)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(147, 166, 197));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Product Options"));

        jrbAddProd.setBackground(new java.awt.Color(147, 166, 197));
        buttonGroup5.add(jrbAddProd);
        jrbAddProd.setText("Add Product");

        buttonGroup5.add(jrbViewProd);
        jrbViewProd.setText("View Product");

        buttonGroup5.add(jrbEditProd);
        jrbEditProd.setText("Edit Product");

        buttonGroup5.add(jrbRemoveProd);
        jrbRemoveProd.setText("Remove Product");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAddProd)
                    .addComponent(jrbViewProd)
                    .addComponent(jrbEditProd)
                    .addComponent(jrbRemoveProd))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jrbAddProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbViewProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbEditProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbRemoveProd)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton2.setText("Quit");

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUserName.setText(" ");

        lblLogout.setText("LogOut");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jButton3.setText("Do Task");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(285, 285, 285))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogout)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbViewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbViewEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbViewEmpActionPerformed

    private void jrbEditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEditEmpActionPerformed

    private void jrbEditCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEditCatActionPerformed

    private void jrbAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAddEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAddEmpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(jrbAddEmp.isSelected())
        {
            AddEmp addEmp=new AddEmp();
            addEmp.setVisible(true);
            this.dispose();
        }
        if(jrbViewEmp.isSelected())
        {
            AllEmpDetailsPanel esa=new AllEmpDetailsPanel();
            esa.setVisible(true);
            this.dispose();
        }
        if(jrbRemoveEmp.isSelected())
        {
            RemoveEmp rmvemp=new RemoveEmp();
            rmvemp.setVisible(true);
            this.dispose();
        }
        if(jrbEditEmp.isSelected())
        {
            EditEmp edtemp=new EditEmp();
            edtemp.setVisible(true);
            this.dispose();
        }
        if(jrbAddProd.isSelected())
        {
            AddProductFrame apf=new AddProductFrame();
            apf.setVisible(true);
            this.dispose();
        }
        if(jrbViewProd.isSelected())
        {
            ViewProductFrame vpf=new ViewProductFrame();
            vpf.setVisible(true);
            this.dispose();
        }
        if(jrbEditProd.isSelected())
        {
           ProductEditPanel epf=new ProductEditPanel();
           epf.setVisible(true);
           this.dispose();
        }
        if(jrbRemoveProd.isSelected())
        {
            ProductRemovePanel prp=new ProductRemovePanel();
            prp.setVisible(true);
            this.dispose();
        }
        if(jrbAddCat.isSelected())
        {
            CategoryAddingPanel cap=new CategoryAddingPanel();
            cap.setVisible(true);
            this.dispose();
        }
        
        if(jrbEditCat.isSelected())
        {
            CategoryEdittingPanel cep=new CategoryEdittingPanel();
            cep.setVisible(true);
            this.dispose();
        }
         if(jrbViewCat.isSelected())
        {
            AllCatDetailsPanel acdp=new AllCatDetailsPanel();
            acdp.setVisible(true);
            this.dispose();
        }
         if(jrbViewOrders.isSelected())
        {
            AllOrdersDetails aod=new AllOrdersDetails();
            aod.setVisible(true);
            this.dispose();
        }
          if(jrbViewDatewise.isSelected())
        {
            DateWiseOrderPanel dwop=new DateWiseOrderPanel();
            dwop.setVisible(true);
            this.dispose();
        }
//          if(jrbReg.isSelected())
//        {
//            RegisterCashier rc=new RegisterCashier();
//            rc.setVisible(true);
//            this.dispose();
//        }
//          if(jrbRem.isSelected())
//        {
//            RemoveCashier rem=new RemoveCashier();
//            rem.setVisible(true);
//            this.dispose();
//        }
          
          
          
         
         
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if(jrbAddEmp.isSelected())
        {
            AddEmp addEmp=new AddEmp();
            addEmp.setVisible(true);
            this.dispose();
        }
        if(jrbViewEmp.isSelected())
        {
            AllEmpDetailsPanel esa=new AllEmpDetailsPanel();
            esa.setVisible(true);
            this.dispose();
        }
        if(jrbRemoveEmp.isSelected())
        {
            RemoveEmp rmvemp=new RemoveEmp();
            rmvemp.setVisible(true);
            this.dispose();
        }
        if(jrbEditEmp.isSelected())
        {
            EditEmp edtemp=new EditEmp();
            edtemp.setVisible(true);
            this.dispose();
        }
        if(jrbAddProd.isSelected())
        {
            AddProductFrame apf=new AddProductFrame();
            apf.setVisible(true);
            this.dispose();
        }
        if(jrbViewProd.isSelected())
        {
            ViewProductFrame vpf=new ViewProductFrame();
            vpf.setVisible(true);
            this.dispose();
        }
        if(jrbEditProd.isSelected())
        {
            ProductEditPanel epf=new ProductEditPanel();
            epf.setVisible(true);
            this.dispose();
        }
        if(jrbRemoveProd.isSelected())
        {
            ProductRemovePanel prp=new ProductRemovePanel();
            prp.setVisible(true);
            this.dispose();
        }
        if(jrbAddCat.isSelected())
        {
            CategoryAddingPanel cap=new CategoryAddingPanel();
            cap.setVisible(true);
            this.dispose();
        }

        if(jrbEditCat.isSelected())
        {
            CategoryEdittingPanel cep=new CategoryEdittingPanel();
            cep.setVisible(true);
            this.dispose();
        }
        if(jrbViewCat.isSelected())
        {
            AllCatDetailsPanel acdp=new AllCatDetailsPanel();
            acdp.setVisible(true);
            this.dispose();
        }
        if(jrbViewOrders.isSelected())
        {
            AllOrdersDetails aod=new AllOrdersDetails();
            aod.setVisible(true);
            this.dispose();
        }
        if(jrbViewDatewise.isSelected())
        {
            DateWiseOrderPanel dwop=new DateWiseOrderPanel();
            dwop.setVisible(true);
            this.dispose();
        }
//        if(jrbReg.isSelected())
//        {
//            RegisterCashier rc=new RegisterCashier();
//            rc.setVisible(true);
//            this.dispose();
//        }
//        if(jrbRem.isSelected())
//        {
//            RemoveCashier rem=new RemoveCashier();
//            rem.setVisible(true);
//            this.dispose();
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jrbAddCat;
    private javax.swing.JRadioButton jrbAddEmp;
    private javax.swing.JRadioButton jrbAddProd;
    private javax.swing.JRadioButton jrbEditCat;
    private javax.swing.JRadioButton jrbEditEmp;
    private javax.swing.JRadioButton jrbEditProd;
    private javax.swing.JRadioButton jrbRemoveEmp;
    private javax.swing.JRadioButton jrbRemoveProd;
    private javax.swing.JRadioButton jrbViewCat;
    private javax.swing.JRadioButton jrbViewDatewise;
    private javax.swing.JRadioButton jrbViewEmp;
    private javax.swing.JRadioButton jrbViewOrders;
    private javax.swing.JRadioButton jrbViewProd;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
