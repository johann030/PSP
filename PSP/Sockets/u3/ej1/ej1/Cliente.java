package u3.ej1.ej1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Socket cliente = new Socket("Localhost", 5000);
			System.out.println("Estableciendo conexion.");

			OutputStream os = cliente.getOutputStream();
//			BufferedWriter writer = new BufferedWriter(new OutputStream(cliente.getOutputStream()));

			System.out.print("Puede mandar el texto:");
			String leer = sc.nextLine();
			os.write(leer.getBytes());

			System.out.println("Mensaje enviado.");
			cliente.close();
			System.out.println("Terminado.");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}