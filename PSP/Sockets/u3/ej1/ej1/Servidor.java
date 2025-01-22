package u3.ej1.ej1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			ServerSocket server = new ServerSocket(5000);
			System.out.println("Estableciendo conexion.");
			Socket socket = server.accept();

			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String linea;

			while ((linea = br.readLine()).equals("Salir")) {
				System.out.println("*ECO* " + linea + " *ECO*");
				
			}

			OutputStream os = socket.getOutputStream();
			os.write(linea.toUpperCase().getBytes());

			System.out.println("Mensaje enviado.");
			socket.close();
			System.out.println("Terminado.");
			server.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
