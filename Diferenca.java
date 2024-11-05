import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia quatro valores inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Calcule a diferença do produto de A e B pelo produto de C e D
        int DIFERENCA = (A * B) - (C * D);

        // Imprima o resultado no formato especificado
        System.out.printf("DIFERENCA = %d%n", DIFERENCA);

        scanner.close();
    }
}
