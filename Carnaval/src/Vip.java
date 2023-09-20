public class Vip extends Ingresso {
    private double addValorVip;

    public Vip(double valor, double addValorVip) {
        super(valor);
        this.addValorVip = addValorVip;
    }

    public double getAddValorVip() {
        return addValorVip;
    }

    public void setAddValorVip(double addValorVip) {
        this.addValorVip = addValorVip;
    }

    public String mostrarIngresso(){
        return "O valor do seu Ingresso Vip é: " + (getValor() + getAddValorVip());
    }
}