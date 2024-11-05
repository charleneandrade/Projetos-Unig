import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia três valores de ponto flutuante de dupla precisão
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Defina os pesos
        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        // Calcule a média ponderada
        double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);

        // Imprima o resultado no formato especificado
        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
    }
}
