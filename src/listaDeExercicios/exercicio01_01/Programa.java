//01 - Fa�a um programa JAVA que leia um numero inteiro e mostre a tabuada deste numero

package listaDeExercicios.exercicio01_01;

import java.util.Scanner;

public class Programa{
	private static Scanner teclado;

	public static void main (String args[]) {
		
		int n,i,soma;
		
		teclado = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        n = teclado.nextInt();
		
        for (i=1;i<=10;i++){
        	
        	soma = n * i;
        	
        	System.out.println(n+" x "+i+" = "+soma);
        	
        }
        
	}
}