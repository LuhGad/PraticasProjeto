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
public class Produto {
    private String nome;
    private int id;
    private static final String BOLOTEMATICO = "bolotematico", TORTA = "torta", CUPCAKE = "cupcake", BRIGADEIRO = "brigadeiro";
    private String descricao;
    
    public Produto(){
    }

    public Produto(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public static String getBOLOTEMATICO() {
        return BOLOTEMATICO;
    }

    public static String getTORTA() {
        return TORTA;
    }

    public static String getCUPCAKE() {
        return CUPCAKE;
    }

    public static String getBRIGADEIRO() {
        return BRIGADEIRO;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", id=" + id + ", descricao=" + descricao + '}';
    }

    

    
    
}
