import java.util.Scanner;
public class Frase {
    public static void main (String[] args) {

    String texto;
    int contVogal=0;

    Scanner ler = new Scanner(System.in);

        System.out.println("Digite um texto qualquer");
    texto = ler.nextLine();

    texto = texto.toUpperCase();

    for (int i=0;i<texto.length();i++){
        if (texto.charAt(i)=='A' || texto.charAt(i)=='E' || texto.charAt(i)=='I' || texto.charAt(i)=='O' || texto.charAt(i)=='U')
            contVogal++;
    }

        System.out.println("A Quantidade de vogais é: " + contVogal);

    }
}



