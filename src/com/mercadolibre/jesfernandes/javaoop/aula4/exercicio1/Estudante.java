package com.mercadolibre.jesfernandes.javaoop.aula4.exercicio1;

public class Estudante {

    String nome;
    Integer idade;
    Integer numeroMatricula;
    String serie;

    public Estudante(String nome, Integer idade, Integer numeroMatricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.numeroMatricula = numeroMatricula;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
