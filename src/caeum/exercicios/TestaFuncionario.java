// Exercicio 1 e 2 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

package caeum.exercicios;

import java.util.Scanner;

public class TestaFuncionario {

	private static Scanner teclado;
	
	public static void main(String[] args) {
		
		teclado = new Scanner (System.in);
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		
		f1.dataDeEntrada = data;
		
		System.out.print("Digite o nome do Funcionario: ");
		f1.getNome(teclado.next());
		
		System.out.print("Digite o Departamento: ");
		f1.getDepartamento(teclado.next());
		
		System.out.print("Digite o Salario: ");
		f1.getSalario(teclado.nextDouble());
		
		System.out.print("Digite a Data de Entrada: ");
		f1.dataDeEntrada.getDia(teclado.nextInt());
		f1.dataDeEntrada.getMes(teclado.nextInt());
		f1.dataDeEntrada.getAno(teclado.nextInt());
		
		System.out.print("Digite RG: ");
		f1.getRg(teclado.next());
		
		System.out.print("Esse Funcionario esta ativo: ");
		f1.getAtivoEmpresa(teclado.next());
		
		//f1.getFichaFuncionario();
		
	}
	
}