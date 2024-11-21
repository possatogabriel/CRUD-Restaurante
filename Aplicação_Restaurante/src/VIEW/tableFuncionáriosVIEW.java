package VIEW;

import DAO.FuncionáriosDAO;
import DTO.FuncionáriosDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Possato
 */

public class tableFuncionáriosVIEW extends javax.swing.JFrame {

    /**
     * Creates new form tableFuncionáriosVIEW
     */
    public tableFuncionáriosVIEW() {
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

        TÍTULO = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionários = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jtxPesquisar = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TÍTULO.setBackground(new java.awt.Color(153, 0, 51));
        TÍTULO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TÍTULO.setForeground(new java.awt.Color(255, 255, 255));
        TÍTULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TÍTULO.setText("Funcionários");
        TÍTULO.setOpaque(true);

        tabelaFuncionários.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Sexo", "Idade", "Endereço", "Email", "Telefone", "ID da Filial", "Cargo", "Data da Contratação"
            }
        ));
        jScrollPane1.setViewportView(tabelaFuncionários);

        btnListar.setBackground(new java.awt.Color(0, 153, 153));
        btnListar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(0, 153, 153));
        btnPesquisar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF", "Nome", "Sexo", "Idade", "Endereco", "Email", "Telefone", "ID_filial", "Cargo", "Data_contratacao" }));

        btnSair.setBackground(new java.awt.Color(0, 153, 153));
        btnSair.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TÍTULO, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TÍTULO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnPesquisar)
                    .addComponent(jtxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listarValoresFuncionários();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String Tipo, Valor;
        
        Tipo = ComboBox.getSelectedItem().toString();
        Valor = jtxPesquisar.getText();
        
        pesquisarValoresFuncionários(Valor, Tipo);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(tableFuncionáriosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableFuncionáriosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableFuncionáriosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableFuncionáriosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableFuncionáriosVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JLabel TÍTULO;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxPesquisar;
    private javax.swing.JTable tabelaFuncionários;
    // End of variables declaration//GEN-END:variables
    
    private void listarValoresFuncionários(){
        try {
            FuncionáriosDAO objFuncionáriosDAO = new FuncionáriosDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaFuncionários.getModel();
            model.setNumRows(0);
            
            ArrayList<FuncionáriosDTO> lista = objFuncionáriosDAO.listarFuncionários();
            
            for (int num = 0; num < lista.size(); num ++) {
                model.addRow(new Object [] {
                    lista.get(num).getCPF_FuncionáriosDTO(),
                    lista.get(num).getNome_FuncionáriosDTO(),
                    lista.get(num).getSexo_FuncionáriosDTO(),
                    lista.get(num).getIdade_FuncionáriosDTO(),
                    lista.get(num).getEndereço_FuncionáriosDTO(),
                    lista.get(num).getEmail_FuncionáriosDTO(),
                    lista.get(num).getTelefone_FuncionáriosDTO(),
                    lista.get(num).getIDFilial_FuncionáriosDTO(),
                    lista.get(num).getCargo_FuncionáriosDTO(),
                    lista.get(num).getDataContratação_FuncionáriosDTO()
                });         
            }
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'tableFuncionáriosVIEW': " + erro);
        }
    }
    
    private void pesquisarValoresFuncionários(String valor, String item){
        try {
            FuncionáriosDAO objFuncionáriosDAO = new FuncionáriosDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaFuncionários.getModel();
            model.setNumRows(0);
            
            ArrayList<FuncionáriosDTO> lista = objFuncionáriosDAO.pesquisarFuncionários(valor, item);
            
            for (int num = 0; num < lista.size(); num ++) {
                model.addRow(new Object [] {
                    lista.get(num).getCPF_FuncionáriosDTO(),
                    lista.get(num).getNome_FuncionáriosDTO(),
                    lista.get(num).getSexo_FuncionáriosDTO(),
                    lista.get(num).getIdade_FuncionáriosDTO(),
                    lista.get(num).getEndereço_FuncionáriosDTO(),
                    lista.get(num).getEmail_FuncionáriosDTO(),
                    lista.get(num).getTelefone_FuncionáriosDTO(),
                    lista.get(num).getIDFilial_FuncionáriosDTO(),
                    lista.get(num).getCargo_FuncionáriosDTO(),
                    lista.get(num).getDataContratação_FuncionáriosDTO()
                });         
            }
        }
        
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no arquivo 'tableFuncionáriosVIEW - pesquisarValoresFuncionários': " + erro);
        }
    }
}
