package u3.j3.ej;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public void crearServer() {
		Cliente cl = new Cliente();
		System.out.println("Creando el servidor...");
		try (Scanner sc = new Scanner(System.in);
				ServerSocket server = new ServerSocket(1313);
				Socket socket = server.accept();
				OutputStream os = socket.getOutputStream();
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {

			String lineas;
			int conexiones = 0;
			System.out.println("Servidor creado.");

			cl.getNombre();
			String mensajes = "Buenas tardes " + cl.getNombre();
			os.write(mensajes.getBytes());

			while ((lineas = br.readLine()) != null) {
				System.out.println(cl.getNombre() + " ha escrito: " + lineas);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Servidor apagado.");
	}
}