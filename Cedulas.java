import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o valor inteiro
        int N = scanner.nextInt();
        System.out.println(N);

        // Defina os valores das notas
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];

        // Calcule a quantidade de cada nota
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = N / notas[i];
            N %= notas[i];
        }

        // Imprima a quantidade de cada nota
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d,00%n", quantidadeNotas[i], notas[i]);
        }

        scanner.close();
    }
}
