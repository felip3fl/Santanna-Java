package prova1questao4;

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

import java.util.Scanner;

public class Aviao {

    Scanner teclado = new Scanner(System.in);
    private boolean[] poltronas = new boolean[10];
    private int ptrPrimeira = -1;
    private int ptrSegunda = 4;

    public Aviao() {
        for (int i = 0; i < 10; i++) {
            poltronas[i] = false;
        }
    }

    public void atribuiAssento(int classe) {
        if (classe == 1) {
            atribuiPrimeira();
        } else {
            atribuiSegunda();
        }
    }

    private void atribuiPrimeira() {
        if (ptrPrimeira < 4) {
            poltronas[++ptrPrimeira] = true;
            System.out.println("Cartão de embarque: " + (ptrPrimeira + 1) + " - Primeira Classe.");
        } else {
            if (ptrSegunda == 9) {
                System.out.println("Classe econômica também está lotada!!!");
            } else {
                System.out.print("Primeira Classe lotada, deseja sentar na classe econômica? ");
                if (teclado.next().equalsIgnoreCase("s")) {
                    atribuiSegunda();
                } else {
                    System.out.println("O próximo vôo parte em 3 horas!");
                }
            }
        }
    }

    private void atribuiSegunda() {
        if (ptrSegunda < 9) {
            poltronas[++ptrSegunda] = true;
            System.out.println("Cartão de embarque: " + (ptrSegunda + 1) + " - Segunda Classe.");
        } else {
            if (ptrPrimeira == 4) {
                System.out.println("Primeira Classe também está lotada!!!");
            } else {
                System.out.print("Classe Econômica lotada, deseja sentar na primeira classe? ");
                if (teclado.next().equalsIgnoreCase("S")) {
                    atribuiPrimeira();
                } else {
                    System.out.println("O próximo vôo parte em 3 horas!");
                }
            }
        }
    }
}