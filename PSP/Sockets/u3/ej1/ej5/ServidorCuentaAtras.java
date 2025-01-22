package u3.ej1.ej5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorCuentaAtras {
	public static void main(String[] args) {
		System.out.println("Creando servidor...");
		try (ServerSocket server = new ServerSocket(5000); Socket socket = server.accept()) {

			System.out.println("Servidor en linea.");

			OutputStream os = socket.getOutputStream();

			InputStream is = socket.getInputStream();

			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			int linea;

			while ((linea = br.read()) != 0) {
				int numero = linea;
				for (int i = 0; i <= numero; numero--) {
					os.write(numero);
				}
			}

			System.out.println("Cerrando servidor.");
			socket.close();
			server.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
