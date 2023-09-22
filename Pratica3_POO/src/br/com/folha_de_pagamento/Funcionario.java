package br.com.folha_de_pagamento;

// classes abstratas: Não pode ser criado objetos da classe abstradas.
// é uma boa prática a classe mãe ser abstradas e as filhas não.

public abstract class Funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // void é qdo não retorna nada.
    public double calcularProventos(){
        return getSalario();
    };

    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Matrícula: " + getMatricula() + "\n" +
                "Salário: " + getSalario();
    }

}
