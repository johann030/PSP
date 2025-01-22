package u3.ej1.ej2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		System.out.println("Inicializando servidor...");
		try {
			ServerSocket server = new ServerSocket(5000);
			Socket socket = server.accept();
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Servidor iniciado correctamente.");

			String linea = br.readLine();

			while (linea != null) {
				System.out.println("*" + linea.toUpperCase() + "*");
				linea = br.readLine();
			}
			socket.close();
			server.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}