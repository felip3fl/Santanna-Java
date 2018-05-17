package exercicio04;

import java.util.Scanner;

// 4) A prefeitura de uma cidade fez uma pesquisa entre seus habitantes,
// coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
//
// a) média do salário da população;
// b) média do número de filhos;
// c) maior salário;
// d) percentual de pessoas com salário até R$ 100,00.
//
// O final da leitura de dados se dará com a entrada de um salário negativo.
public class teste {

    private static Scanner teclado;

	public static void main(String[] args) {
        teclado = new Scanner(System.in);

        double somaSalario = 0, maiorSalario = 0;
        int contHab = 0, somaNumFilhos = 0, contSalMenor100 = 0;

        System.out.print("Digite o salário: ");
        double salario = teclado.nextDouble();
        while (salario >= 0) {
            System.out.print("Digite o número de filhos: ");
            int numFilhos = teclado.nextInt();

            contHab++;
            somaSalario += salario;
            somaNumFilhos += numFilhos;
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario <= 100) {
                contSalMenor100++;
            }
            System.out.print("Digite o salário: ");
            salario = teclado.nextDouble();
        }

        if (contHab > 0) {
            System.out.printf("\nMédia do salário da população: R$ %.2f", somaSalario / contHab);
            System.out.printf("\nMédia do número de filhos: %.2f", 1.0 * somaNumFilhos / contHab);
            System.out.printf("\nMaior salário: R$ %.2f", maiorSalario);
            System.out.printf("\nPercentual de pessoas com salário até R$ 100,00: %.2f%%\n", 1.0 * contSalMenor100 / contHab * 100);
        }
    }
}