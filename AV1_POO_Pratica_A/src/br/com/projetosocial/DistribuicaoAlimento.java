package br.com.projetosocial;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public DistribuicaoAlimento(Boolean validaProjeto, String imprimeProjeto, String descAlimento, float qtde) {
        super(validaProjeto, imprimeProjeto);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public Boolean validaProjeto(){
        if(getDataFim() == "")
            return true;
        else
            return false;

    }

    public String imprimeProjeto() {
        System.out.println("\nNome do Projeto: " + getNomeProjeto());
        System.out.println("\nDescrição: " + getDescricao());
        System.out.println("\nData Inicio: " + getDataInicio());
        System.out.println("\nData Final: " + getDataFim());
        System.out.println("\nAlimento: " + getDescAlimento());
        System.out.println("\nQuantidade: " + getQtde());

        return null;
    }
}
