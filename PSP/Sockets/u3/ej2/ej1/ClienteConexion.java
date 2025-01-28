package u3.ej2.ej1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteConexion {
	public static void main(String[] args) {
		String escribir = "";
		int longitud = 0;
		int cantidad = 0;
		System.out.println("Conectando al servidor...");
		try (Scanner sc = new Scanner(System.in);
				Socket cliente = new Socket("Localhost", 5000);
				OutputStream os = cliente.getOutputStream();
				InputStream is = cliente.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {

			System.out.println("Conexion establecida.\n");

			do {
				if (!(escribir.equalsIgnoreCase("salir"))) {
					System.out.print("Puede enviar mensajes: ");
					escribir = sc.nextLine();
					longitud = escribir.length();
					cantidad++;
					String mensaje = escribir + " (Este mensaje tiene " + longitud + " caracteres. Y ha enviado " + cantidad
							+ " mensaje.)\n";
					os.write(mensaje.getBytes());
				}
			} while (!(escribir.equalsIgnoreCase("salir")));

			System.out.println("Desconectando del servidor...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Desconectado del servidor.");
	}
}