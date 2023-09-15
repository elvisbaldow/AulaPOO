package rendimento;

import java.text.NumberFormat; // aparece o R$ nos valores de dinheiro;

public class investimento {
    private double initial_invest;
    private double tax;
    private int numMonth;

    public investimento(double initial_invest, double tax, int numMonth) {
        this.initial_invest = initial_invest;
        this.tax = tax;
        this.numMonth = numMonth;
    }
    /*usando metodo get e set*/


    public double getInitial_invest() {return initial_invest; }
    public double getTax() {return tax;}
    public int getNumMonth(){return numMonth;}
    public void setNumMonth(int numMonth){ this.numMonth = numMonth;}

    public void totalIncome(){
        double rendimentoMes;
        rendimentoMes=getInitial_invest(); // rendimentoMes começa com valor inicial -> inicializando o valor do investimento para continuar no próximo mês.
        System.out.println("Valor Inicial: " + NumberFormat.getCurrencyInstance().format(getInitial_invest()));
        System.out.println("Taxa de Juros: " + NumberFormat.getPercentInstance().format(getTax()/100));
        for(int i=0; i<getNumMonth(); i++)
        {
            rendimentoMes=rendimentoMes*getTax()/100+rendimentoMes;
            System.out.println("Mês " + (i+1) + ":" + NumberFormat.getCurrencyInstance().format(rendimentoMes));
        }
    }

}
