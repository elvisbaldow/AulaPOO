package br.com.vendaingressos;

import java.util.Date;

public class Evento {
    private String nome, descEvento;
    private Date dataEvento;
    private int qtdIngressos;
    private double precoEvento;
    private Categoria categoria;

    public void inserirEvento(String nome, String descEvento, Date dataEvento, int qtdIngressos, double precoEvento, Categoria categoria) {
        this.nome = nome;
        this.descEvento = descEvento;
        this.dataEvento = dataEvento;
        this.qtdIngressos = qtdIngressos;
        this.precoEvento = precoEvento;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public int getQtdIngressos() {
        return qtdIngressos;
    }

    public void setQtdIngressos(int qtdIngressos) {
        this.qtdIngressos = qtdIngressos;
    }

    public double getPrecoEvento() {
        return precoEvento;
    }

    public void setPrecoEvento(double precoEvento) {
        this.precoEvento = precoEvento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    Evento buscarEvento =  new Evento();

    public boolean buscarEvento(String nome) {
        if (this.nome == nome) {
            return true;
        } else {
            return false;
        }
    }

}
