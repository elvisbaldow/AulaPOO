package br.com.vendaingressos;

public class PedidoItem extends Evento{
    private String nomeEvento;
    private int qtdIngressos;
    private double precoTotal;

    public PedidoItem() {
        this.nomeEvento = nomeEvento;
        this.qtdIngressos = qtdIngressos;
        this.precoTotal = precoTotal;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    @Override
    public int getQtdIngressos() {
        return qtdIngressos;
    }

    @Override
    public void setQtdIngressos(int qtdIngressos) {
        this.qtdIngressos = qtdIngressos;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public boolean atualizaEstoqueIngressos(int qtdIngressos){
        if (qtdIngressos > 0) {
            return true;
        }else
            return false;
    }
}
