//1) Elabore um programa que, dada a idade de um nadador, classificao em uma das seguintes categorias:
//infantil A = 5  7 anos
//infantil B = 8  10 anos
//juvenil A = 11  13 anos
//juvenil B = 14  17 anos
//adulto = maiores de 18 anos

package listaDeExercicios.exercicio03_01;

public class Classificacao {
	
	public int idade;
	
	public void cartegoria(int idade){
		
		switch(idade){
			case 1:
			case 2:
			case 3:
			case 4: System.out.print("Idade Invalida!");break;
			case 5: 
			case 6: 
			case 7: System.out.print("Cartegoria: Infantil AA");break;
			case 8: 
			case 9:
			case 10: System.out.print("Cartegoria: Infantil B");break;
			case 11:
			case 12:
			case 13: System.out.print("Cartegoria: Juvenil A");break;
			case 14:
			case 15:
			case 16:
			case 17: System.out.print("Cartegoria: Juvenil B");break;
			default: System.out.print("Cartegoria: Adulto");
		}
	}
}