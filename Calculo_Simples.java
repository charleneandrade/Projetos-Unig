import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia os dados da peça 1
        int codigoPeca1 = scanner.nextInt();
        int numeroPecas1 = scanner.nextInt();
        double valorUnitarioPeca1 = scanner.nextDouble();

        // Leia os dados da peça 2
        int codigoPeca2 = scanner.nextInt();
        int numeroPecas2 = scanner.nextInt();
        double valorUnitarioPeca2 = scanner.nextDouble();

        // Calcule o valor total a ser pago
        double totalPagar = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);

        // Imprima o resultado no formato especificado
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);

        scanner.close();
    }
}
