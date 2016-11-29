// Desenvolvido por Felipe da Silva Lima
// RA 00513104
// Trabalho do 1 Bimestre - 5 Semestre
// Curso de Ciencia Da computação
// Sobre o TDE: Desenvolvido um projeto orientado a objetos em Java que implemente a matriz esparsa dinâmica

package tde1matrizEsparsa;

import java.util.Scanner;

public class Dados {

	Scanner in = new Scanner(System.in);

	private String valor; //Principal, onde fica os valores

	
	/* ESCOLHA DAS OPCAO SIM OU NAO */
	private boolean escolha() {
		System.out.print("Escolha uma opção abaixo: ");
		System.out.print("\n[ 1 SIM ][ 2 NAO ]\n");
		System.out.print("\nSua opção: ");
		int opcao = in.nextInt();
		if (opcao == 1) { //Quanquer escolha direfente de 1, vai dar como FALSE, ou seja, NÃO
			return true;
		} else {
			return false;
		}
	}

	
	/* INSERIR VALOR NA MATRIX */
	public boolean setValor(String valorDigitado) {
		if (!espacoMatrizVazia() && valorDigitado != null) { //Esse IF para testa se possição nao esta ja sendo usada
			System.out.print("\n::::: Atenção! posição matriz ja oculpada.\n");
			System.out.print("\nDeseja substituir o valor " + getValor()+ " dessa matriz?\n");
			if (escolha()) {
				this.valor = valorDigitado;
				return true; //Valor subtituido com sucesso!
			} else {
				return false; //Caso usuario digita 2, ele retorna FALSO porque não foi inserido o valor
			}
		} else {
			this.valor = valorDigitado;
			return true; //NOVO valor inserido com sucesso, OU , Valor apagado com sucesso!
		}
	}

	
	/* RETORNA VALOR */
	public String getValor() {
		return this.valor; //Retorna valor digitado na matriz
	}

	
	/* VERIFICAR SE MATRIX NESSE CAMPO ESTA VAZIA */
	public boolean espacoMatrizVazia() {
		if (this.valor == null) { //caso SIM, significa campo vazio, mas não se a matriz toda ta vazia!
			return true;
		} else {
			return false;
		}
	}
}
