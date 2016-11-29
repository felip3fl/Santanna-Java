// Felipe da Silva Lima – RA: 00513104 - Página 265 - Caelum fj11
//1)	Implementar o BroadCast de mensagens da Apostila da Caelum, capítulo 19 (2 pontos)

package caeum.captulo19_sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

	public static void main(String[] args) throws IOException {
		// inicia o servidor
		new Servidor(12345).executa();
	}

	private int porta;
	private boolean encerrar;
	private List<PrintStream> clientes;
	private ServerSocket servidor;

	public Servidor(int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<PrintStream>();
	}

	public void executa() throws IOException {
		servidor = new ServerSocket(this.porta);
		System.out.println("Porta 12345 aberta!");

		while (!encerrar) {
			// aceita um cliente
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente "
					+ cliente.getInetAddress().getHostAddress());

			// adiciona saida do cliente à lista
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);

			// cria tratador de cliente numa nova thread
			TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
			new Thread(tc).start();
		}

	}

	public void distribuiMensagem(String msg) {
		// envia msg para todo mundo
		for (PrintStream cliente : this.clientes) {
			cliente.println(msg);
		}
	}
}