import java.util.Scanner;
public class Carro {

    public static void main (String[] args) {
        String placa;
        int ano;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Placa do seu Carro!");
        placa = ler.next(); //next ler apenas uma palavra e nextLine ler uma frase

        System.out.println("Digite o Ano de Fabricação do seu carro!");
        ano = ler.nextInt();

        if (ano <= 2010)
            System.out.println("Carro Velho!");

        else if (ano <= 2022)
            System.out.println("Carro Semi Novo");

        else if (ano == 2023)
            System.out.println("Carro Novo");

        else
            System.out.println("invalido");

        placa = placa.toUpperCase();

        ;

        for (int i=0;i<placa.length();i++){
            if (placa.charAt(i)=='A' || placa.charAt(i)=='E' || placa.charAt(i)=='I' || placa.charAt(i)=='O' || placa.charAt(i)=='U')
                placa = placa.replace(placa.charAt(i), '*');
        }

        System.out.println("Placa Alterada " + placa);

    }

}