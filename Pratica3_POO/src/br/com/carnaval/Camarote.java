package br.com.carnaval;

public class Camarote extends Ingresso{
    String Local;
    double valorAdcionalCamarote;

    public Camarote(double valorIngresso, String local, double valorAdcionalCamarote) {
        super(valorIngresso);
        Local = local;
        this.valorAdcionalCamarote = valorAdcionalCamarote;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public double getValorAdcionalCamarote() {
        return valorAdcionalCamarote;
    }

    public void setValorAdcionalCamarote(double valorAdcionalCamarote) {
        this.valorAdcionalCamarote = valorAdcionalCamarote;
    }

    public void imprimeIngressoCamarote(){
        System.out.println("Ingresso Camarote: " + (getValorIngresso() + getValorAdcionalCamarote()) + " | Local: " + getLocal());    }
}