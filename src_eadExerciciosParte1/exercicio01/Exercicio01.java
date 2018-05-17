//1) Elabore um programa que, dada a idade de um nadador, classificao em uma das seguintes categorias:
//infantil A = 5  7 anos
//infantil B = 8  10 anos
//juvenil A = 11  13 anos
//juvenil B = 14  17 anos
//adulto = maiores de 18 anos

package exercicio01;

import java.util.Scanner;


public class Exercicio01 {
	private static Scanner in;

	public static void main (String args[]){
		
	//int idade;
	
	Classificacao nadador = new Classificacao();
	in = new Scanner(System.in);
	
	System.out.print("Nadador, digite sua idade: ");
	nadador.idade = in.nextInt();
	
	nadador.cartegoria(nadador.idade);
	
	}
}

