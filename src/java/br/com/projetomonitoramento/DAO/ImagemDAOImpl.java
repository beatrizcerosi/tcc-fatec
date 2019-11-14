/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.DAO;

import br.com.projetomonitoramento.model.Imagem;
import br.com.projetomonitoramento.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author PC 03
 */
public class ImagemDAOImpl implements GenericDAO{

    private Connection conn;
        
        public ImagemDAOImpl() throws Exception{
            try{
                this.conn = ConnectionFactory.getConnection();
                System.out.println("Conectado com Sucesso!");               
            }catch(Exception ex) {
                throw new Exception(ex.getMessage());
            }
        }

    @Override
    public Boolean cadastrar(Object object) {
        Imagem imagem = (Imagem) object;
        PreparedStatement stmt = null;
        String sql = "insert into imagem(foto, principal, codlink, tablink) values(?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setBinaryStream(1, imagem.getImagem(), imagem.getFile());
            stmt.setBoolean(2, imagem.getPrincipal());                 
            stmt.setInt(3, imagem.getCodlink());
            stmt.setString(4, imagem.getTablink());

            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Imagem da Empresa! Erro: " + ex.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar os parâmetros de conexão " + e.getMessage());
            }
        }
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
