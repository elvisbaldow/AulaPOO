public class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public String mostrarIngresso(){
        return "Valor do Ingresso Normal é: " + getValor();
    }
}