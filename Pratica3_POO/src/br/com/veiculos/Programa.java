package br.com.veiculos;

public class Programa {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("OWH4701", 2014);
        Caminhao c1 = new Caminhao("OPR5699", 2000, 8);
        Onibus o1 = new Onibus("XXP3366", 1999, 44);

        System.out.println(v1.toString());
        System.out.println(c1.toString());
        System.out.println(o1.toString());

    }
}
