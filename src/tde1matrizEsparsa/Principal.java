// Desenvolvido por Felipe da Silva Lima
// RA 00513104
// Trabalho do 1 Bimestre - 5 Semestre
// Curso de Ciencia Da computação
// Sobre o TDE: Desenvolvido um projeto orientado a objetos em Java que implemente a matriz esparsa dinâmica

package tde1matrizEsparsa;

import java.util.Scanner;

public class Principal {

	static int dadosInseridos = 0; //dadosInserido é com comtador. é add um valor toda vez que chama a opcao INSERIR
	static int x, y = 0; // Para controle da matriz

	static int xMatriz, yMatriz = 0; // Comtrola o tamanha da matriz
	static int ultimoX, ultimoY = 0; // Saber o valor que esta na final da matriz

	
	/* COMTROLE PARA NAO DEIXA USUARIO DIGITA VALOR MAIOR QUE A CAPACIDADE DA MATRIZ */
	static void posicao() {
		do {
			System.out.print("\nPosição horizontal (X): ");
			x = in.nextInt();
		} while (x > xMatriz); // Nao saira dessa opcao ate o usuario digita um valor menor que a capacidade matrix

		do {
			System.out.print("Posição vertical (Y): ");
			y = in.nextInt();
		} while (y > yMatriz);
	}

	
	/* VERIFICAR SE JA FOI INSERIDO ALGUM VALOR NA MATRIZ */
	static boolean matrizVazia() {
		if (dadosInseridos == 0) { //dadosInserido é com comtador. é add um valor toda vez que chama a opcao INSERIR
			System.out.print("\n:::: Erro! Matriz esta vazia!\n");
			return true;
		} else {
			return false;
		}
	}

	
	/* VER ULTIMO VALOR INSERIDO NA MATRIX */
	static void controleMatriz(int valorX, int valorY) {
		if (valorX > ultimoX) {
			ultimoX = x;
		}

		if (valorY > ultimoY) {
			ultimoY = y;
		}
	}

	/* APENAS PARTE ESTETICA DO PROGRAMA EM EXECUCAO */
	static void linha() {
		System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
	}

