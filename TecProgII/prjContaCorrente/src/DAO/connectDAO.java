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
            System.out.println("SQL Gerado: " + sql);
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

    public Cliente pesquisaClienteJFBD(String tabela, String pesquisaId) {
        Cliente clientesReturn = new Cliente();
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

    public Agencia pesquisaAgenciaJFBD(String tabela, String pesquisaId) {
        Agencia agenciasReturn = new Agencia();
        String tabelaSGBD = "AGENCIAS";
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
                        agenciasReturn.setNumAge(dados.getInt(1));
                        agenciasReturn.setNomeAge(dados.getString(2));
                        agenciasReturn.setEndeAge(dados.getString(3));
                        agenciasReturn.setNumeAge(dados.getString(4));
                        agenciasReturn.setComplAge(dados.getString(5));
                        agenciasReturn.setBairAge(dados.getString(6));
                        agenciasReturn.setCidaAge(dados.getString(7));
                        agenciasReturn.setUfAge(dados.getString(8));
                        agenciasReturn.setCepAge(dados.getString(9));
                        agenciasReturn.setFoneAge(dados.getString(10));
                    }
                    con.close();

                    return agenciasReturn;
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
        return agenciasReturn;

    }

    public ContaCorrente pesquisaContaCorrenteJFBD(String tabela, String pesquisaId) {
        ContaCorrente ccReturn = new ContaCorrente();
        String tabelaSGBD = "CONTACORRENTE";
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
                        ccReturn.setNumAge(dados.getInt(1));
                        ccReturn.setNumCc(dados.getInt(2));
                        ccReturn.setIdCli(dados.getInt(3));
                        ccReturn.setSaldo(dados.getInt(4));
                    }
                    con.close();

                    return ccReturn;
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
        return ccReturn;

    }

    public Historico pesquisaHistoricoJFBD(String tabela, String pesquisaId) {
        Historico historicoReturn = new Historico();
        String tabelaSGBD = "HISTORICOS";
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
                        historicoReturn.setIdHis(dados.getInt(1));
                        historicoReturn.setDesHis(dados.getString(2));
                    }
                    con.close();

                    return historicoReturn;
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
        return historicoReturn;

    }

    public Movimentacao pesquisaMovimentacaoJFBD(String tabela, String pesquisaId) {
        Movimentacao movimentacaoReturn = new Movimentacao();
        String tabelaSGBD = "MOVIMENTACAO";
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
                        movimentacaoReturn.setNumAge(dados.getInt(1));
                        movimentacaoReturn.setNumCc(dados.getInt(2));
                        movimentacaoReturn.setDataMov(dados.getString(3));
                        movimentacaoReturn.setNumDocto(dados.getString(4));
                        movimentacaoReturn.setDebitoCredito(dados.getString(5));
                        movimentacaoReturn.setIdHis(dados.getInt(6));
                        movimentacaoReturn.setComplHis(dados.getString(7));
                        movimentacaoReturn.setValor(dados.getDouble(8));
                        movimentacaoReturn.setSaldo(dados.getDouble(9));
                    }
                    con.close();

                    return movimentacaoReturn;
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
        return movimentacaoReturn;

    }

    public Usuario pesquisaUsuarioJFBD(String tabela, String pesquisaId) {
        Usuario usuariosReturn = new Usuario();
        String tabelaSGBD = "USUARIOS";
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
                        usuariosReturn.setId(dados.getString(1));
                        usuariosReturn.setSenha(dados.getString(2));
                        usuariosReturn.setNumAge(dados.getInt(3));
                        usuariosReturn.setNumCc(dados.getInt(4));
                    }
                    con.close();

                    return usuariosReturn;
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
        return usuariosReturn;

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
