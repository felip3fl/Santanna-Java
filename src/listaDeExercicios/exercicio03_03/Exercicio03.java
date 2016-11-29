// 3) Escrever um programa que l� um valor N inteiro e positivo e que calcula e
// escreve o valor de E, conforme a f�rmula abaixo:
// E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!

package listaDeExercicios.exercicio03_03;

import java.util.Scanner;

public class Exercicio03 {

    private static Scanner teclado;

	public static int fatorial(int x) {
        int fat = 1;
        for (int i = 2; i <= x; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.print("Digite N: ");
        int n = teclado.nextInt();

        double valorE = 1.0;
        for (int i = 1; i <= n; i++) {
            valorE += 1.0 / fatorial(i);
        }
        System.out.printf("O valor de E � %.5f\n", valorE);
    }
}