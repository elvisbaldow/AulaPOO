package br.com.veiculos;

public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "A placa do veículo: " + getPlaca() + "\n Ano do Veículo: " + getAno();
    }
}


