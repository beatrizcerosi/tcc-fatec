/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetomonitoramento.model;

import java.io.InputStream;

/**
 *
 * @author PC 03
 */
public class Imagem {
    
    private Integer idImagem;
    private Integer codlink;
    private String tablink;
    private InputStream imagem;
    private Integer file;
    private Boolean principal;

    public Integer getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(Integer idImagem) {
        this.idImagem = idImagem;
    }

    public Integer getCodlink() {
        return codlink;
    }

    public void setCodlink(Integer codlink) {
        this.codlink = codlink;
    }

    public String getTablink() {
        return tablink;
    }

    public void setTablink(String tablink) {
        this.tablink = tablink;
    }

    public InputStream getImagem() {
        return imagem;
    }

    public void setImagem(InputStream imagem) {
        this.imagem = imagem;
    }

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }      
    
}
