/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.FuncionáriosDAO;
import DTO.FuncionáriosDTO;

/**
 *
 * @author gabri
 */
public class frmFuncionáriosVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmFuncionáriosVIEW
     */
    public frmFuncionáriosVIEW() {
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

        jtxSexo_Funcionários = new javax.swing.ButtonGroup();
        TÍTULO = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        NOME = new javax.swing.JLabel();
        jtxNome_Funcionários = new javax.swing.JTextField();
        SEXO = new javax.swing.JLabel();
        IDADE = new javax.swing.JLabel();
        ENDEREÇO = new javax.swing.JLabel();
        jtxEndereço_Funcionários = new javax.swing.JTextField();
        EMAIL = new javax.swing.JLabel();
        jtxEmail_Funcionários = new javax.swing.JTextField();
        TELEFONE = new javax.swing.JLabel();
        CADASTRO = new javax.swing.JLabel();
        jtxCPF_Funcionários = new javax.swing.JFormattedTextField();
        jtxIdade_Funcionários = new javax.swing.JTextField();
        jtxTelefone_Funcionários = new javax.swing.JFormattedTextField();
        jtxDataContratação_Funcionários = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();
        btnEnviar_Funcionários = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        CONTRATAÇÃO = new javax.swing.JLabel();
        jtxIDFilial_Funcionários = new javax.swing.JTextField();
        CADASTRO1 = new javax.swing.JLabel();
        jtxCargo_Funcionários = new javax.swing.JTextField();
        radioMasculino = new javax.swing.JRadioButton();
        radioFeminino = new javax.swing.JRadioButton();
        btnVerTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TÍTULO.setBackground(new java.awt.Color(153, 0, 51));
        TÍTULO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TÍTULO.setForeground(new java.awt.Color(255, 255, 255));
        TÍTULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TÍTULO.setText("Funcionários");
        TÍTULO.setOpaque(true);

        CPF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CPF.setText("CPF:");

        NOME.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        NOME.setText("Nome:");

        jtxNome_Funcionários.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxNome_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxNome_Funcionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNome_FuncionáriosActionPerformed(evt);
            }
        });

        SEXO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        SEXO.setText("Sexo:");

        IDADE.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        IDADE.setText("Idade:");

        ENDEREÇO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        ENDEREÇO.setText("Endereço:");

        jtxEndereço_Funcionários.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxEndereço_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxEndereço_Funcionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEndereço_FuncionáriosActionPerformed(evt);
            }
        });

        EMAIL.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        EMAIL.setText("Email:");

        jtxEmail_Funcionários.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxEmail_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxEmail_Funcionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEmail_FuncionáriosActionPerformed(evt);
            }
        });

        TELEFONE.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TELEFONE.setText("Telefone:");

        CADASTRO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CADASTRO.setText("ID da Filial:");

        jtxCPF_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            jtxCPF_Funcionários.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtxIdade_Funcionários.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIdade_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIdade_Funcionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIdade_FuncionáriosActionPerformed(evt);
            }
        });

        jtxTelefone_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            jtxTelefone_Funcionários.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtxDataContratação_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            jtxDataContratação_Funcionários.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnVoltar.setBackground(new java.awt.Color(0, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEnviar_Funcionários.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviar_Funcionários.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnEnviar_Funcionários.setText("ENVIAR");
        btnEnviar_Funcionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_FuncionáriosActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        CONTRATAÇÃO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CONTRATAÇÃO.setText("Data de contratação:");

        jtxIDFilial_Funcionários.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIDFilial_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIDFilial_Funcionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIDFilial_FuncionáriosActionPerformed(evt);
            }
        });

        CADASTRO1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CADASTRO1.setText("Cargo:");

        jtxCargo_Funcionários.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxCargo_Funcionários.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxCargo_Funcionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCargo_FuncionáriosActionPerformed(evt);
            }
        });

        jtxSexo_Funcionários.add(radioMasculino);
        radioMasculino.setText("M");
        radioMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasculinoActionPerformed(evt);
            }
        });

        jtxSexo_Funcionários.add(radioFeminino);
        radioFeminino.setText("F");

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
                        .addGap(6, 6, 6)
                        .addComponent(radioMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxNome_Funcionários, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxCPF_Funcionários)
                            .addComponent(jtxDataContratação_Funcionários)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxEndereço_Funcionários)
                                    .addComponent(jtxEmail_Funcionários)
                                    .addComponent(jtxIdade_Funcionários)
                                    .addComponent(jtxIDFilial_Funcionários)
                                    .addComponent(jtxTelefone_Funcionários)))
                            .addComponent(jtxCargo_Funcionários)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NOME)
                                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CADASTRO)
                                    .addComponent(SEXO)
                                    .addComponent(IDADE)
                                    .addComponent(ENDEREÇO)
                                    .addComponent(EMAIL)
                                    .addComponent(TELEFONE)
                                    .addComponent(CONTRATAÇÃO)
                                    .addComponent(CADASTRO1))
                                .addGap(0, 231, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnviar_Funcionários)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerTabela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TÍTULO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxCPF_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NOME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxNome_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SEXO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDADE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIdade_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ENDEREÇO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxEndereço_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EMAIL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxEmail_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TELEFONE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxTelefone_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CADASTRO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIDFilial_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CADASTRO1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxCargo_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CONTRATAÇÃO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxDataContratação_Funcionários, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar_Funcionários)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnVerTabela))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxNome_FuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNome_FuncionáriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNome_FuncionáriosActionPerformed

    private void jtxEndereço_FuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEndereço_FuncionáriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEndereço_FuncionáriosActionPerformed

    private void jtxEmail_FuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEmail_FuncionáriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEmail_FuncionáriosActionPerformed

    private void jtxIdade_FuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIdade_FuncionáriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIdade_FuncionáriosActionPerformed

    private void jtxIDFilial_FuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIDFilial_FuncionáriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIDFilial_FuncionáriosActionPerformed

    private void jtxCargo_FuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCargo_FuncionáriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCargo_FuncionáriosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
                
        dispose();
        new LoginVIEW().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        jtxCPF_Funcionários.setText("");
        jtxCargo_Funcionários.setText("");
        jtxDataContratação_Funcionários.setText("");
        jtxEmail_Funcionários.setText("");
        jtxEndereço_Funcionários.setText("");
        jtxIDFilial_Funcionários.setText("");
        jtxIdade_Funcionários.setText("");
        jtxNome_Funcionários.setText("");
        jtxTelefone_Funcionários.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEnviar_FuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_FuncionáriosActionPerformed
        String CPF_FuncionáriosVIEW, Telefone_FuncionáriosVIEW, Cargo_FuncionáriosVIEW, DataContratação_FuncionáriosVIEW, Email_FuncionáriosVIEW, Endereço_FuncionáriosVIEW,  Nome_FuncionáriosVIEW, Sexo_FuncionáriosVIEW;
        int Idade_FuncionáriosVIEW, IDFilial_FuncionáriosVIEW; 
        
        if (radioMasculino.isSelected()){
            Sexo_FuncionáriosVIEW = "M";
        }
        
        else {
            Sexo_FuncionáriosVIEW = "F";
        }
        
        IDFilial_FuncionáriosVIEW = Integer.parseInt(jtxIDFilial_Funcionários.getText());
        CPF_FuncionáriosVIEW = jtxCPF_Funcionários.getText();
        DataContratação_FuncionáriosVIEW = jtxDataContratação_Funcionários.getText();
        Email_FuncionáriosVIEW = jtxEmail_Funcionários.getText();
        Endereço_FuncionáriosVIEW = jtxEndereço_Funcionários.getText();
        Nome_FuncionáriosVIEW = jtxNome_Funcionários.getText();
        Telefone_FuncionáriosVIEW = jtxTelefone_Funcionários.getText();
        Cargo_FuncionáriosVIEW = jtxCargo_Funcionários.getText();
        Idade_FuncionáriosVIEW = Integer.parseInt(jtxIdade_Funcionários.getText());
        
        FuncionáriosDTO objFuncionáriosDTO = new FuncionáriosDTO();
        
        objFuncionáriosDTO.setCPF_FuncionáriosDTO(CPF_FuncionáriosVIEW);
        objFuncionáriosDTO.setCargo_FuncionáriosDTO(Cargo_FuncionáriosVIEW);
        objFuncionáriosDTO.setDataContratação_FuncionáriosDTO(DataContratação_FuncionáriosVIEW);
        objFuncionáriosDTO.setEmail_FuncionáriosDTO(Email_FuncionáriosVIEW);
        objFuncionáriosDTO.setEndereço_FuncionáriosDTO(Endereço_FuncionáriosVIEW);
        objFuncionáriosDTO.setIDFilial_FuncionáriosDTO(IDFilial_FuncionáriosVIEW);
        objFuncionáriosDTO.setIdade_FuncionáriosDTO(Idade_FuncionáriosVIEW);
        objFuncionáriosDTO.setNome_FuncionáriosDTO(Nome_FuncionáriosVIEW);
        objFuncionáriosDTO.setSexo_FuncionáriosDTO(Sexo_FuncionáriosVIEW);
        objFuncionáriosDTO.setTelefone_FuncionáriosDTO(Telefone_FuncionáriosVIEW);
        
        FuncionáriosDAO objFuncionáriosDAO = new FuncionáriosDAO();
        objFuncionáriosDAO.cadastrarFuncionário(objFuncionáriosDTO);
    }//GEN-LAST:event_btnEnviar_FuncionáriosActionPerformed

    private void radioMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMasculinoActionPerformed

    private void btnVerTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTabelaActionPerformed

        new tableFuncionáriosVIEW().setVisible(true);
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
            java.util.logging.Logger.getLogger(frmFuncionáriosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFuncionáriosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFuncionáriosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFuncionáriosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFuncionáriosVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CADASTRO;
    private javax.swing.JLabel CADASTRO1;
    private javax.swing.JLabel CONTRATAÇÃO;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel EMAIL;
    private javax.swing.JLabel ENDEREÇO;
    private javax.swing.JLabel IDADE;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel SEXO;
    private javax.swing.JLabel TELEFONE;
    private javax.swing.JLabel TÍTULO;
    private javax.swing.JButton btnEnviar_Funcionários;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVerTabela;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField jtxCPF_Funcionários;
    private javax.swing.JTextField jtxCargo_Funcionários;
    private javax.swing.JFormattedTextField jtxDataContratação_Funcionários;
    private javax.swing.JTextField jtxEmail_Funcionários;
    private javax.swing.JTextField jtxEndereço_Funcionários;
    private javax.swing.JTextField jtxIDFilial_Funcionários;
    private javax.swing.JTextField jtxIdade_Funcionários;
    private javax.swing.JTextField jtxNome_Funcionários;
    private javax.swing.ButtonGroup jtxSexo_Funcionários;
    private javax.swing.JFormattedTextField jtxTelefone_Funcionários;
    private javax.swing.JRadioButton radioFeminino;
    private javax.swing.JRadioButton radioMasculino;
    // End of variables declaration//GEN-END:variables
}
