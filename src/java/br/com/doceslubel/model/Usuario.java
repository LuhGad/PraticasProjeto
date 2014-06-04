/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.doceslubel.model;

/**
 *
 * @author Bell
 */
public class Usuario {
    private String nome, login, senha;
    private int id;
    private static final String USUARIOCOMUM = "usuarioComum", ADMINISTRADOR = "administrador";
    private String tipo;
    
     public Usuario(){    
     }

    public Usuario(String nome,String tipo, String login, String senha, int id ) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.id = id;
        this.tipo = tipo;
    }

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getUSUARIOCOMUM() {
        return USUARIOCOMUM;
    }

    public static String getADMINISTRADOR() {
        return ADMINISTRADOR;
    }
   
    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", login=" + login + ", senha=" + senha + ", id=" + id + ", tipo=" + tipo + '}';
    }

    
    
    
    
  
    
}
