package br.com.publicacao;

public class AchadoPerdido implements Publicacao{
    String titulo, descricao, foto, tipo, local_achado, data_hora, status;

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String local_achado, String data_hora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String buscarTitulo(String titulo) {
        System.out.println("Título do Livro: " + getTitulo());
        System.out.println("Descrição do Livro: " + getDescricao());
        System.out.println("Local Achado: " + getLocal_achado());

        return titulo;
    }

    @Override
    public void visualizarDetalhes() {
        System.out.println("Título do Livro" + getTitulo());
        System.out.println("\nFoto " + getFoto());
        System.out.println("\nLocal Achado: " + getLocal_achado());
        System.out.println("\nTipo do Livro: " + getTipo());
        System.out.println("\nStatus atual: " + getStatus());

    }

    //String titulo, String foto, String local_achado, String tipo, String status
}
