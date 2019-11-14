/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.DAO;

import br.com.projetomonitoramento.model.Etapa;
import br.com.projetomonitoramento.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class EtapaDAOImpl implements GenericDAO {

    private Connection conn;

    public EtapaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Etapa etapa = (Etapa) object;
        PreparedStatement stmt = null;
        String sql = "insert into etapa(idEmpresa, etapa, descricaoetapa) values(?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, etapa.getEmpresa().getIdEmpresa());
            stmt.setInt(2, etapa.getEtapa());
            stmt.setString(3, etapa.getDescricaoEtapa());

            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Etapa! Erro: " + ex.getMessage());
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
