//Apostila Caelum fj11 captulo 2
/*4) Imprima os fatoriais de 1 a 10.
O fatorial de um número n é n * n-1 * n-2 ... até n = 1. Lembre-se de utilizar os parênteses.
O fatorial de 0 é 1
O fatorial de 1 é (0!) * 1 = 1
O fatorial de 2 é (1!) * 2 = 2
O fatorial de 3 é (2!) * 3 = 6
O fatorial de 4 é (3!) * 4 = 24
Faça um for que inicie uma variável n (número) como 1 e fatorial (resultado) como 1 e varia n de 1 até 10:
for (int n = 1, fatorial = 1; n <= 10; n++) {
} */

package caeum.captulo03_variaveisLoops.exercicio3_3;

public class MeuPrograma4{
	public static void main (String args[]) {
		int n, i, fat = 1;
		
		for (n=1;n<=10;n++){
			
			fat = 1;
			
			for (i = 2; i <= n; i++) {
				
					fat = fat * i;
			}
			
		System.out.println("Fatorial de "+n+" = " + fat);
		
		}
	}
}