package br.com.vendaingressos;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private int numeroPedido, statusPedido;
    private Date dataHoraPedido;
    private double precoTotal;

    public void inserirPedido(int numeroPedido, int statusPedido, Date dataHoraPedido, double precoTotal) {
        this.numeroPedido = numeroPedido;
        this.statusPedido = statusPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void alterarStatus(int statusPedido){
        if (statusPedido == 1) {
            statusPedido = 2;
        } else if (statusPedido == 2) {
            statusPedido = 3;
        } else if (statusPedido == 3) {
            statusPedido = 4;
        } else if (statusPedido == 4) {
            statusPedido = 5;
        }
    }

    Pedido consultarPedido = new Pedido();

    public boolean consultarPedido(int numeroPedido) {
        if (numeroPedido == this.numeroPedido) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirItensPedido() {
        PedidoItem pedidoItem = new PedidoItem();
        pedidoItem arraylist = new ArrayList<PedidoItem>();

        boolean add = ((ArrayList<?>) arraylist).add(pedidoItem);
    }

    public void excluirItensPedido() {
        PedidoItem pedidoItem = new PedidoItem();
        pedidoItem arraylist = new ArrayList<PedidoItem>();

        if (pedidoItem == null) {
            System.out.println("Não há itens no pedido");
        } else {
            ((ArrayList<?>) arraylist).remove(pedidoItem);
        }
    }

    public void calculaTotal() {
        PedidoItem pedidoItem = new PedidoItem();
        pedidoItem arraylist = new ArrayList<PedidoItem>();
        double total = 0;

        for (int i = 0; i < arraylist.size(); i++) {
            total += arraylist.get(i).getPrecoTotal();
        }

        System.out.println("Total: " + total);
    }
}
