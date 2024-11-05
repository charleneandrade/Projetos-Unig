import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia dois valores inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Efetue a soma de A e B
        int X = A + B;

        // Imprima o resultado no formato especificado
        System.out.println("X = " + X);

        scanner.close();
    }
}
