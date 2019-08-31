/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ruy.padrao.singleton;

/**
 *
 * @author 161052333
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private float altura;
    private static Pessoa instancia = null;

    public static Pessoa getInstancia() {
        if(instancia == null){
            instancia = new Pessoa();
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String toString(){
        return " nome: " + nome +
                " cpf: "+ cpf + 
                " altura: " + altura;
        
    }
}
