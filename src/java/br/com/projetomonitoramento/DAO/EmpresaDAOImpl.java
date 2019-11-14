/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.DAO;


import br.com.projetomonitoramento.model.Empresa;
import br.com.projetomonitoramento.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author PC 03
 */
public class EmpresaDAOImpl implements GenericDAO {
    
    private Connection conn;

    public EmpresaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }   

    @Override
    public Boolean cadastrar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Integer cadastrarEmpresa(Object object) {
        Empresa empresa = (Empresa) object;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idEmpresa = null;
        String sql = "insert into Empresa(nomerazao, nomefantazia, cnpj, inscricaoestadual, endereco, cidade, estado, telefone, tipoempresa"
                + ", emailEmpresa, senhaEmpresa) values(?,?,?,?,?,?,?,?,?,?,?) returning idEmpresa";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, empresa.getNomeRazao());
            stmt.setString(2, empresa.getNomeFantasia());
            stmt.setString(3, empresa.getCnpj());
            stmt.setString(4, empresa.getInscricaoEstadual());
            stmt.setString(5, empresa.getEndereço());
            stmt.setString(6, empresa.getCidade());
            stmt.setString(7, empresa.getEstado());
            stmt.setString(8, empresa.getTelefone());
            stmt.setString(9, empresa.getTipoEmpresa());
            stmt.setString(10, empresa.getEmailEmpresa());
            stmt.setString(11, empresa.getSenhaEmpresa());
            

            rs = stmt.executeQuery();
            if (rs.next()) {
                idEmpresa = rs.getInt("idEmpresa");
            }                    
               
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Empresa! Erro: " + ex.getMessage());
            ex.printStackTrace();            
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar os parâmetros de conexão " + e.getMessage());
                e.printStackTrace();
            }
        }
        return idEmpresa;
    }
    
    public Empresa logarEmpresa(String email, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empresa empresa = null;

        String sql = "SELECT * FROM Empresa WHERE emailEmpresa = ? AND senhaEmpresa = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            if (rs.next()) {
                empresa = new Empresa();
                empresa.setIdEmpresa(rs.getInt("idempresa"));
                empresa.setNomeRazao(rs.getString("nomerazao"));
                empresa.setNomeFantasia(rs.getString("nomefantazia"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setInscricaoEstadual(rs.getString("inscricaoestadual"));
                empresa.setEndereço(rs.getString("endereco"));
                empresa.setCidade(rs.getString("cidade"));
                empresa.setEstado(rs.getString("estado"));
                empresa.setTelefone(rs.getString("telefone"));
                empresa.setTipoEmpresa(rs.getString("tipoempresa"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar EmpresaDAO!\nErro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problema ao fechar os parâmetros de conexão!\nErro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return empresa;
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    @Override
    public Boolean Excluir(int idObjetct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
