package prova1questao4;
import java.util.Scanner;
/*
 * Você escreverá um aplicativo para atribuir assentos em cada vôo da companhia aérea para somente um avião (capacidade: dez assentos).
 * Seu aplicativo deve exibir as seguintes alternativas: “Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica”.
 * Se o usuário digitar 1, seu aplicativo deve atribuir assentos na primeira classe (poltronas 1 a 5).
 * Se o usuário digitar 2, seu aplicativo deve atribuir um assento na classe econômica (poltronas 6 a 10).
 * Em seguida, seu aplicativo deve exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está
 * na primeira classe ou na classe econômica. Utilize um array unidimensionaldo tipoprimitivo boolean para representar o 
 * gráfico de assentos do avião. Inicializetodos os elementos do array como false para indicar que todas as poltronas estão 
 * desocupadas. À medida que cada assento é atribuído,configure os elementos correspondentes do array com true para indicar 
 * que o assento não está maisdisponível. Seu aplicativo nunca deve atribuir uma poltrona que já foi reservada. 
 * Quando a classe econômica estiver lotada, seu aplicativo deve perguntar à pessoa se ela aceita ficar na primeira 
 * classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a mensagem “O próximo vôo parte em 3 horas”
*/

public class Principal {

    private static Scanner teclado;

	public static void main(String[] args) {
        teclado = new Scanner(System.in);
        Aviao aviao = new Aviao();
        int opcao;

        do {
            System.out.print("Por favor digite 1 para Primeira Classe, digite 2 para Classe Econômica e 0 para sair: ");
            opcao = teclado.nextInt();
            if (opcao != 0) {
                aviao.atribuiAssento(opcao);
            }
        } while (opcao != 0);
    }
}