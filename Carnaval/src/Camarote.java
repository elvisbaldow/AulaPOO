import java.util.Random;

public class Camarote extends Ingresso {
    private String localiza;
    private double addValorCamarote;

    //private Random gerador = new Random();


    public Camarote(double valor, String localiza, double addValorCamarote) {
        super(valor);
        this.localiza = localiza;
        this.addValorCamarote = addValorCamarote;
    }

    public String getLocaliza() {
        return localiza;
    }

    public double getAddValorCamarote() {
        return addValorCamarote;
    }

    public void setLocaliza(String localiza) {
        this.localiza = localiza;
    }

    public void setAddValorCamarote(double addValorCamarote) {
        this.addValorCamarote = addValorCamarote;
    }

    public String mostrarIngresso(){
        return "O Valor do seu ingresso no Camarote é: " + (getValor() + getAddValorCamarote()) + "\nSe dirita ao Camarote: " + getLocaliza();
    }
}