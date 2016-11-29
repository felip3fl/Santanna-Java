//Apostila Caelum fj11 captulo 2
/*5) Aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. Em um determinado
momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas. Porque?
Mude de int para long, e você poderá ver alguma mudança.*/

package caeum.captulo03_variaveisLoops.exercicio3_3;

public class MeuPrograma5{
	public static void main (String args[]) {
		int n, i = 1;
		long fat;
		
		for (n=1;n<=40;n++){
			
			fat = 1;
			
			for (i = 2; i <= n; i++) {
				
					fat = fat * i;
			}
			
		System.out.println("Fatorial de "+n+" = " + fat);
		
		}
	}
}
