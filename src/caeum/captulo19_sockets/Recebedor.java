// Felipe da Silva Lima – RA: 00513104 - Página 265 - Caelum fj11
//1)	Implementar o BroadCast de mensagens da Apostila da Caelum, capítulo 19 (2 pontos)

package caeum.captulo19_sockets;

import java.io.InputStream;
import java.util.Scanner;

public class Recebedor implements Runnable {

	private InputStream servidor;
	private Scanner s;

	public Recebedor(InputStream servidor) {
		this.servidor = servidor;
	}

	public void run() {
		s = new Scanner(this.servidor);
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
	}
}