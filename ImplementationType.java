    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;

import java.awt.event.ActionListener;
import java.util.Set;

/**
 *
 * @author Julio
 */
public class ImplementationType extends javax.swing.JFrame {

    /**
     * Creates new form ImplementationType
     */
    public ImplementationType() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        implementationTypelbl = new javax.swing.JLabel();
        implementationCmb = new javax.swing.JComboBox<>();
        implementationbtn = new javax.swing.JButton();
        registerbtn = new javax.swing.JButton();
        webDevTxtBx = new javax.swing.JCheckBox();
        javaDevTxtBx = new javax.swing.JCheckBox();
        mobileDevTxtBx = new javax.swing.JCheckBox();
        developerNameInputtf = new javax.swing.JTextField();
        showDevsbtn = new javax.swing.JToggleButton();
        developerlbl = new javax.swing.JLabel();
        finishInputbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        implementationTypelbl.setText("Implementation Type");

        implementationCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hash Set", "Tree Set", "Linked Hash Set" }));
        implementationCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                implementationCmbActionPerformed(evt);
            }
        });

        implementationbtn.setText("Ok");
        implementationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                implementationbtnActionPerformed(evt);
            }
        });

        registerbtn.setText("register");
        registerbtn.setEnabled(false);

        webDevTxtBx.setText("Web");
        webDevTxtBx.setEnabled(false);

        javaDevTxtBx.setText("Java");
        javaDevTxtBx.setEnabled(false);
        javaDevTxtBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaDevTxtBxActionPerformed(evt);
            }
        });

        mobileDevTxtBx.setText("Mobile");
        mobileDevTxtBx.setEnabled(false);

        developerNameInputtf.setEnabled(false);
        developerNameInputtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developerNameInputtfActionPerformed(evt);
            }
        });

        showDevsbtn.setText("Show Devs");
        showDevsbtn.setEnabled(false);

        developerlbl.setText("Developer Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(implementationbtn)
                    .addComponent(implementationCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(implementationTypelbl))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(developerlbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(developerNameInputtf)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(webDevTxtBx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mobileDevTxtBx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(javaDevTxtBx)))
                        .addGap(82, 82, 82)
                        .addComponent(registerbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(showDevsbtn)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(implementationTypelbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(developerlbl)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(developerNameInputtf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerbtn)
                            .addComponent(showDevsbtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(implementationCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(implementationbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(webDevTxtBx)
                            .addComponent(mobileDevTxtBx)
                            .addComponent(javaDevTxtBx))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        finishInputbtn.setText("End Registration");
        finishInputbtn.setEnabled(false);
        finishInputbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishInputbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(475, Short.MAX_VALUE)
                .addComponent(finishInputbtn)
                .addGap(198, 198, 198))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(finishInputbtn)
                .addGap(59, 59, 59))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finishInputbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishInputbtnActionPerformed
        // TODO add your handling code here:
        implementationbtn.      setEnabled(false);             
        showDevsbtn.            setEnabled(true);
        javaDevTxtBx.           setEnabled(false);
        webDevTxtBx.            setEnabled(false);
        mobileDevTxtBx.         setEnabled(false);
        developerNameInputtf.   setEnabled(false);
        registerbtn.            setEnabled(false);        
        finishInputbtn.         setEnabled(false);
    }//GEN-LAST:event_finishInputbtnActionPerformed

    private void developerNameInputtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developerNameInputtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_developerNameInputtfActionPerformed

    private void javaDevTxtBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaDevTxtBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_javaDevTxtBxActionPerformed

    private void implementationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_implementationbtnActionPerformed
        // TODO add your handling code here:
        implementationCmb.      setEnabled(false);
        javaDevTxtBx.           setEnabled(true);
        webDevTxtBx.            setEnabled(true);
        mobileDevTxtBx.         setEnabled(true);
        developerNameInputtf.   setEnabled(true);
        registerbtn.            setEnabled(true);        
        implementationbtn.      setEnabled(false);
        finishInputbtn.         setEnabled(true);
        
    }//GEN-LAST:event_implementationbtnActionPerformed

    private void implementationCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_implementationCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_implementationCmbActionPerformed

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
            java.util.logging.Logger.getLogger(ImplementationType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImplementationType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImplementationType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImplementationType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImplementationType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField developerNameInputtf;
    private javax.swing.JLabel developerlbl;
    private javax.swing.JButton finishInputbtn;
    private javax.swing.JComboBox<String> implementationCmb;
    private javax.swing.JLabel implementationTypelbl;
    private javax.swing.JButton implementationbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox javaDevTxtBx;
    private javax.swing.JCheckBox mobileDevTxtBx;
    private javax.swing.JButton registerbtn;
    private javax.swing.JToggleButton showDevsbtn;
    private javax.swing.JCheckBox webDevTxtBx;
    // End of variables declaration//GEN-END:variables
}

