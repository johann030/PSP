package pruebas;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		try {
			System.out.println("Creando socket cliente");
			Socket clientSocket = new Socket();
			System.out.println("Estableciendo conexión");
			InetSocketAddress addr = new InetSocketAddress("Localhost", 5555);
			clientSocket.connect(addr);

			InputStream is = clientSocket.getInputStream();
			OutputStream os = clientSocket.getOutputStream();

			System.out.println("MARICA DE MIERDA");

			String mensaje0 = "PERRO \n";
			String mensaje1 = "PUTISIMO MARICON \n";
			String mensaje2 = "Te gustan las menores? \n";
			String mensaje3 = "Si no respondes es que te gustan. \n";
			os.write(mensaje0.getBytes());
			os.write(mensaje1.getBytes());
			os.write(mensaje2.getBytes());
			os.write(mensaje3.getBytes());

			System.out.println("Mensaje enviado");
			System.out.println("Cerrando socket cliente");
			clientSocket.close();
			System.out.println("Terminado");

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
