// Felipe da Silva Lima – RA: 00513104 - Página 265 - Caelum fj11
//1)	Implementar o BroadCast de mensagens da Apostila da Caelum, capítulo 19 (2 pontos)

package caeum.captulo19_sockets;

import java.io.InputStream;
import java.util.Scanner;

public class TrataCliente implements Runnable {

	private InputStream cliente;
	private Servidor servidor;

	public TrataCliente(InputStream cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}

	public void run() {
		// quando chegar uma msg, distribui pra todos
		Scanner s = new Scanner(this.cliente);
		while (s.hasNextLine()) {
			servidor.distribuiMensagem(s.nextLine());
		}
		s.close();
	}
}