package armazem;
import java.util.Scanner;

public class ProgramaEstoque {
    public static void main(String[] args) {
    /*
        //o programador inserir os dados manualmente chama Mocar os dados

        Estoque produto1 = new Estoque(1, "Arroz", 10, 25); //usando o construtor
        Estoque produto2 = new Estoque(2, "Feijão", 10, 5.65);
        Estoque produto3 = new Estoque(3, "Açucar", 10, 16);

        // chamar os métodos criados:

        produto1.Acrescimo(100);
        produto2.Baixa(6);


        System.out.println(produto1.ConsultaEstoque() + "\n");
        System.out.println(produto2.ConsultaEstoque() + "\n");
        System.out.println("R$ "+ produto3.TotalEstoque());

    */
        //Programa com leitura pelo teclado

        Scanner ler = new Scanner(System.in);
        //declara as variáveis que receberá as informações via teclado.
        int id, estoque;
        String produto;
        double preco;

        System.out.println("Digite o nome do código do produto: ");
        id = ler.nextInt();

        System.out.println("Digite o nome do produto: ");
        produto = ler.nextLine();
        produto = ler.nextLine();

        System.out.println("Digite a quantidade inicial: ");
        estoque = ler.nextInt();

        System.out.println("Digite o preço: ");
        preco = ler.nextDouble();

        // capitei todos os dados e criando novo objeto:
        Estoque produto1 = new Estoque(id, produto, estoque, preco);
        // olhar como está o estoque
        System.out.println(produto1.ConsultaEstoque());
        // aumentando o estoque
        System.out.println("Digite a quantidade para acrescentar o estoque: ");
        int add = ler.nextInt();
        produto1.Acrescimo(add);
        // printando na tela o estoque atual:
        System.out.println(produto1.ConsultaEstoque());
    }
}