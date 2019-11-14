/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.model;

/**
 *
 * @author Carlos
 */
public class Etapa {
    
    private Integer Etapa;
    private Empresa Empresa;
    private String descricaoEtapa;

    public Etapa() {
    }

    public Etapa(Integer Etapa, Empresa Empresa, String descricaoEtapa) {
        this.Etapa = Etapa;
        this.Empresa = Empresa;
        this.descricaoEtapa = descricaoEtapa;
    }

    public Integer getEtapa() {
        return Etapa;
    }

    public void setEtapa(Integer Etapa) {
        this.Etapa = Etapa;
    }

    public Empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(Empresa Empresa) {
        this.Empresa = Empresa;
    }

    public String getDescricaoEtapa() {
        return descricaoEtapa;
    }

    public void setDescricaoEtapa(String descricaoEtapa) {
        this.descricaoEtapa = descricaoEtapa;
    }

    
       
    
}
