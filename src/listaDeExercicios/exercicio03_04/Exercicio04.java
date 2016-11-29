package listaDeExercicios.exercicio03_04;

import java.util.Scanner;

public class Exercicio04 {
	private static Scanner in;

	public static void main (String args[]){
	
		int populacao = 0;
		double mediaSalario = 0;
		int filho = 0;
		double salario = 0;
		int salarioAbaixo = 0;
		double maiorSalario = 0;
		
		in = new Scanner(System.in);
		
		//Coletando informa��es popula��o
		while(salario >= 0){ 
			
			mediaSalario = mediaSalario + salario;
			
			
			
			if (salario > maiorSalario){
				maiorSalario = salario;
			}
			if (salario <= 100.00){
				salarioAbaixo++;
			}
			
			System.out.print("Digite seu Salario: ");
			salario = in.nextInt();
			
			System.out.print("Quanto filhos voce possui: ");
			filho = filho + in.nextInt();
			populacao++;
		}
		
		mediaSalario = mediaSalario / populacao; 
		salarioAbaixo = (salarioAbaixo / populacao) * 100; 
		filho = filho / populacao;
		
		System.out.println("\n\nNumero de pessoas pesquisadas : [ "+populacao+" ]");
		System.out.println("\nMedia salarial: "+mediaSalario);
		System.out.println("Percentual de pessoas com sal�rio at� R$ 100,00: "+salarioAbaixo+"%");		
		System.out.println("Maior Salario: "+maiorSalario);		
		System.out.println("Media de Filhos: "+filho);
		
	}
}
