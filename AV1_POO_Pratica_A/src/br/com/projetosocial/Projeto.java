package br.com.projetosocial;

public abstract class  Projeto {
    private String nomeProjeto;
    private String descricao;
    private String endereco;
    private String dataInicio;
    private String dataFim;
    public Boolean validaProjeto;
    public String imprimeProjeto;


    public Projeto(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.dataInicio = datainicio;
        this.dataFim = datafim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Projeto(Boolean validaProjeto, String imprimeProjeto) {
        this.validaProjeto = validaProjeto;
        this.imprimeProjeto = imprimeProjeto;
    }

    public Boolean getValidaProjeto() {
        return validaProjeto;
    }

    public void setValidaProjeto(Boolean validaProjeto) {
        this.validaProjeto = validaProjeto;
    }

    public String getImprimeProjeto() {
        return imprimeProjeto;
    }

    public void setImprimeProjeto(String imprimeProjeto) {
        this.imprimeProjeto = imprimeProjeto;
    }
}
