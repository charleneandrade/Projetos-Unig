import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia os três valores inteiros
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Utilize a fórmula para encontrar o maior entre a e b
        int maiorAB = (a + b + Math.abs(a - b)) / 2;

        // Utilize a fórmula novamente para encontrar o maior entre maiorAB e c
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        // Imprima o resultado no formato especificado
        System.out.printf("%d eh o maior%n", maior);

        scanner.close();
    }
}
