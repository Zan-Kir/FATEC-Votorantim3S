package DAO;

import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Cliente;
// import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prof. Corredato - Controle de conexão com o banco de dados
 */
public class connectionDAO {

    Connection con;

    public Connection connectDB() {
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");

        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=VIDEOLOCADORA;encrypt=true;trustServerCertificate=true;";
        String usuario = "corredato";
        String senha = "Abc@123";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
        }
        return con;
        // con.close();
    }

    public void insereRegistroJFBD(String banco, Cliente novoCliente) {
        String banco2;
        banco2 = "CLIENTES";

        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=VIDEOLOCADORA;encrypt=true;trustServerCertificate=true;";
        String usuario = "corredato";
        String senha = "Abc@123";

        if (banco.equals(banco2)) {
            try {
                con = DriverManager.getConnection(caminho, usuario, senha);
                JOptionPane.showMessageDialog(null, "Conectado com sucesso");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            }
            Statement stmt;

            try {
                stmt = con.createStatement();
                
                String sql = "INSERT INTO dbo."+banco+" VALUES ("+novoCliente.getIdCli()+
                        "','"+novoCliente.getNomeCli()+
                        "','"+novoCliente.getEndCli()+
                        "','"+novoCliente.getEndNumCli()+
                        "','"+novoCliente.getEndCompCli()+
                        "','"+novoCliente.getBairroCli()+
                        "','"+novoCliente.getCidadeCli()+
                        "','"+novoCliente.getUfCli()+
                        "','"+novoCliente.getCepCli()+
                        "','"+novoCliente.getTelCli()+
                        "','"+novoCliente.getCpfCli()+
                        "','"+novoCliente.getDataNascCli()+
                        "','"+novoCliente.getCnpjCli()+
                        ")";
                JOptionPane.showMessageDialog(null, "String de Insert: "+sql);
                try {
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(connectionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
