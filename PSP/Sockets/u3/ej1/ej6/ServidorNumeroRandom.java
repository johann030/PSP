package u3.ej1.ej6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorNumeroRandom {
	public void servidor() {
		System.out.println("Creando servidor...");
		int numRandom = (int) (Math.random() * (20 + 1)) + 1;
		int linea;
		String mensaje;
		String pista;
		try (Scanner sc = new Scanner(System.in);
				ServerSocket server = new ServerSocket(5555);
				Socket socket = server.accept();
				OutputStream os = socket.getOutputStream();
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {
			System.out.println("Servidor en linea.");

			mensaje = "Tiene que adivinar el numero que estoy pensando :)";
			os.write(mensaje.getBytes());

			while ((linea = br.read()) != -1) {
				if (linea != numRandom) {
					mensaje = "Incorrecto. Pruebe con otro numero";
					if (linea < numRandom) {
						pista = "El numero es mayor.";
						os.write((mensaje + pista).getBytes());
					} else if (linea > numRandom) {
						pista = "El numero es menor";
						os.write((mensaje + pista).getBytes());
					}
				} else if (linea == numRandom) {
					mensaje = "Ha acertado. El numero es: " + numRandom;
					os.write(mensaje.getBytes());
				}
			}

		} catch (Exception e) {

		}
	}

}
