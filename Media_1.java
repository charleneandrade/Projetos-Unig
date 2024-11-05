import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia dois valores de ponto flutuante de dupla precisão
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        // Defina os pesos
        double pesoA = 3.5;
        double pesoB = 7.5;

        // Calcule a média ponderada
        double media = (A * pesoA + B * pesoB) / (pesoA + pesoB);

        // Imprima o resultado no formato especificado
        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }
}
