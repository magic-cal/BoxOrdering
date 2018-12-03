/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author felixmayo
 */
public class BoxUI2 extends javax.swing.JFrame {

    OrderManager orderManager;

    public BoxUI2() {
        initComponents();
        orderManager = new OrderManager();
        updateValues();
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
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtn_completeOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_boxHeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cardboardGrade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbtn_0 = new javax.swing.JRadioButton();
        rbtn_1 = new javax.swing.JRadioButton();
        rbtn_2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtn_yes1 = new javax.swing.JRadioButton();
        rbtn_no1 = new javax.swing.JRadioButton();
        rbtn_yes2 = new javax.swing.JRadioButton();
        rbtn_no2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        jbtn_add = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        noBoxes = new javax.swing.JLabel();
        totCost = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_boxWidth = new javax.swing.JTextField();
        txt_boxLength = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rbtn_yes3 = new javax.swing.JRadioButton();
        rbtn_no3 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_help = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jbtn_completeOrder.setText("Complete Order");
        jbtn_completeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_completeOrderActionPerformed(evt);
            }
        });

        jLabel1.setText("Box Order Form");

        jLabel2.setText("Box Width:");

        txt_boxHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_boxHeightActionPerformed(evt);
            }
        });

        jLabel3.setText("Cardboard grade:");

        jLabel4.setText("Colour print:");

        buttonGroup1.add(rbtn_0);
        rbtn_0.setSelected(true);
        rbtn_0.setText("0");
        rbtn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_0ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_1);
        rbtn_1.setText("1");
        rbtn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_2);
        rbtn_2.setText("2");

        jLabel5.setText("Renforced Bottom:");

        jLabel6.setText("Renforced Corners:");

        buttonGroup2.add(rbtn_yes1);
        rbtn_yes1.setText("Yes");
        rbtn_yes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_yes1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbtn_no1);
        rbtn_no1.setSelected(true);
        rbtn_no1.setText("No");
        rbtn_no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_no1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(rbtn_yes2);
        rbtn_yes2.setText("Yes");

        buttonGroup3.add(rbtn_no2);
        rbtn_no2.setSelected(true);
        rbtn_no2.setText("No");

        jLabel7.setText("Quantity:");

        jbtn_add.setText("Add");
        jbtn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_addActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        noBoxes.setText("jLabel8");

        totCost.setText("jLabel9");

        jLabel10.setText("Box Length:");

        jLabel11.setText("Box Height:");

        txt_boxWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_boxWidthActionPerformed(evt);
            }
        });

        txt_boxLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_boxLengthActionPerformed(evt);
            }
        });

        jLabel12.setText("Sealable Top:");

        buttonGroup4.add(rbtn_yes3);
        rbtn_yes3.setText("Yes");
        rbtn_yes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_yes3ActionPerformed(evt);
            }
        });

        buttonGroup4.add(rbtn_no3);
        rbtn_no3.setSelected(true);
        rbtn_no3.setText("No");

        jLabel13.setText("Extras");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        btn_help.setText("Help");
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addGap(275, 275, 275)
                        .addComponent(jLabel13)
                        .addGap(184, 184, 184)
                        .addComponent(btn_help))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(txt_boxWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addComponent(rbtn_0)
                        .addGap(0, 0, 0)
                        .addComponent(rbtn_1)
                        .addGap(0, 0, 0)
                        .addComponent(rbtn_2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel10)
                        .addGap(19, 19, 19)
                        .addComponent(txt_boxLength, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(rbtn_yes1)
                        .addGap(0, 0, 0)
                        .addComponent(rbtn_no1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txt_boxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)
                        .addComponent(rbtn_yes2)
                        .addGap(0, 0, 0)
                        .addComponent(rbtn_no2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(txt_cardboardGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel12)
                        .addGap(30, 30, 30)
                        .addComponent(rbtn_yes3)
                        .addGap(0, 0, 0)
                        .addComponent(rbtn_no3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20)
                        .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(btn_clear)
                        .addGap(6, 6, 6)
                        .addComponent(jbtn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(totCost))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(noBoxes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_completeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13))
                    .addComponent(btn_help))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txt_boxWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(rbtn_0)
                    .addComponent(rbtn_1)
                    .addComponent(rbtn_2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(txt_boxLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(rbtn_yes1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(rbtn_no1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(txt_boxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rbtn_yes2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rbtn_no2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_cardboardGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12))
                    .addComponent(rbtn_yes3)
                    .addComponent(rbtn_no3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbtn_add)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totCost)
                            .addComponent(jbtn_completeOrder)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(noBoxes))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_0ActionPerformed

    private void rbtn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_1ActionPerformed

    private void rbtn_yes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_yes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_yes1ActionPerformed

    private void rbtn_no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_no1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_no1ActionPerformed

    private void jbtn_completeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_completeOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_completeOrderActionPerformed

    private void jbtn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_addActionPerformed
        // TODO add your handling code here:
        int outputCode;
        int boxHeight;
        int boxWidth;
        int boxLength;
        int cardboardGrade;
        int quantity;
        boolean sealableTop = rbtn_yes3.isSelected();
        int colourPrint = 3;
        boolean reBottom = rbtn_yes1.isSelected();
        boolean reCorners = rbtn_yes2.isSelected();

        boxHeight = orderManager.testNo(txt_boxHeight.getText());
        boxWidth = orderManager.testNo(txt_boxWidth.getText());
        boxLength = orderManager.testNo(txt_boxLength.getText());
        cardboardGrade = orderManager.testNo(txt_cardboardGrade.getText());
        quantity = orderManager.testNo(txt_quantity.getText());

        //colour print
        if (rbtn_0.isSelected() == true) {
            colourPrint = 0;
        } else if (rbtn_1.isSelected() == true) {
            colourPrint = 1;
        } else if (rbtn_2.isSelected() == true) {
            colourPrint = 2;
        }
        
//        checks if the box has been created
        outputCode = orderManager.addBox(boxWidth, boxLength, boxHeight,
                cardboardGrade, colourPrint, reBottom, reCorners,
                sealableTop, quantity);

        if (colourPrint == 3 && boxHeight > 0 && quantity > 0 && orderManager.checkInput(txt_boxHeight.getText(),txt_boxWidth.getText(),txt_boxLength.getText(),txt_quantity.getText()) == true) {
            // add the box as an object
            System.out.println("test");
//            orderManager.addBox(TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT, ERROR, reBottom);
        } else {
            clearValues();
        }
        updateValues();
        outputPrompt(outputCode);

    }//GEN-LAST:event_jbtn_addActionPerformed

    private void txt_boxHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_boxHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_boxHeightActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearValues();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_boxWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_boxWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_boxWidthActionPerformed

    private void txt_boxLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_boxLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_boxLengthActionPerformed

    private void rbtn_yes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_yes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_yes3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        int confirmed = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit?", "Exit Program",
                JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        JOptionPane.showConfirmDialog(null, "Please fill each text field:\nBox Width: Please enter a width from 0cm - 999cm \nBox Length: Please enter a length from 0cm - 999cm \nBox Height: Please enter a height from 0cm - 999cm\nCardboard Grade: 1-5\nQuantity: Please enter a quantity integer greater that 0\nWhen all fields are full press add, once all boxs are added press complete", "Box order help!", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_btn_helpActionPerformed

    private void clearValues() {
        txt_boxHeight.setText("");
        txt_boxWidth.setText("");
        txt_boxLength.setText("");
        txt_cardboardGrade.setText("");
        txt_quantity.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
    }

    private void updateValues() {
        noBoxes.setText("Num boxes: " + orderManager.getNumBoxes());
        totCost.setText("TotalCost: " + orderManager.getAllCosts());
    }

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
            java.util.logging.Logger.getLogger(BoxUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoxUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoxUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoxUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoxUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_help;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn_add;
    private javax.swing.JButton jbtn_completeOrder;
    private javax.swing.JLabel noBoxes;
    private javax.swing.JRadioButton rbtn_0;
    private javax.swing.JRadioButton rbtn_1;
    private javax.swing.JRadioButton rbtn_2;
    private javax.swing.JRadioButton rbtn_no1;
    private javax.swing.JRadioButton rbtn_no2;
    private javax.swing.JRadioButton rbtn_no3;
    private javax.swing.JRadioButton rbtn_yes1;
    private javax.swing.JRadioButton rbtn_yes2;
    private javax.swing.JRadioButton rbtn_yes3;
    private javax.swing.JLabel totCost;
    private javax.swing.JTextField txt_boxHeight;
    private javax.swing.JTextField txt_boxLength;
    private javax.swing.JTextField txt_boxWidth;
    private javax.swing.JTextField txt_cardboardGrade;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables

    private void outputPrompt(int outputCode) {
//        JOptionPane.showConfirmDialog(null,
//        "Are you sure you want to exit?", "Exit Program",
//        JOptionPane.YES_NO_OPTION);
        if (outputCode < 0) {
            if (outputCode == -1) {
                notSupplied();
            } else {
                parameterError();
            }
        } else if (outputCode > 0) {
            JOptionPane.showConfirmDialog(null, "New Box " + outputCode + " added to order", "Successfully Added Box", JOptionPane.CLOSED_OPTION);
        }
    }

    private void parameterError() {
        JOptionPane.showConfirmDialog(null, "New Boxes Failed To Add\nCheck Inputs", "ERROR ADDING BOX", JOptionPane.CLOSED_OPTION);
    }

    private void notSupplied() {
        //check if just a parameter error
        JOptionPane.showConfirmDialog(null, "Sorry\nFlexbox does not supply this box", "ERROR ADDING BOX", JOptionPane.CLOSED_OPTION);
    }

    
}
