package listaDeExercicios.exercicio03_04;

import java.util.Scanner;

// 4) A prefeitura de uma cidade fez uma pesquisa entre seus habitantes,
// coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:
//
// a) m�dia do sal�rio da popula��o;
// b) m�dia do n�mero de filhos;
// c) maior sal�rio;
// d) percentual de pessoas com sal�rio at� R$ 100,00.
//
// O final da leitura de dados se dar� com a entrada de um sal�rio negativo.
public class teste {

    private static Scanner teclado;

	public static void main(String[] args) {
        teclado = new Scanner(System.in);

        double somaSalario = 0, maiorSalario = 0;
        int contHab = 0, somaNumFilhos = 0, contSalMenor100 = 0;

        System.out.print("Digite o sal�rio: ");
        double salario = teclado.nextDouble();
        while (salario >= 0) {
            System.out.print("Digite o n�mero de filhos: ");
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
            System.out.print("Digite o sal�rio: ");
            salario = teclado.nextDouble();
        }

        if (contHab > 0) {
            System.out.printf("\nM�dia do sal�rio da popula��o: R$ %.2f", somaSalario / contHab);
            System.out.printf("\nM�dia do n�mero de filhos: %.2f", 1.0 * somaNumFilhos / contHab);
            System.out.printf("\nMaior sal�rio: R$ %.2f", maiorSalario);
            System.out.printf("\nPercentual de pessoas com sal�rio at� R$ 100,00: %.2f%%\n", 1.0 * contSalMenor100 / contHab * 100);
        }
    }
}