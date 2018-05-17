package exercicio03p2;

import java.util.Scanner;

//  3) Faça um algoritmo que leia um vetor de números inteiros (20 posições) e
//  mostre o vetor ordenado (crescente).
//  Depois, dado um número inteiro qualquer, pesquise o mesmo no vetor,
//  informando se foi encontrado ou não.
public class Exercicio03 {

    static int v[] = new int[20];
    static Scanner teclado = new Scanner(System.in);

    public static void leitura() {
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = teclado.nextInt();
        }
    }

    public static void ordena() {
        int aux;

        for (int i = 0; i <= 18; i++) {
            for (int j = i + 1; j <= 19; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    public static void mostra() {
        System.out.println();
        for (int i = 0; i <= 19; i++) {
            System.out.print(v[i] + "  ");
        }
        System.out.println();
        System.out.println();
    }

    // Retorna o valor -1 caso não encontre o elemento no vetor,
    // ou então retorna a posição, caso encontre o elemento no vetor.
    public static int busca(int x) {
        int idx = -1;
        for (int i = 0; i <= 19; i++) {
            if (v[i] == x) {
                idx = i;
            }
        }
        return (idx);
    }

    public static void pesquisa() throws Exception {
        int n, idx;

        System.out.print("Deseja pesquisar um número (S/N)? ");
        char opcao = (char) System.in.read();
        while (Character.toUpperCase(opcao) == 'S') {
            System.out.println();
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            System.out.println();
            idx = busca(n);
            if (idx == -1) {
                System.out.println("Número NÃO encontrado!");
            } else {
                System.out.println("Número " + n + " encontrado na posição " + idx);
            }
            System.out.println();
            System.out.print("Deseja pesquisar outro número (S/N)? ");
            opcao = (char) System.in.read();
        }
    }

    public static void main(String[] args) throws Exception {
        leitura();
        ordena();
        mostra();
        pesquisa();
    }
}