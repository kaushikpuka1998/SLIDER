/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;

import rojerusan.RSPanelsSlider;

/**
 *
 * @author KAUSHIK GHOSH
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTN4 = new rojerusan.RSButtonIconI();
        BTN1 = new rojerusan.RSButtonIconI();
        BTN2 = new rojerusan.RSButtonIconI();
        BTN3 = new rojerusan.RSButtonIconI();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jp1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jp3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jp4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        BTN4.setText("rSButtonIconI4");
        BTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN4MouseClicked(evt);
            }
        });
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });

        BTN1.setText("rSButtonIconI1");
        BTN1.setSelected(true);
        BTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN1MouseClicked(evt);
            }
        });
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });

        BTN2.setText("rSButtonIconI2");
        BTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN2MouseClicked(evt);
            }
        });
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });

        BTN3.setText("rSButtonIconI3");
        BTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN3MouseClicked(evt);
            }
        });
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BTN2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
            .addComponent(BTN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BTN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(222, Short.MAX_VALUE)
                    .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(216, 216, 216)))
        );

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        jp1.setBackground(new java.awt.Color(255, 255, 255));
        jp1.setName("jp1"); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("Panel1");

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(jp1, "card2");

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setName("jp2"); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setText("Panel2");

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(jp2, "card3");

        jp3.setBackground(new java.awt.Color(255, 255, 255));
        jp3.setName("jp3"); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setText("Panel3");

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp3Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(jp3, "card4");

        jp4.setBackground(new java.awt.Color(255, 255, 255));
        jp4.setName("jp4"); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel4.setText("Panel4");

        javax.swing.GroupLayout jp4Layout = new javax.swing.GroupLayout(jp4);
        jp4.setLayout(jp4Layout);
        jp4Layout.setHorizontalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jp4Layout.setVerticalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(jp4, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        // TODO add your handling code here:
        if(!this.BTN4.isSelected())
        {
            this.BTN1.setSelected(false);
            this.BTN2.setSelected(false);
            this.BTN3.setSelected(false);
            this.BTN4.setSelected(true);

            this.rSPanelsSlider1.setPanelSlider(10, jp4, RSPanelsSlider.DIRECT.RIGHT);

        }
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        // TODO add your handling code here:
        if(!this.BTN2.isSelected())
        {
            this.BTN1.setSelected(false);
            this.BTN2.setSelected(true);
            this.BTN3.setSelected(false);
            this.BTN4.setSelected(false);

            this.rSPanelsSlider1.setPanelSlider(10, jp2, RSPanelsSlider.DIRECT.RIGHT);

        }
       
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        // TODO add your handling code here:
        if(!this.BTN3.isSelected())
        {
            this.BTN1.setSelected(false);
            this.BTN2.setSelected(false);
            this.BTN3.setSelected(true);
            this.BTN4.setSelected(false);

            this.rSPanelsSlider1.setPanelSlider(10, jp3, RSPanelsSlider.DIRECT.RIGHT);

        }
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        // TODO add your handling code here:
        if(!this.BTN1.isSelected())
        {
            this.BTN1.setSelected(true);
            this.BTN2.setSelected(false);
            this.BTN3.setSelected(false);
            this.BTN4.setSelected(false);

            this.rSPanelsSlider1.setPanelSlider(10, jp1, RSPanelsSlider.DIRECT.RIGHT);

        }

    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BTN2MouseClicked

    private void BTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BTN1MouseClicked

    private void BTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BTN3MouseClicked

    private void BTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN4MouseClicked
        // TODO add your handling code here:
       
            
        
    }//GEN-LAST:event_BTN4MouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI BTN1;
    private rojerusan.RSButtonIconI BTN2;
    private rojerusan.RSButtonIconI BTN3;
    private rojerusan.RSButtonIconI BTN4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables
}
