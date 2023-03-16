/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfaceDieta;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Pichau
 */
public class Nutricionista extends javax.swing.JFrame {
    
        private MaskFormatter Databr;
        private MaskFormatter CEPbr;
        private MaskFormatter CPFbr;

    /**
     * Creates new form Nutricionista
     * @throws java.text.ParseException
     */
    public Nutricionista() throws ParseException {
        
        CEPbr = new MaskFormatter("#####-###");
        Databr = new MaskFormatter("##/##/####");
        CPFbr = new MaskFormatter("###.###.###-##");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CPFNutri = new javax.swing.JFormattedTextField(CPFbr);
        NomeNutri = new javax.swing.JTextField();
        SobrenomeNutri = new javax.swing.JTextField();
        DataNutri = new javax.swing.JFormattedTextField(Databr);
        SexoNutri = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        CPFNutri1 = new javax.swing.JTextField();
        CPFNutri2 = new javax.swing.JTextField();
        CPFNutri3 = new javax.swing.JTextField();
        CPFNutri4 = new javax.swing.JTextField();
        CPFNutri5 = new javax.swing.JFormattedTextField(CEPbr);
        CPFNutri6 = new javax.swing.JTextField();
        CPFNutri7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(202, 163, 163));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nutricionista");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        CPFNutri.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));
        CPFNutri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFNutriActionPerformed(evt);
            }
        });

        NomeNutri.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        NomeNutri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeNutriActionPerformed(evt);
            }
        });

        SobrenomeNutri.setBorder(javax.swing.BorderFactory.createTitledBorder("Sobrenome"));
        SobrenomeNutri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobrenomeNutriActionPerformed(evt);
            }
        });

        DataNutri.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"));
        DataNutri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataNutriActionPerformed(evt);
            }
        });

        SexoNutri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        SexoNutri.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        jButton1.setText("Enviar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        CPFNutri1.setBorder(javax.swing.BorderFactory.createTitledBorder("Logradouro"));
        CPFNutri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFNutri1ActionPerformed(evt);
            }
        });

        CPFNutri2.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento"));
        CPFNutri2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFNutri2ActionPerformed(evt);
            }
        });

        CPFNutri3.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro"));
        CPFNutri3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFNutri3ActionPerformed(evt);
            }
        });

        CPFNutri4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade"));
        CPFNutri4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFNutri4ActionPerformed(evt);
            }
        });

        CPFNutri5.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));
        CPFNutri5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFNutri5ActionPerformed(evt);
            }
        });

        CPFNutri6.setBorder(javax.swing.BorderFactory.createTitledBorder("Nº"));
        CPFNutri6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFNutri6ActionPerformed(evt);
            }
        });

        CPFNutri7.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));
        CPFNutri7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFNutri7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Endereço");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Dados pessoais");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NomeNutri)
                                .addGap(18, 18, 18)
                                .addComponent(SobrenomeNutri)
                                .addGap(18, 18, 18)
                                .addComponent(CPFNutri))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(DataNutri, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(SexoNutri, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CPFNutri3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CPFNutri1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CPFNutri2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CPFNutri6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CPFNutri4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CPFNutri7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CPFNutri5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeNutri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SobrenomeNutri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFNutri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataNutri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SexoNutri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFNutri3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFNutri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFNutri2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFNutri6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFNutri4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFNutri7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFNutri5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(252, 252, 252))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CPFNutriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFNutriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFNutriActionPerformed

    private void NomeNutriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeNutriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeNutriActionPerformed

    private void SobrenomeNutriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobrenomeNutriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SobrenomeNutriActionPerformed

    private void DataNutriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataNutriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataNutriActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Enviado com sucesso!");

    }//GEN-LAST:event_jButton1MouseClicked

    private void CPFNutri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFNutri1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFNutri1ActionPerformed

    private void CPFNutri2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFNutri2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFNutri2ActionPerformed

    private void CPFNutri3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFNutri3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFNutri3ActionPerformed

    private void CPFNutri4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFNutri4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFNutri4ActionPerformed

    private void CPFNutri5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFNutri5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFNutri5ActionPerformed

    private void CPFNutri6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFNutri6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFNutri6ActionPerformed

    private void CPFNutri7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFNutri7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFNutri7ActionPerformed

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
            java.util.logging.Logger.getLogger(Nutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Nutricionista().setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(Nutricionista.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPFNutri;
    private javax.swing.JTextField CPFNutri1;
    private javax.swing.JTextField CPFNutri2;
    private javax.swing.JTextField CPFNutri3;
    private javax.swing.JTextField CPFNutri4;
    private javax.swing.JTextField CPFNutri5;
    private javax.swing.JTextField CPFNutri6;
    private javax.swing.JTextField CPFNutri7;
    private javax.swing.JTextField DataNutri;
    private javax.swing.JTextField NomeNutri;
    private javax.swing.JComboBox<String> SexoNutri;
    private javax.swing.JTextField SobrenomeNutri;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
