//03)	Fa�a um programa java que leia um numero inteiro e calcule o fatorial.
//Exemplo: 4! = 4 * 3 * 2 * 1


package listaDeExercicios.exercicio01_03;

import java.util.Scanner;

public class Fatorial{
	private static Scanner teclado;

	public static void main (String args[]) {
		int n, i, fat = 1;
		
		teclado = new Scanner (System.in);
        System.out.print("N: ");
		n = teclado.nextInt();

		fat = 1;
		
		for (i = 2; i <= n; i++) {
			
				fat = fat * i;
			
		}
		
		
		System.out.println("Fatorial = " + fat);
		
	}
}