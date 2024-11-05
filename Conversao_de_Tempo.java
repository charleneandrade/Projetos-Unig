import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o valor inteiro em segundos
        int N = scanner.nextInt();

        // Calcule as horas, minutos e segundos
        int horas = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = N % 60;

        // Imprima o resultado no formato especificado
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        scanner.close();
    }
}
