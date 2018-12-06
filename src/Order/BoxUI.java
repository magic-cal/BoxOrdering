/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import javax.swing.WindowConstants;
/**
 *
 * @author UP879195, UP825573 ,UP827158, UP867238
 */
public class BoxUI extends javax.swing.JFrame {

    /**
     * Creates new form BoxUI
     */
    public BoxUI() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jbtn_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtn_Continue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Flexbox");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jbtn_Exit.setText("Exit");
        jbtn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 92, 36, 0);
        getContentPane().add(jbtn_Exit, gridBagConstraints);

        jLabel1.setText("Welcome to the Box Ordering System");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 92, 0, 96);
        getContentPane().add(jLabel1, gridBagConstraints);

        jbtn_Continue.setText("Continue");
        jbtn_Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ContinueActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 78, 36, 96);
        getContentPane().add(jbtn_Continue, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ExitActionPerformed
        BoxUI.this.setVisible(false);
        BoxUI.this.dispose();
    }//GEN-LAST:event_jbtn_ExitActionPerformed

     /**
     *
     * @param evt is the event action that contains data about the click event
     * Opens the main GUI interface for the user to add boxes with. 
     * Sets properties of the new GUI.
     * Hides and removes the current UI from the user. 
     * 
     * 
     */
    private void jbtn_ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ContinueActionPerformed
        BoxUI2 Info = new BoxUI2();
        Info.setVisible(true);
        Info.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        Info.setResizable(false);
        BoxUI.this.setVisible(false);
        BoxUI.this.dispose();

    }//GEN-LAST:event_jbtn_ContinueActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(BoxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoxUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtn_Continue;
    private javax.swing.JButton jbtn_Exit;
    // End of variables declaration//GEN-END:variables
}
