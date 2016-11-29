//  2) Escrever um programa que l� um valor em reais e calcula qual o menor
//  n�mero poss�vel de notas de 100, 50, 10, 5 e 1 em que o valor lido pode ser
//  decomposto. Escrever o valor lido e a rela��o de notas necess�rias.

package listaDeExercicios.exercicio03_02;

import java.util.Scanner;

public class Exercicio02 {

    private static Scanner teclado;

	public static void main(String[] args) {
        teclado = new Scanner(System.in);

        System.out.print("Digite o valor (R$): ");
        int valor = teclado.nextInt();

        int n100 = valor / 100;
        int n1 = valor % 100;
        int n50 = n1 / 50;
        n1 %= 50;
        int n10 = n1 / 10;
        n1 %= 10;
        int n5 = n1 / 5;
        n1 %= 5;

        System.out.println();
        System.out.println("O valor R$ " + valor + " pode ser decomposto em:");
        System.out.println();
        System.out.println("Quantidade de notas de R$ 100: " + n100);
        System.out.println("Quantidade de notas de R$  50: " + n50);
        System.out.println("Quantidade de notas de R$  10: " + n10);
        System.out.println("Quantidade de notas de R$   5: " + n5);
        System.out.println("Quantidade de notas de R$   1: " + n1);
    }
}