package com.criandoEndpoint.WatchDogs.model;

public class Formacao {
    private int id;
    private String nome;
    private String instituicao;

    public Formacao(int id, String nome, String instituicao) {
        this.id = id;
        this.nome = nome;
        this.instituicao = instituicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "Formacao [ID=" + id + ", NOME=" + nome + ", INSTITUICAO=" + instituicao + "]";
    }
}

