package br.com.carnaval;

public class Vip extends Ingresso{
    double valorAdcional;

    public Vip(double valorIngresso, double valorAdcional) {
        super(valorIngresso);
        this.valorAdcional = valorAdcional;
    }

    public double getValorAdcional() {
        return valorAdcional;
    }

    public void setValorAdcional(double valorAdcional) {
        this.valorAdcional = valorAdcional;
    }

    public void imprimeIngressoVip(){
        System.out.println("Ingresso Vip: " + (getValorIngresso() + getValorAdcional()));
    }

}
