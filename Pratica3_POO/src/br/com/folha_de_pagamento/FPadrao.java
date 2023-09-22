package br.com.folha_de_pagamento;

public class FPadrao extends Funcionario{

    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    @Override
    public double calcularProventos() {
        return super.calcularProventos();
    }
}