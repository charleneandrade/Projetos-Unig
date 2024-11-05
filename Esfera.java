import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o valor do raio
        double raio = scanner.nextDouble();

        // Defina o valor de pi
        double pi = 3.14159;

        // Calcule o volume da esfera
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3);

        // Imprima o resultado no formato especificado
        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();
    }
}
