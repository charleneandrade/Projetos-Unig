import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia dois valores inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcule a soma de A e B
        int SOMA = A + B;

        // Imprima o resultado no formato especificado
        System.out.printf("SOMA = %d%n", SOMA);

        scanner.close();
    }
}
