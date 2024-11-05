import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia os valores dos pontos p1 (x1, y1) e p2 (x2, y2)
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calcule a distância entre os dois pontos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Imprima o resultado no formato especificado
        System.out.printf("Distancia = %.4f%n", distancia);

        scanner.close();
    }
}
