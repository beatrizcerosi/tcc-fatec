/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.model;

/**
 *
 * @author PC 03
 */
public class Estabelecimento {
    
    private Integer idEstabelecimento;
    private String descricao;

    public Estabelecimento() {
    }

    public Estabelecimento(Integer idEstabelecimento, String descricao) {
        this.idEstabelecimento = idEstabelecimento;
        this.descricao = descricao;
    }

    public Integer getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Integer idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
    
}
