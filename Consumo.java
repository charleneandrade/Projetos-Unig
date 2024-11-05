import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia a distância total percorrida (em Km)
        int distancia = scanner.nextInt();

        // Leia o total de combustível gasto (em litros)
        double combustivelGasto = scanner.nextDouble();

        // Calcule o consumo médio
        double consumoMedio = distancia / combustivelGasto;

        // Imprima o resultado no formato especificado
        System.out.printf("%.3f km/l%n", consumoMedio);

        scanner.close();
    }
}
