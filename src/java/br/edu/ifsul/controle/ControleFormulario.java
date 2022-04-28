/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author 20201PF.CC0033
 */
@Named(value = "controleFormulario")
@SessionScoped
public class ControleFormulario implements Serializable {
   
    private String nome;
    private String funcao;
    private String ativo;
    
    public ControleFormulario() {
        
    }

    public String formulario() {
        return "formulario?faces-redirect=true";
    }
    
    public String processar() {
        return "dados?faces-redirect=true";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}
