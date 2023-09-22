package br.com.folha_de_pagamento;

public class Programa {
    public static void main(String[] args) {

        FPadrao fp = new FPadrao(1205194614, "Elvis Baldow", 1750.00);
        FComissionado fc = new FComissionado(1205194614, "Elvis Ribeiro", 1750, 6,2536.80);
        FProdutividade fpd = new FProdutividade(1205194614, "Elvis", 1700, 800, 3);

        System.out.println(fp.toString());
        System.out.println(fc.toString());
        System.out.println(fpd.toString());
    }
}
