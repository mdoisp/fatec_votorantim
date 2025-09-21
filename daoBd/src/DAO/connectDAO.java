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
// import javax.swing.table.AbstractTableModel;
 
/**
*
* @author Prof. Corredato - Controle de conexão com o banco de dados
*/
public class connectDAO {
    Connection con;
    public Connection connectDB(){
       // JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return con;
        // con.close();
    }
    
    public void insereRegistroJFBD(String tabela, String strDados){
      /*
        
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }     */
      con = connectDB();
        Statement stmt;
    try {
    stmt = con.createStatement();
    // Cria a string com a sentença SQL para inserir registro
   
   String sql = "INSERT INTO dbo."+tabela+" "+"VALUES(" + strDados+")";
   JOptionPane.showMessageDialog(null, "String de Insert"+sql);
 
    try {
        // Executar a sentença de insert
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
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
    
    public agencias pesquisaAgenciaJFBD(String tabela, String pesquisaId) {
        agencias agenciasReturn = new agencias();
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
    
    public contacorrente pesquisaContaCorrenteJFBD(String tabela, String pesquisaId) {
        contacorrente ccReturn = new contacorrente();
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
                        ccReturn.setNumAge(dados.getString(1));
                        ccReturn.setNumCc(dados.getString(2));
                        ccReturn.setIdCli(dados.getString(3));
                        ccReturn.setSaldo(dados.getString(4));
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
    
    public historicos pesquisaHistoricoJFBD(String tabela, String pesquisaId) {
        historicos historicoReturn = new historicos();
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
                        historicoReturn.setIdHis(dados.getString(1));
                        historicoReturn.setDescricao(dados.getString(2));
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
     
    public movimentacao pesquisaMovimentacaoJFBD(String tabela, String pesquisaId) {
        movimentacao movimentacaoReturn = new movimentacao();
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
                        movimentacaoReturn.setNumAge(dados.getString(1));
                        movimentacaoReturn.setNumCc(dados.getString(2));
                        movimentacaoReturn.setDataMov(dados.getString(3));
                        movimentacaoReturn.setNumDocto(dados.getString(4));
                        movimentacaoReturn.setDebitoCredito(dados.getString(5));
                        movimentacaoReturn.setIdHis(dados.getString(6));
                        movimentacaoReturn.setComplHis(dados.getString(7));
                        movimentacaoReturn.setValor(dados.getString(8));
                        movimentacaoReturn.setSaldo(dados.getString(9));
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
     
    public usuarios pesquisaUsuariosJFBD(String tabela, String pesquisaId) {
        usuarios usuariosReturn = new usuarios();
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
                        usuariosReturn.setNumAge(dados.getString(3));
                        usuariosReturn.setNumCc(dados.getString(4));
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
    
    public void alterarRegistroJFBD(String tabela, String setDados, String pesquisaId) {
        
        con = connectDB();
        
            Statement stmt;
            try {
                stmt = con.createStatement();
                
                String sql = "UPDATE dbo." +tabela + " SET "+ setDados + "WHERE ("+pesquisaId+");";
                
                try {
        // Executar a sentença de insert
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
    public void excluiRegistroJFBD(String tabela, String setDados, String pesquisaId) {
        con = connectDB();
            Statement stmt;
            try {
                stmt = con.createStatement();
                String sql = "DELETE FROM " +tabela +  " WHERE " +pesquisaId;
                try {
        // Executar a sentença de insert
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Exclusão executada com sucesso!");
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
            
   