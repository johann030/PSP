package u3.ej1.ej5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Conectando con servidor...");
		try (Scanner sc = new Scanner(System.in); Socket cliente = new Socket("Localhost", 5000);) {
			System.out.println("Conexion estableciada.");

			OutputStream os = cliente.getOutputStream();

			System.out.print("Introduzca la cuanta atras: ");
			int leer = sc.nextInt();
			os.write(leer);

			InputStream is = cliente.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			int linea;

			while ((linea = br.read()) != 0) {
				System.out.println("Cuenta regresiva: " + linea);
			}

			cliente.close();
			System.out.println("Desconectado del servidor.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
