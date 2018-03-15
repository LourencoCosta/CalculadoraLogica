/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import calculadoralogica.process.ParameterProcess;
import calculadoralogica.process.ValidationRules;
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
        jTVisor = new javax.swing.JTextField();
        jBTrue = new javax.swing.JButton();
        jBFalse = new javax.swing.JButton();
        jBAnd = new javax.swing.JButton();
        jBOr = new javax.swing.JButton();
        jBNot = new javax.swing.JButton();
        jBImplicação = new javax.swing.JButton();
        jBEquivalencia = new javax.swing.JButton();
        jBAbreParenteses = new javax.swing.JButton();
        jBFechaParenteses = new javax.swing.JButton();
        jBCalcula = new javax.swing.JButton();
        jBLimpa = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTVisor.setEditable(false);
        jTVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTVisorActionPerformed(evt);
            }
        });

        jBTrue.setText("T");
        jBTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTrueActionPerformed(evt);
            }
        });

        jBFalse.setText("F");
        jBFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFalseActionPerformed(evt);
            }
        });

        jBAnd.setText("^");
        jBAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAndActionPerformed(evt);
            }
        });

        jBOr.setText("V");
        jBOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrActionPerformed(evt);
            }
        });

        jBNot.setText("~");
        jBNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNotActionPerformed(evt);
            }
        });

        jBImplicação.setText("->");
        jBImplicação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImplicaçãoActionPerformed(evt);
            }
        });

        jBEquivalencia.setText("<->");
        jBEquivalencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEquivalenciaActionPerformed(evt);
            }
        });

        jBAbreParenteses.setText("(");
        jBAbreParenteses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbreParentesesActionPerformed(evt);
            }
        });

        jBFechaParenteses.setText(")");
        jBFechaParenteses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFechaParentesesActionPerformed(evt);
            }
        });

        jBCalcula.setText("Calcular");
        jBCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalculaActionPerformed(evt);
            }
        });

        jBLimpa.setText("Limpar");
        jBLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTVisor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBTrue)
                        .addGap(18, 18, 18)
                        .addComponent(jBFalse)
                        .addGap(18, 18, 18)
                        .addComponent(jBAnd)
                        .addGap(18, 18, 18)
                        .addComponent(jBOr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBNot)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBImplicação)
                        .addGap(18, 18, 18)
                        .addComponent(jBEquivalencia)
                        .addGap(18, 18, 18)
                        .addComponent(jBAbreParenteses)
                        .addGap(18, 18, 18)
                        .addComponent(jBFechaParenteses, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpa)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jBCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAbreParenteses, jBAnd, jBEquivalencia, jBFalse, jBFechaParenteses, jBImplicação, jBLimpa, jBNot, jBOr, jBTrue});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTrue)
                    .addComponent(jBFalse)
                    .addComponent(jBAnd)
                    .addComponent(jBOr)
                    .addComponent(jBNot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBImplicação)
                    .addComponent(jBEquivalencia)
                    .addComponent(jBAbreParenteses)
                    .addComponent(jBFechaParenteses)
                    .addComponent(jBLimpa))
                .addGap(18, 18, 18)
                .addComponent(jBCalcula)
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

    private void jBTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTrueActionPerformed
        Digitado("T");
    }//GEN-LAST:event_jBTrueActionPerformed

    private void jBFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFalseActionPerformed
        Digitado("F");
    }//GEN-LAST:event_jBFalseActionPerformed

    private void jBAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAndActionPerformed
        Digitado("^");
    }//GEN-LAST:event_jBAndActionPerformed

    private void jBOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrActionPerformed
        Digitado("V");
    }//GEN-LAST:event_jBOrActionPerformed

    private void jBNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNotActionPerformed
        Digitado("~");
    }//GEN-LAST:event_jBNotActionPerformed

    private void jBFechaParentesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechaParentesesActionPerformed
        Digitado(")");
    }//GEN-LAST:event_jBFechaParentesesActionPerformed

    private void jTVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTVisorActionPerformed

    }//GEN-LAST:event_jTVisorActionPerformed

    private void jBAbreParentesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbreParentesesActionPerformed
        Digitado("(");
    }//GEN-LAST:event_jBAbreParentesesActionPerformed

    private void jBImplicaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImplicaçãoActionPerformed
        Digitado("->");
    }//GEN-LAST:event_jBImplicaçãoActionPerformed

    private void jBEquivalenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEquivalenciaActionPerformed
        Digitado("<->");
    }//GEN-LAST:event_jBEquivalenciaActionPerformed

    private void jBCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalculaActionPerformed
        if (calculaExpressao(equacao) == false) {
            JOptionPane.showMessageDialog(null, "Expressão Inválida");
        }
        jTVisor.setText(equacao);
    }//GEN-LAST:event_jBCalculaActionPerformed

    private void jBLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpaActionPerformed
        equacao = "";
        jTVisor.setText(equacao);
    }//GEN-LAST:event_jBLimpaActionPerformed

    private void Digitado(String recebido) {
        equacao = jTVisor.getText();
   
        
        equacao = equacao + recebido;
  
        jTVisor.setText(equacao);
    }

    private boolean calculaExpressao(String equacao) {
   
        ValidationRules vr = new ValidationRules();
        if(equacao.contains("<->")){
            equacao = equacao.replaceAll("<->", "<");
        }
        if (equacao.contains("->")){
            equacao = equacao.replaceAll("->", "-");
        }
        
        
        vr.validateLogicExpression(equacao);
        ParameterProcess pp = new ParameterProcess(100, 100);
        
        Queue q = pp.execute(equacao);
        CalculaExpressao.execute(q);
        
        return true;
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
    private javax.swing.JButton jBAbreParenteses;
    private javax.swing.JButton jBAnd;
    private javax.swing.JButton jBCalcula;
    private javax.swing.JButton jBEquivalencia;
    private javax.swing.JButton jBFalse;
    private javax.swing.JButton jBFechaParenteses;
    private javax.swing.JButton jBImplicação;
    private javax.swing.JButton jBLimpa;
    private javax.swing.JButton jBNot;
    private javax.swing.JButton jBOr;
    private javax.swing.JButton jBTrue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTVisor;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