	static Scanner in = new Scanner(System.in);

	
	/* =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--= CODIGO PRINCIPAL =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-= */
	
	
	public static void main(String args[]) {

		/* MESSAGEM DE INICIO */
		linha();
		System.out.print("\n::::: Desenvolvido por Felipe da Silva Lima\n");
		System.out.print("::::: Trabalho do 1º Bimestre - 5º Semestre\n");
		System.out.print("::::: Curso de Ciencia Da computação\n");
		System.out.print("::::: Sobre o TDE: Desenvolvido um projeto orientado a objetos em Java que implemente a matriz esparsa dinâmica\n");

		
		/* MATRIZ PRINCIPAL */
		xMatriz = 100; 
		yMatriz = 100;
		Dados matriz[][] = new Dados[xMatriz + 1][yMatriz + 1];
		for (x = 0; x <= xMatriz; x++) {
			for (y = 0; y <= yMatriz; y++) {
				matriz[x][y] = new Dados();
			}
		}
		System.out.print("\n::::: Matriz criada com Sucesso!\n");

		
		/* MENU USUARIO */
		int opcao = 0;
		do {
			linha();
			System.out.print("\n::::: Menu Principal ::::: Tamanho atual matriz: [ x: "+ ultimoX + " y: " + ultimoY + " ] :::::\n");
			System.out.print("\nEscolha uma opção abaixo: \n");
			System.out.print("[ 1 Inserir ] [ 2 Apagar ] [ 3 Consultar ] [ 4 Exibir a matriz ] [ 0 Sair ]\n");
			System.out.print("\nSua opção: ");
			opcao = in.nextInt();

			switch (opcao) {

			
			/* -=-=-=-=- CASO 1 - INSERIR DADOS -=-=-=-=- */
			case 1:
				linha();
				System.out.print("\n::::: Inserir dados na matriz\n");
				posicao();
				
				System.out.print("Valor: ");
				
				if (matriz[x][y].getValor() == null) { //Antes de inserir, ferificar se ja existe valor, caso SIM, Condator++
					dadosInseridos++; //Contador +1
					controleMatriz(x, y); //Só precisa executa isso caso for um novo valor
				}
				
				if (matriz[x][y].setValor(in.next())) {
					System.out.print("\n::::: Valor inserido com sucesso!\n");
				}
				break;

				
			/* -=-=-=-=- CASO 2 - APAGAR DADOS -=-=-=-=- */
			case 2:
				linha();
				if (!matrizVazia()) {
					System.out.print("\n\n::::: Apagar dados da matriz\n");
					posicao();
					
					if (!matriz[x][y].espacoMatrizVazia()) {
						matriz[x][y].setValor(null);
						System.out.print("\n::::: Valor apagado com sucesso!\n");
						dadosInseridos--; //Contador -1
						
						// Teste para verificar os ultimo valores da matriz
						ultimoX = ultimoY = 0; //Zerar antes de comeca o teste, para nao haver erro							
						for (x = 0; x <= xMatriz; x++) {
							for (y = 0; y <= yMatriz; y++) {
								if (matriz[x][y].getValor() != null) { //Se espaco nao for vazios, ignora
									controleMatriz(x, y);
								}
							}
						}

					} else {
						System.out.print("\n::::: Erro! Não há nenhum valor\n"); //Caso contador = 0
					}
				}
				break;

				
			/* -=-=-=-=- CASO 3 - CONSULTAR -=-=-=-=- */
			case 3:
				linha();
				if (!matrizVazia()) {
					System.out.print("\n::::: Consultar valor na matriz\n");
					System.out.print("\nUltimo valor inserido [ x: " + ultimoX+ " y: " + ultimoY + " ] Valor: "+ matriz[ultimoX][ultimoY].getValor() + "\n");
					posicao();
					
					if (!matriz[x][y].espacoMatrizVazia()) {
						System.out.print("\n[ x: " + x + " y: " + y + " ] Valor: " + matriz[x][y].getValor() + "\n");
					} else {
						System.out.print("\n::::: Erro! Não há nenhum valor\n"); //Caso contador = 0
					}
				}
				break;

				
			/* -=-=-=-=- CASO 4 - EXIBIR TODA A MATRIZ -=-=-=-=- */
			case 4:
				linha();
				if (!matrizVazia()) {
					System.out.print("\n::::: Todos os valores matriz\n");
					System.out.print("\nEscolha uma opção abaixo: \n");
					System.out.print("[ 1 Ver toda a matriz ] [ 2 Apenas valores Inseridos ] \n");
					System.out.print("\nSua opção: ");
					opcao = in.nextInt();
					
					for (x = 0; x <= ultimoX; x++) {
						for (y = 0; y <= ultimoY; y++) {
							
							//Se ta vazio e usuario digitou 1, não mostra essa linha vazia, apenas com valores
							if (matriz[x][y].getValor() == null) {
								if (opcao == 1) System.out.print("\n[ x: " + x + " y: " + y+ " ] Valor: ");
							} else {
								System.out.print("\n[ x: " + x + " y: " + y	+ " ] Valor: "+ matriz[x][y].getValor());
							}
						}
					}
					System.out.print("\n\n::::: Valores imprimindo com sucesso!\n");
				}
				break;

				
			/* -=-=-=-=- OPCAO ERRADA OU SAIR DO PROGRAMA -=-=-=-=- */
			case 0:
				linha();
				System.out.print("\n::::: ENCERADO :::::\n");
				linha();
				break;

			default:
				linha();
				System.out.print("\n::::: Erro! Opção Errada\n");
				break;

			}

		} while (opcao != 0);

	}
}
