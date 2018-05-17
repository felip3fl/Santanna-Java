package exercicio04p2;

import java.util.Scanner;

//  4) Faça um algoritmo com uma função que receba como parâmetro uma porcentagem
//  de aumento e um salário, e retorne o novo salário.
public class Exercicio04 {

    private static Scanner teclado;

	public static double novoSalario(double salario, double porcentagem) {
        return (salario * (1 + porcentagem / 100));
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double s = teclado.nextDouble();
        System.out.print("Digite o aumento (porcentagem): ");
        double p = teclado.nextDouble();

        System.out.println();
        System.out.println("Novo salário = " + novoSalario(s, p));
    }
}