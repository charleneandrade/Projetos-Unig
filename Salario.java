import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia o número do funcionário
        int numeroFuncionario = scanner.nextInt();

        // Leia o número de horas trabalhadas
        int horasTrabalhadas = scanner.nextInt();

        // Leia o valor que recebe por hora
        double valorPorHora = scanner.nextDouble();

        // Calcule o salário
        double salario = horasTrabalhadas * valorPorHora;

        // Imprima o número e o salário do funcionário no formato especificado
        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = $ %.2f%n", salario);

        scanner.close();
    }
}
