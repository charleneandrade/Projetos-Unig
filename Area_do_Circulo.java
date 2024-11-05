import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o valor do raio
        double raio = scanner.nextDouble();

        // Defina o valor de π
        double pi = 3.14159;

        // Calcule a área
        double area = pi * Math.pow(raio, 2);

        // Imprima o resultado no formato especificado
        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}
