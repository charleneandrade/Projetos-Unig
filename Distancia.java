import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia a distância em Km
        int distancia = scanner.nextInt();

        // Calcule o tempo necessário em minutos
        int tempo = distancia * 2;

        // Imprima o resultado no formato especificado
        System.out.printf("%d minutos%n", tempo);

        scanner.close();
    }
}
