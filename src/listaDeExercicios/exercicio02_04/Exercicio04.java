package listaDeExercicios.exercicio02_04;

import java.util.Scanner;

//  4) Fa�a um algoritmo com uma fun��o que receba como par�metro uma porcentagem
//  de aumento e um sal�rio, e retorne o novo sal�rio.
public class Exercicio04 {

    private static Scanner teclado;

	public static double novoSalario(double salario, double porcentagem) {
        return (salario * (1 + porcentagem / 100));
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.print("Digite o sal�rio: ");
        double s = teclado.nextDouble();
        System.out.print("Digite o aumento (porcentagem): ");
        double p = teclado.nextDouble();

        System.out.println();
        System.out.println("Novo sal�rio = " + novoSalario(s, p));
    }
}