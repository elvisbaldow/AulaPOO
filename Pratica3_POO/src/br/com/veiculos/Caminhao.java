package br.com.veiculos;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public String toString(){
      return "A placa do veículo: " + getPlaca() + "\n Ano do Veículo: " + getAno() + "\nO número de eixo é: " + getEixos();
    }
}
