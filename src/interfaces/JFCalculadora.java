/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Exceptions.ValidateExpressionException;
import calculadoralogica.process.ParameterProcess;
import calculadoralogica.process.ValidationRules;
import calculadoralogica.process.CalculaExpressao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import structures.Queue;

/**
 *
 * @author JEFTE
 */
public class JFCalculadora extends javax.swing.JFrame {

    String equacao = "";

    /**
     * Creates new form JFCalculadora
     */
    public JFCalculadora() {
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

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        resultDisplay = new javax.swing.JTextField();
        trueButton = new javax.swing.JButton();
        falseButton = new javax.swing.JButton();
        andButton = new javax.swing.JButton();
        orButton = new javax.swing.JButton();
        notButton = new javax.swing.JButton();
        implicityButton = new javax.swing.JButton();
        equivalencyButton = new javax.swing.JButton();
        openParentheseButton = new javax.swing.JButton();
        closeParentheseButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        clearAllButton = new javax.swing.JButton();
        backspaceButton = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        resultDisplay.setEditable(false);
        resultDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultDisplayActionPerformed(evt);
            }
        });

        trueButton.setText("T");
        trueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trueButtonActionPerformed(evt);
            }
        });

        falseButton.setText("F");
        falseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falseButtonActionPerformed(evt);
            }
        });

        andButton.setText("^");
        andButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andButtonActionPerformed(evt);
            }
        });

        orButton.setText("V");
        orButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orButtonActionPerformed(evt);
            }
        });

        notButton.setText("~");
        notButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notButtonActionPerformed(evt);
            }
        });

        implicityButton.setText("->");
        implicityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                implicityButtonActionPerformed(evt);
            }
        });

        equivalencyButton.setText("<->");
        equivalencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equivalencyButtonActionPerformed(evt);
            }
        });

        openParentheseButton.setText("(");
        openParentheseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openParentheseButtonActionPerformed(evt);
            }
        });

        closeParentheseButton.setText(")");
        closeParentheseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeParentheseButtonActionPerformed(evt);
            }
        });

        calculateButton.setText("Calcular");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        clearAllButton.setText("Limpar");
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButtonActionPerformed(evt);
            }
        });

        backspaceButton.setText("<- Backspace ");
        backspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultDisplay)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(trueButton)
                                .addGap(18, 18, 18)
                                .addComponent(falseButton)
                                .addGap(18, 18, 18)
                                .addComponent(andButton)
                                .addGap(18, 18, 18)
                                .addComponent(orButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(implicityButton)
                                .addGap(18, 18, 18)
                                .addComponent(equivalencyButton)
                                .addGap(18, 18, 18)
                                .addComponent(openParentheseButton)
                                .addGap(18, 18, 18)
                                .addComponent(closeParentheseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearAllButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backspaceButton)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {andButton, clearAllButton, closeParentheseButton, equivalencyButton, falseButton, implicityButton, notButton, openParentheseButton, orButton, trueButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trueButton)
                    .addComponent(falseButton)
                    .addComponent(andButton)
                    .addComponent(orButton)
                    .addComponent(notButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(implicityButton)
                    .addComponent(equivalencyButton)
                    .addComponent(openParentheseButton)
                    .addComponent(closeParentheseButton)
                    .addComponent(clearAllButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(backspaceButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trueButtonActionPerformed
        digitado("T");
    }//GEN-LAST:event_trueButtonActionPerformed

    private void falseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_falseButtonActionPerformed
        digitado("F");
    }//GEN-LAST:event_falseButtonActionPerformed

    private void andButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andButtonActionPerformed
        digitado("^");
    }//GEN-LAST:event_andButtonActionPerformed

    private void orButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orButtonActionPerformed
        digitado("V");
    }//GEN-LAST:event_orButtonActionPerformed

    private void notButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notButtonActionPerformed
        digitado("~");
    }//GEN-LAST:event_notButtonActionPerformed

    private void closeParentheseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeParentheseButtonActionPerformed
        digitado(")");
    }//GEN-LAST:event_closeParentheseButtonActionPerformed

    private void resultDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultDisplayActionPerformed

    }//GEN-LAST:event_resultDisplayActionPerformed

    private void openParentheseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openParentheseButtonActionPerformed
        digitado("(");
    }//GEN-LAST:event_openParentheseButtonActionPerformed

    private void implicityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_implicityButtonActionPerformed
        digitado("->");
    }//GEN-LAST:event_implicityButtonActionPerformed

    private void equivalencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equivalencyButtonActionPerformed
        digitado("<->");
    }//GEN-LAST:event_equivalencyButtonActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        try {
            //if (calculaExpressao(equacao) == false) {
            //    JOptionPane.showMessageDialog(null, "Expressão Inválida");
            //}
            equacao = calculaExpressao(equacao);
        } catch (ValidateExpressionException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        resultDisplay.setText(equacao);
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void clearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllButtonActionPerformed
        equacao = "";
        resultDisplay.setText(equacao);
    }//GEN-LAST:event_clearAllButtonActionPerformed

    private void backspaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceButtonActionPerformed
        if (!equacao.isEmpty()) {
            equacao = equacao.substring(0, equacao.length() - 1);
            apagar(equacao);
        }
    }//GEN-LAST:event_backspaceButtonActionPerformed

    private void apagar(String recebido) {
        resultDisplay.setText(recebido);
    }

    private void digitado(String recebido) {
        equacao = resultDisplay.getText();

        equacao = equacao + recebido;

        resultDisplay.setText(equacao);
    }

    private String calculaExpressao(String equacao) throws ValidateExpressionException {

        ValidationRules vr = new ValidationRules();
        if (equacao.contains("<->")) {
            equacao = equacao.replaceAll("<->", "<");
        }
        if (equacao.contains("->")) {
            equacao = equacao.replaceAll("->", "-");
        }
        String resultado = new String();
        try {
            vr.execute(equacao);
            ParameterProcess pp = new ParameterProcess(100, 100);

            Queue q = pp.execute(equacao);
            CalculaExpressao resolveExpressao = new CalculaExpressao(100);

            resultado = resolveExpressao.execute(q);
        } catch (ValidateExpressionException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resultado;
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
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton andButton;
    private javax.swing.JButton backspaceButton;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearAllButton;
    private javax.swing.JButton closeParentheseButton;
    private javax.swing.JButton equivalencyButton;
    private javax.swing.JButton falseButton;
    private javax.swing.JButton implicityButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton notButton;
    private javax.swing.JButton openParentheseButton;
    private javax.swing.JButton orButton;
    private javax.swing.JTextField resultDisplay;
    private javax.swing.JButton trueButton;
    // End of variables declaration//GEN-END:variables
}
