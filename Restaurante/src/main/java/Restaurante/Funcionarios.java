/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

//import com.mycompany.restaurante_interface.*;
//import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Funcionarios extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public Funcionarios() {
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

        jbtnlimpar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnpronto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtxcargo_func = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxemail_func = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxnome_func = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtxendereco_func = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxcpf_func = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtxidade_func = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtelefe_func = new javax.swing.JTextPane();
        Voltar2 = new javax.swing.JButton();
        jtxdata_func = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtxsexo_func = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtxid_filial_func = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnlimpar.setText("Limpar");
        jbtnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlimparActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(135, 27, 34));
        jTextField2.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(240, 240, 240));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Funcionarios");

        jLabel5.setText("Idade:");

        jLabel1.setText("Nome:");

        jLabel7.setText("Data de contratação:");

        jLabel3.setText("CPF:");

        jbtnpronto.setText("Pronto");
        jbtnpronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprontoActionPerformed(evt);
            }
        });

        jLabel8.setText("Cargo:");

        jLabel4.setText("ID da Filial:");

        jScrollPane8.setViewportView(jtxcargo_func);

        jScrollPane4.setViewportView(jtxemail_func);

        jScrollPane1.setViewportView(jtxnome_func);

        jScrollPane5.setViewportView(jtxendereco_func);

        jScrollPane2.setViewportView(jtxcpf_func);

        jLabel2.setText("Email:");

        jLabel6.setText("Endereço:");

        jScrollPane6.setViewportView(jtxidade_func);

        jScrollPane3.setViewportView(jtxtelefe_func);

        Voltar2.setText("Voltar ");
        Voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar2ActionPerformed(evt);
            }
        });

        try {
            jtxdata_func.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxdata_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxdata_funcActionPerformed(evt);
            }
        });

        jLabel9.setText("Sexo:");

        jScrollPane7.setViewportView(jtxsexo_func);

        jScrollPane9.setViewportView(jtxid_filial_func);

        jLabel10.setText("Telefone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnlimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnpronto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Voltar2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxdata_func, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxdata_func, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnpronto)
                    .addComponent(jbtnlimpar)
                    .addComponent(Voltar2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlimparActionPerformed
        // TODO add your handling code here:
        
        jtxcargo_func.setText("");
        jtxcpf_func.setText("");
        jtxdata_func.setText("");
        jtxemail_func.setText("");
        jtxendereco_func.setText("");
        jtxidade_func.setText("");
        jtxnome_func.setText("");
        jtxtelefe_func.setText("");
        jtxsexo_func.setText("");
        jtxid_filial_func.setText("");
    }//GEN-LAST:event_jbtnlimparActionPerformed

    private void jbtnprontoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        String cargo = jtxcargo_func.getText();
        String cpf = jtxcpf_func.getText();
        String data = jtxdata_func.getText();
        String email = jtxemail_func.getText();
        String endereco  = jtxendereco_func.getText();
        String idade = jtxidade_func.getText();
        String nome = jtxnome_func.getText();
        String telefone = jtxtelefe_func.getText();
        String sexo = jtxsexo_func.getText();
        String id_filial = jtxid_filial_func.getText();
        if(!id_filial.isEmpty()){
            int id_filialInt = Integer.parseInt(id_filial);
        }


        Connector connector = new Connector();
        Connection connection = connector.getConnection();

        String sql = "insert into Funcionarios (Nome, CPF, Telefone, Email, Endereco, Idade, Data_contatacao, Cargo, Sexo) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //String sql = "insert into Funcionarios (ID_filial) values (?)";
        try{
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, jtxnome_func.getText());
            pstm.setString(2, jtxcpf_func.getText());
            pstm.setString(3, jtxtelefe_func.getText());
            pstm.setString(4, jtxemail_func.getText());
            pstm.setString(5, jtxendereco_func.getText());
            pstm.setString(6, jtxidade_func.getText());
            pstm.setString(7, jtxdata_func.getText());
            pstm.setString(8, jtxcargo_func.getText());
            pstm.setString(9, jtxsexo_func.getText());
            //pstm.setString(10, jtxid_filial_func.getText());

            pstm.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void Voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar2ActionPerformed
        // TODO add your handling code here:

        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_Voltar2ActionPerformed

    private void jtxdata_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxdata_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxdata_funcActionPerformed

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
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnlimpar;
    private javax.swing.JButton jbtnpronto;
    private javax.swing.JTextPane jtxcargo_func;
    private javax.swing.JTextPane jtxcpf_func;
    private javax.swing.JFormattedTextField jtxdata_func;
    private javax.swing.JTextPane jtxemail_func;
    private javax.swing.JTextPane jtxendereco_func;
    private javax.swing.JTextPane jtxid_filial_func;
    private javax.swing.JTextPane jtxidade_func;
    private javax.swing.JTextPane jtxnome_func;
    private javax.swing.JTextPane jtxsexo_func;
    private javax.swing.JTextPane jtxtelefe_func;
    // End of variables declaration//GEN-END:variables
}
