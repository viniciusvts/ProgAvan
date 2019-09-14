package com.br.ruy.padrao.aula4.singleton;

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
