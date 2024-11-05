import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o nome do vendedor
        String nomeVendedor = scanner.next();

        // Leia o salário fixo do vendedor
        double salarioFixo = scanner.nextDouble();

        // Leia o total de vendas efetuadas pelo vendedor no mês
        double totalVendas = scanner.nextDouble();

        // Calcule a comissão (15% sobre o total de vendas)
        double comissao = totalVendas * 0.15;

        // Calcule o total a receber
        double totalReceber = salarioFixo + comissao;

        // Imprima o resultado no formato especificado
        System.out.printf("TOTAL = R$ %.2f%n", totalReceber);

        scanner.close();
    }
}
