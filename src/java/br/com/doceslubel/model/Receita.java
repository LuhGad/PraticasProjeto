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
public class Receita {
    private String nome, ingredientes, preparo, tempo, rendimento;
    private int id;
    
    public Receita(){
    }

    public Receita(String nome, String ingredientes, String preparo, String tempo, String rendimento, int id) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preparo = preparo;
        this.tempo = tempo;
        this.rendimento = rendimento;
        this.id = id;
    }

    public String getIngrediente() {
        return ingredientes;
    }

    public void setIngrediente(String ingrediente) {
        this.ingredientes = ingrediente;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }
    
    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getRendimento() {
        return rendimento;
    }

    public void setRendimento(String rendimento) {
        this.rendimento = rendimento;
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

    @Override
    public String toString() {
        return "Receita{" + "nome=" + nome + ", ingrediente=" + ingredientes + ", preparo=" + 
                preparo + ", tempo=" + tempo + ", rendimento=" + rendimento + ", id=" + id + '}';
    }


}
