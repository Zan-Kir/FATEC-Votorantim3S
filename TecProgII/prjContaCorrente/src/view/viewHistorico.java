/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.connectDAO;
import DAO.Historico;

/**
 *
 * @author Alunos
 */
public class viewHistorico extends javax.swing.JFrame {

    String operacaoAtivaGlobal = "Nenhum";
    Historico historico_tela = new Historico();

    public viewHistorico() {
        initComponents();
    }

    public viewHistorico(String operacaoAtiva) {
        initComponents();

        operacaoAtivaGlobal = operacaoAtiva;  // Setar a operacaoAtivaGlobal com o parâmetro recebido para utilização em toda a classe
        String operacao = "Incluir";                    // String para verificar qual é operação que será configurada
        if (operacaoAtiva.equals(operacao)) {
            jLabel1.setVisible(true);                      // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jLabel2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jButton1.setText("Incluir");
        }
        operacao = "Alterar";                               // defini a operação como Alterar os dados de um registro
        if (operacaoAtiva.equals(operacao)) {       // para alteração deverá ser setado todos os componentes como false para não visualizar
            jLabel1.setVisible(true);                       // deixando somente o label e o TextField do Id para pesquisar como true (visível).
            jLabel2.setVisible(false);
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jButton1.setText("Pesquisar");
        }
        operacao = "Excluir";                                // defini a operação como Excluir um registro
        if (operacaoAtiva.equals(operacao)) {       // para exclusão deverá ser setado todos os componentes como false para não visualizar
            jLabel1.setVisible(true);                       // deixando somente o label e o TextField do Id para pesquisar como true (visível).
            jLabel2.setVisible(false);
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jButton1.setText("Pesquisar");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Id histórico");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("Descrição");

        jButton1.setText("Confirma cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String operacao = "Incluir";
        if (operacaoAtivaGlobal.equals(operacao)) {
            Historico dados_Historico = new Historico();
            dados_Historico.setIdHis(Integer.parseInt((jTextField1.getText())));
            dados_Historico.setDesHis(jTextField2.getText());

            connectDAO objcon = new connectDAO();

            objcon.insereRegistroJFBD("HISTORICOS", dados_Historico.dadosSQLValues());

            jTextField1.setText("");
            jTextField2.setText("");

        }

        operacao = "Alteração";

        if (operacaoAtivaGlobal.equals(operacao)) {
            connectDAO objcon = new connectDAO();

            Historico dados_historico = new Historico();
            dados_historico.setIdHis(Integer.parseInt((jTextField1.getText())));
            dados_historico.setDesHis(jTextField2.getText());
            objcon.alteraRegistroJFBD("HISTORICOS", dados_historico.alteraDadosSQLValues(), "ID_HIS=" + jTextField1.getText());

            jTextField1.setText("");
            jTextField2.setText("");

        }

        operacao = "Alterar";

        if (operacaoAtivaGlobal.equals(operacao)) {
            connectDAO objcon = new connectDAO();
            historico_tela = objcon.pesquisaHistoricoJFBD("HISTORICOS", "ID_HIS = '" + jTextField1.getText() + "'");
            jTextField2.setText(historico_tela.getDesHis());
            jLabel1.setVisible(true);                       // deixando somente o label e o TextField do Id para pesquisar como true (visível).
            jLabel2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField1.setEnabled(false);
            jTextField2.setVisible(true);
            jButton1.setText("Alterar");
            operacaoAtivaGlobal = "Alteração";
        }

        operacao = "Exclusão";

        if (operacaoAtivaGlobal.equals(operacao)) {
            connectDAO objcon = new connectDAO();

            Historico dados_historico = new Historico();
            dados_historico.setIdHis(Integer.parseInt(jTextField1.getText()));

            objcon.excluiRegistroJFBD("HISTORICOS", dados_historico.excluiSQLValues(), "ID_HIS=" + dados_historico.getIdHis());

            jTextField1.setText("");
            jTextField2.setText("");

        }

        operacao = "Excluir";

        if (operacaoAtivaGlobal.equals(operacao)) {
            connectDAO objcon = new connectDAO();
            historico_tela = objcon.pesquisaHistoricoJFBD("HISTORICOS", "ID_HIS = '" + jTextField1.getText() + "'");
            jTextField2.setText(historico_tela.getDesHis());
            jLabel1.setVisible(true);                       // deixando somente o label e o TextField do Id para pesquisar como true (visível).
            jLabel2.setVisible(true);
            jTextField1.setVisible(true);
            jTextField1.setEnabled(false);
            jTextField2.setVisible(true);
            jTextField2.setEnabled(false);
            jButton1.setText("Excluir");
            operacaoAtivaGlobal = "Exclusão";
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (jTextField1.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(viewHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
