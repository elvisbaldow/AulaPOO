import java.util.Scanner;

public class Viagem {
    public static void main (String[] args){
        double velocidade,tempo,distancia,kmlitro,consumototal;

        // preparar o scanner pra puxar as informações do teclado:
        Scanner leitura = new Scanner(System.in); //new permite criar os objetos

        System.out.println("Digite a Velocidade Media da viagem?");
        velocidade = leitura.nextDouble();

        System.out.println("Digite o tempo gasto?");
        tempo = leitura.nextDouble();

        System.out.println("Quantos quilometros seu veículo faz por litro?");
        kmlitro = leitura.nextDouble();

        distancia = velocidade * tempo;
        consumototal = distancia / kmlitro;

        System.out.println("Consumo Médio: " + consumototal);


    }
}
