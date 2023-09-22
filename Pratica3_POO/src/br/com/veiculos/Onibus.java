package br.com.veiculos;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public String toString(){
        return "A placa do veículo: " + getPlaca() + "\n Ano do Veículo: " + getAno() + "\nO número de assentos: " + getAssentos();
    }
}
