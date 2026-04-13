package com.appAluno.model;

public class Aluno {
    
    private String nome;
    private int matricula;
    private String anoIngresso;

    public Aluno(String nome, int matricula, String anoIngresso) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
