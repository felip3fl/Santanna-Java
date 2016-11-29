//02)	Fa�a um programa JAVA que leia um numero inteiro e informe se � quadrado perfeito
//Exemplo: 6 = 1 + 2 + 3


package listaDeExercicios.exercicio01_02;

import java.util.Scanner;

public class QuadradoPerfeito{
	private static Scanner teclado;

	public static void main (String[]args) {
		int n, i, soma = 1;
		
		teclado = new Scanner (System.in);
                System.out.print("N: ");
		n = teclado.nextInt();

		for (i = 2; i < n; i++) {
			if (n%i == 0) {
				soma = soma+1;
			}
		}
		
		if (n == soma) {
			System.out.println(n+" � quadrado perfeito");
                        
                }
		else {
			System.out.println(n+" N�o � quadrado perfeito");
		}
	}
}