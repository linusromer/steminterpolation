/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steminterpolation;
import java.math.BigDecimal;
/**
 *
 * @author xx
 */
public class steminterpolationui extends javax.swing.JFrame {

    /**
     * Creates new form steminterpolationui
     */
    public steminterpolationui() {
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

        jButton1 = new javax.swing.JButton();
        jLabelThin = new javax.swing.JLabel();
        jTextFieldThin = new javax.swing.JTextField();
        jLabelBlack = new javax.swing.JLabel();
        jTextFieldBlack = new javax.swing.JTextField();
        jLabelDecimals = new javax.swing.JLabel();
        jComboBoxDecimals = new javax.swing.JComboBox<>();
        jLabelSteps = new javax.swing.JLabel();
        jButtonCalculate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBoxSteps = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelThin.setText("thin:");

        jTextFieldThin.setText("20");
        jTextFieldThin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldThinActionPerformed(evt);
            }
        });

        jLabelBlack.setText("black:");

        jTextFieldBlack.setText("220");
        jTextFieldBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBlackActionPerformed(evt);
            }
        });

        jLabelDecimals.setText("decimals:");

        jComboBoxDecimals.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jComboBoxDecimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDecimalsActionPerformed(evt);
            }
        });

        jLabelSteps.setText("steps:");

        jButtonCalculate.setText("calculate");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBoxSteps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9" }));
        jComboBoxSteps.setSelectedIndex(6);
        jComboBoxSteps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStepsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSteps)
                            .addComponent(jLabelThin))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldThin)
                            .addComponent(jComboBoxSteps, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBlack)
                            .addComponent(jLabelDecimals))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDecimals, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelThin)
                            .addComponent(jTextFieldThin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBlack)
                            .addComponent(jTextFieldBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDecimals)
                            .addComponent(jComboBoxDecimals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSteps)
                            .addComponent(jComboBoxSteps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldThinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldThinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldThinActionPerformed

    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateActionPerformed
        String resultingSteps = "Styles \tEqual Steps \tImpallari \tAbraham \tLuc(as)\n";
        int s = Integer.parseInt(jComboBoxSteps.getSelectedItem().toString());
        double t = Double.parseDouble(jTextFieldThin.getText());
        double b = Double.parseDouble(jTextFieldBlack.getText());
        int decimals = Integer.parseInt(jComboBoxDecimals.getSelectedItem().toString());
        for(int x = 1; x <= s; x++) {
            resultingSteps += "step " + x + ":\t" 
                + BigDecimal.valueOf(equalSteps(x,t,b,s)).setScale(decimals, BigDecimal.ROUND_HALF_UP) + "\t" 
                + BigDecimal.valueOf(impallariSteps(x,t,b,s)).setScale(decimals, BigDecimal.ROUND_HALF_UP) + "\t" 
                + BigDecimal.valueOf(abrahamSteps(x,t,b,s)).setScale(decimals, BigDecimal.ROUND_HALF_UP) + "\t" 
                + BigDecimal.valueOf(lucasSteps(x,t,b,s)).setScale(decimals, BigDecimal.ROUND_HALF_UP) + "\n";
        }
        jTextArea1.setText(resultingSteps);
    }//GEN-LAST:event_jButtonCalculateActionPerformed

    private void jTextFieldBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBlackActionPerformed

    private void jComboBoxDecimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDecimalsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDecimalsActionPerformed

    private void jComboBoxStepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStepsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStepsActionPerformed

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
            java.util.logging.Logger.getLogger(steminterpolationui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(steminterpolationui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(steminterpolationui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(steminterpolationui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new steminterpolationui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JComboBox<String> jComboBoxDecimals;
    private javax.swing.JComboBox<String> jComboBoxSteps;
    private javax.swing.JLabel jLabelBlack;
    private javax.swing.JLabel jLabelDecimals;
    private javax.swing.JLabel jLabelSteps;
    private javax.swing.JLabel jLabelThin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldBlack;
    private javax.swing.JTextField jTextFieldThin;
    // End of variables declaration//GEN-END:variables

    /* Methods by Linus Romer
    Following Pablo Impallari at 
    https://web.archive.org/web/20170721200038/http://www.impallari.com:80/familysteps/index.php
    and using the following variables:

    t = thin value (20 in the example)
    b = black value (220 in the example)
    s = number of steps (9 in the example)
    x = the step number (ranging from 1 to 9 in the example)
    E = the interpolated value using equal steps
    L = the interpolated value using Luc(as) (deGroot) Formula
    I = the interpolated value using Impallari (Pablo) Formula
    A = the interpolated value using Abraham (Lee) Formula

    Then E is a linear function in x:

    E = (b-t)/(s-1)*(x-1)+t

    L is an exponential function in x:

    L = t*(b/t)^((x-1)/(s-1))

    I is a weighted average of E and L:

    I = (x-1)/(s-1)*E+(s-x)/(s-1)*L

    A is also a weighted average of E and L:

    A = (1-((x-1)/(s-1))^1.25)*E+((x-1)/(s-1))^1.25*L
    */
    
    // evenSteps is the formula E above
    private static double equalSteps(double x, double t, double b, double s) {
        return (b-t)/(s-1)*(x-1)+t;
    }
    
    // lucasSteps is the formula L above
    private static double lucasSteps(double x, double t, double b, double s) {
        return t*Math.pow(b/t,(x-1)/(s-1));
    }
    
    // impallariSteps is the formula I above
    private static double impallariSteps(double x, double t, double b, double s) {
        return (x-1)/(s-1)*equalSteps(x,t,b,s)+(s-x)/(s-1)*lucasSteps(x,t,b,s);
    }

    // abrahamSteps is the formula A above
    private static double abrahamSteps(double x, double t, double b, double s) {
        return (1-Math.pow((x-1)/(s-1),1.25))*equalSteps(x,t,b,s)
                +Math.pow((x-1)/(s-1),1.25)*lucasSteps(x,t,b,s);
    }
}
