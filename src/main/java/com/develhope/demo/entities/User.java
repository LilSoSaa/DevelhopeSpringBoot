package com.develhope.demo.entities;

public class User {
    private String nome;
    private int eta, id;

    public User(String nome, int eta, int id) {
        this.nome = nome;
        this.eta = eta;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
