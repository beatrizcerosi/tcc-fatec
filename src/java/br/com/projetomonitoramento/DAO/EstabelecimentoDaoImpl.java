/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.DAO;

import br.com.projetomonitoramento.model.Estabelecimento;
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
public class EstabelecimentoDaoImpl implements GenericDAO{
    
    private Connection conn;

    public EstabelecimentoDaoImpl() throws Exception {
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

    @Override
    public List<Object> listar() {
        List<Object> estabelecimentos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "Select * from Estabelecimento";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Estabelecimento estabelecimento = new Estabelecimento();
                estabelecimento.setIdEstabelecimento(rs.getInt("idEstabelecimento"));
                estabelecimento.setDescricao(rs.getString("descricao"));                
                estabelecimentos.add(estabelecimento);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Estabelecimento. Erro: " + ex.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão: " + e.getMessage());
            }
        }
        return estabelecimentos;
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
