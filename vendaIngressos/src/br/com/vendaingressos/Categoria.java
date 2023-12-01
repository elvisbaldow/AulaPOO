package br.com.vendaingressos;

import java.util.Date;

public class Categoria extends Evento{
    private String descCategoria;

    public Categoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    @Override
    public Categoria getCategoria() {
        return super.getCategoria();
    }
}
