import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia dois valores inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcule o produto de A e B
        int PROD = A * B;

        // Imprima o resultado no formato especificado
        System.out.printf("PROD = %d%n", PROD);

        scanner.close();
    }
}
