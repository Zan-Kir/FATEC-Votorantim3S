/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.connectDAO;
import DAO.Usuario;

/**
 *
 * @author Alunos
 */
public class viewUsuario extends javax.swing.JFrame {

    String operacaoAtivaGlobal = "Nenhum";
    Usuario usuario_tela = new Usuario();

    public viewUsuario() {
        initComponents();
    }

    public viewUsuario(String operacaoAtiva) {
        initComponents();

        operacaoAtivaGlobal = operacaoAtiva;  // Setar a operacaoAtivaGlobal com o parâmetro recebido para utilização em toda a classe
        String operacao = "Incluir";                    // String para verificar qual é operação que será configurada
        if (operacaoAtiva.equals(operacao)) {
            jLabel1.setVisible(true);                      // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jButton1.setText("Incluir");
        }
        operacao = "Alterar";                               // defini a operação como Alterar os dados de um registro
        if (operacaoAtiva.equals(operacao)) {       // para alteração deverá ser setado todos os componentes como false para não visualizar
            jLabel1.setVisible(true);                       // deixando somente o label e o TextField do Id para pesquisar como true (visível).
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jButton1.setText("Pesquisar");
        }
        operacao = "Excluir";                                // defini a operação como Excluir um registro
        if (operacaoAtiva.equals(operacao)) {       // para exclusão deverá ser setado todos os componentes como false para não visualizar
            jLabel1.setVisible(true);                       // deixando somente o label e o TextField do Id para pesquisar como true (visível).
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Id");

        jLabel2.setText("Senha");

        jLabel3.setText("N° agencia");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel4.setText("N° conta corrente");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 127, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String operacao = "Incluir";
        if (operacaoAtivaGlobal.equals(operacao)) {
            Usuario dados_usuario = new Usuario();
            dados_usuario.setId(jTextField1.getText());
            dados_usuario.setSenha(jTextField2.getText());
            dados_usuario.setNumAge(Integer.parseInt((jTextField3.getText())));
            dados_usuario.setNumCc(Integer.parseInt((jTextField4.getText())));

            connectDAO objcon = new connectDAO();

            objcon.insereRegistroJFBD("USUARIOS", dados_usuario.dadosSQLValues());

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        }

        operacao = "Alteração";

        if (operacaoAtivaGlobal.equals(operacao)) {
            connectDAO objcon = new connectDAO();

            Usuario dados_usuario = new Usuario();
            dados_usuario.setId(jTextField1.getText());
            dados_usuario.setSenha(jTextField2.getText());
            dados_usuario.setNumAge(Integer.parseInt((jTextField3.getText())));
            dados_usuario.setNumCc(Integer.parseInt((jTextField4.getText())));
            objcon.alteraRegistroJFBD("USUARIOS", dados_usuario.alteraDadosSQLValues(), "ID='" + jTextField1.getText() + "'");

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        }

        operacao = "Alterar";

        if (operacaoAtivaGlobal.equals(operacao)) {
            connectDAO objcon = new connectDAO();
            usuario_tela = objcon.pesquisaUsuarioJFBD("USUARIOS", "ID = '" + jTextField1.getText() + "'");
            jTextField2.setText(usuario_tela.getSenha());
            jTextField3.setText(String.valueOf(usuario_tela.getNumAge()));
            jTextField4.setText(String.valueOf(usuario_tela.getNumCc()));

            jLabel1.setVisible(true);                       // deixando somente o label e o TextField do Id para pesquisar como true (visível).
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jTextField1.setVisible(true);
            jTextField1.setEnabled(false);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jButton1.setText("Alterar");
            operacaoAtivaGlobal = "Alteração";
        }

        operacao = "Exclusão";

        if (operacaoAtivaGlobal.equals(operacao)) {
            connectDAO objcon = new connectDAO();

            Usuario dados_usuario = new Usuario();
            dados_usuario.setId(jTextField1.getText());

            objcon.excluiRegistroJFBD("USUARIOS", dados_usuario.excluiSQLValues(), "ID= '" + dados_usuario.getId() + "'");

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");

        }

        operacao = "Excluir";

        if (operacaoAtivaGlobal.equals(operacao)) {
            connectDAO objcon = new connectDAO();
            usuario_tela = objcon.pesquisaUsuarioJFBD("USUARIOS", "ID = '" + jTextField1.getText() + "'");
            jTextField2.setText(usuario_tela.getSenha());
            jTextField3.setText(String.valueOf(usuario_tela.getNumAge()));
            jTextField4.setText(String.valueOf(usuario_tela.getNumCc()));

            jLabel1.setVisible(true);                       // deixando somente o label e o TextField do Id para pesquisar como true (visível).
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jTextField1.setVisible(true);
            jTextField1.setEnabled(false);
            jTextField2.setVisible(true);
            jTextField2.setEnabled(false);
            jTextField3.setVisible(true);
            jTextField3.setEnabled(false);
            jTextField4.setVisible(true);
            jTextField4.setEnabled(false);
            jButton1.setText("Excluir");
            operacaoAtivaGlobal = "Exclusão";
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if (jTextField3.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if (jTextField4.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

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
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new viewUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
