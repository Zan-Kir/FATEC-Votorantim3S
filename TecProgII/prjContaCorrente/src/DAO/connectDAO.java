package DAO;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Prof. Corredato - Controle de conexão com o banco de dados
 */
public class connectDAO {

    Connection con;

    public Connection connectDB() {
        //JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");

        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;";
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
        }
        return con;
    }

    public void insereRegistroJFBD(String tabela, String strDados) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql = "INSERT INTO dbo." + tabela + " " + " VALUES (" + strDados + ")";
            JOptionPane.showMessageDialog(null, "String de insert> " + sql);

            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Insert executado com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem: " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado: " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código: " + erro.getErrorCode());
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public clientes pesquisaClienteJFBD(String tabela, String pesquisaId) {
        clientes clientesReturn = new clientes();
        String tabelaSGBD = "CLIENTES";
        if (tabela.equals(tabelaSGBD)) {

            con = connectDB();
            Statement stmt;
            try {
                stmt = con.createStatement();
                String sql = "SELECT * FROM " + tabela
                        + " Where " + pesquisaId;

                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false) {
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para essa consulta");
                    } else {
                        clientesReturn.setIdCli(dados.getInt(1));
                        clientesReturn.setNomeCli(dados.getString(2));
                        clientesReturn.setEndeCli(dados.getString(3));
                        clientesReturn.setNumeCli(dados.getString(4));
                        clientesReturn.setComplCli(dados.getString(5));
                        clientesReturn.setBairCli(dados.getString(6));
                        clientesReturn.setCidaCli(dados.getString(7));
                        clientesReturn.setUfCli(dados.getString(8));
                        clientesReturn.setCepCli(dados.getString(9));
                        clientesReturn.setFoneCli(dados.getString(10));
                        clientesReturn.setCpfCli(dados.getString(11));
                        clientesReturn.setDataNasc(dados.getString(12));
                        clientesReturn.setCnpjCli(dados.getString(13));
                    }
                    con.close();

                    return clientesReturn;
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return clientesReturn;

    }

    public void alteraRegistroJFBD(String tabela, String strDados, String pesquisaId) {
        con = connectDB();
        {
            Statement stmt;
            try {
                stmt = con.createStatement();

                String sql = "UPDATE dbo." + tabela + " SET " + strDados + " WHERE (" + pesquisaId + ");";

                try {
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Alteração executada com sucesso!");
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem: " + erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado: " + erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código: " + erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void excluiRegistroJFBD(String tabela, String strDados, String pesquisaId) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();

            String sql = "DELETE FROM dbo." + tabela + " WHERE " + pesquisaId + ";";

            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem: " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado: " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código: " + erro.getErrorCode());
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
