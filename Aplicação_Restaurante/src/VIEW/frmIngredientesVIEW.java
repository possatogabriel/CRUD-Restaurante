/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.IngredientesDAO;
import DTO.IngredientesDTO;

/**
 *
 * @author gabri
 */
public class frmIngredientesVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmIngredientesVIEW
     */
    public frmIngredientesVIEW() {
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

        PRATO = new javax.swing.JLabel();
        jtxIDBebida_Ingredientes = new javax.swing.JTextField();
        TÍTULO = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        BEBIDA = new javax.swing.JLabel();
        btnEnviar_Ingredientes = new javax.swing.JButton();
        NOME = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jtxNome_Ingredientes = new javax.swing.JTextField();
        MEDIDA = new javax.swing.JLabel();
        jtxUnidadeMedida_Ingredientes = new javax.swing.JTextField();
        jtxIDPrato_Ingredientes = new javax.swing.JTextField();
        btnVerTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PRATO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        PRATO.setText("ID do Prato:");

        jtxIDBebida_Ingredientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIDBebida_Ingredientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIDBebida_Ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIDBebida_IngredientesActionPerformed(evt);
            }
        });

        TÍTULO.setBackground(new java.awt.Color(153, 0, 51));
        TÍTULO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TÍTULO.setForeground(new java.awt.Color(255, 255, 255));
        TÍTULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TÍTULO.setText("Ingredientes");
        TÍTULO.setOpaque(true);

        btnVoltar.setBackground(new java.awt.Color(0, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        BEBIDA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        BEBIDA.setText("ID da Bebida:");

        btnEnviar_Ingredientes.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviar_Ingredientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnEnviar_Ingredientes.setText("ENVIAR");
        btnEnviar_Ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_IngredientesActionPerformed(evt);
            }
        });

        NOME.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        NOME.setText("Nome:");

        btnLimpar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jtxNome_Ingredientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxNome_Ingredientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxNome_Ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNome_IngredientesActionPerformed(evt);
            }
        });

        MEDIDA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        MEDIDA.setText("Unidade de Medida:");

        jtxUnidadeMedida_Ingredientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxUnidadeMedida_Ingredientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxUnidadeMedida_Ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxUnidadeMedida_IngredientesActionPerformed(evt);
            }
        });

        jtxIDPrato_Ingredientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIDPrato_Ingredientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIDPrato_Ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIDPrato_IngredientesActionPerformed(evt);
            }
        });

        btnVerTabela.setBackground(new java.awt.Color(0, 153, 153));
        btnVerTabela.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnVerTabela.setText("VER TABELA");
        btnVerTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TÍTULO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NOME)
                            .addComponent(MEDIDA)
                            .addComponent(PRATO)
                            .addComponent(BEBIDA))
                        .addGap(0, 247, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxNome_Ingredientes, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(jtxUnidadeMedida_Ingredientes, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(jtxIDPrato_Ingredientes, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(jtxIDBebida_Ingredientes, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnviar_Ingredientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TÍTULO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NOME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxNome_Ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(MEDIDA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxUnidadeMedida_Ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PRATO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIDPrato_Ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BEBIDA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIDBebida_Ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar_Ingredientes)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnVerTabela))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxIDBebida_IngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIDBebida_IngredientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIDBebida_IngredientesActionPerformed

    private void jtxNome_IngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNome_IngredientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNome_IngredientesActionPerformed

    private void jtxUnidadeMedida_IngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxUnidadeMedida_IngredientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxUnidadeMedida_IngredientesActionPerformed

    private void jtxIDPrato_IngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIDPrato_IngredientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIDPrato_IngredientesActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
                
        dispose();
        new LoginVIEW().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        jtxIDBebida_Ingredientes.setText("");
        jtxIDPrato_Ingredientes.setText("");
        jtxNome_Ingredientes.setText("");
        jtxUnidadeMedida_Ingredientes.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEnviar_IngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_IngredientesActionPerformed
        String Nome_IngredientesVIEW, UnidadeMedida_IngredientesVIEW;
        int IDPrato_IngredientesVIEW, IDBebida_IngredientesVIEW;
        
        Nome_IngredientesVIEW = jtxNome_Ingredientes.getText();
        UnidadeMedida_IngredientesVIEW = jtxUnidadeMedida_Ingredientes.getText();
        IDPrato_IngredientesVIEW = Integer.parseInt(jtxIDPrato_Ingredientes.getText());
        IDBebida_IngredientesVIEW = Integer.parseInt(jtxIDBebida_Ingredientes.getText());
        
        IngredientesDTO objIngredientesDTO = new IngredientesDTO();
        
        objIngredientesDTO.setIDBebida_IngredientesDTO(IDBebida_IngredientesVIEW);
        objIngredientesDTO.setIDPrato_IngredientesDTO(IDPrato_IngredientesVIEW);
        objIngredientesDTO.setNome_IngredientesDTO(Nome_IngredientesVIEW);
        objIngredientesDTO.setUnidadeMedida_IngredientesDTO(UnidadeMedida_IngredientesVIEW);
        
        IngredientesDAO objIngredientesDAO = new IngredientesDAO();
        objIngredientesDAO.cadastrarIngrediente(objIngredientesDTO);
    }//GEN-LAST:event_btnEnviar_IngredientesActionPerformed

    private void btnVerTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTabelaActionPerformed

        new tableIngredientesVIEW().setVisible(true);
    }//GEN-LAST:event_btnVerTabelaActionPerformed

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
            java.util.logging.Logger.getLogger(frmIngredientesVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngredientesVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngredientesVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngredientesVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngredientesVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BEBIDA;
    private javax.swing.JLabel MEDIDA;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel PRATO;
    private javax.swing.JLabel TÍTULO;
    private javax.swing.JButton btnEnviar_Ingredientes;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVerTabela;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField jtxIDBebida_Ingredientes;
    private javax.swing.JTextField jtxIDPrato_Ingredientes;
    private javax.swing.JTextField jtxNome_Ingredientes;
    private javax.swing.JTextField jtxUnidadeMedida_Ingredientes;
    // End of variables declaration//GEN-END:variables
}
