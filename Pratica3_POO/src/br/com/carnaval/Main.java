package br.com.carnaval;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Normal n1 = new Normal(100);
        Vip v1 = new Vip(100,50);
        Camarote c1 = new Camarote(100,"Ala B", 100);

        n1.imprimeIngresso();
        v1.imprimeIngressoVip();
        c1.imprimeIngressoCamarote();
    }


}
