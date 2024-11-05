import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o tempo gasto na viagem (em horas)
        int tempo = scanner.nextInt();

        // Leia a velocidade média durante a viagem (em km/h)
        int velocidadeMedia = scanner.nextInt();

        // Calcule a distância percorrida
        int distancia = tempo * velocidadeMedia;

        // Calcule a quantidade de litros de combustível necessária
        double litrosNecessarios = distancia / 12.0;

        // Imprima o resultado no formato especificado
        System.out.printf("%.3f%n", litrosNecessarios);

        scanner.close();
    }
}
