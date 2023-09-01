package armazem;
        // atributos: id / produto / estoque / preco
        // metodos: cadastrar / baixa estoque / acrescimo estoque / total estoque / consultar estoque
public class Estoque {
    private int id;
    private String produto;
    private int estoque;
    private double preco;

    // método construtor - atalho no intelij -> alt + insert
    // classe template -> só criando um código fonte pra depois usar na frente.

    public Estoque(int id, String produto, int estoque, double preco) { //não tem void pq n retorna, pois ele é especial
        this.id = id; // this é referente ao atributo ou seja -> o valor depois do ponto é a referencia aos atributos na parte de cima no private
        this.produto = produto;
        this.estoque = estoque;
        this.preco = preco;
    }
    // é uma boa prática usar os mesmos nomes da variável com o nome dos atributos.

    // void é pra quando n retorna nada.
    public void Acrescimo (int qtde){
        estoque += qtde; // forma reduzida de escrever: estoque = estoque + qtde

    }
    public void Baixa (int qtde){
        if (qtde <= estoque) // valida e não permite estoque negativos.
        estoque -= qtde; // forma reduzida de escrever: estoque = estoque - qtde
    }

    public double TotalEstoque (){ //não precisa colocar o parametro pq esse é um modelo geral de tudo.
        return estoque*preco; //todo metodo diferente de void precisa de return
    }

    public String ConsultaEstoque (){
        return "Produto: " + produto + "\nEstoque: " + estoque + "\nPreço: " + preco;
    }



}
