package u3.ej1.ej6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteNumeroRandom {

	public static void main(String[] args) {

	}

	public void cliente() {
		System.out.println("Conectando al servidor...");
		try (Scanner sc = new Scanner(System.in);
				Socket cliente = new Socket("Localhost", 5555);
				OutputStream os = cliente.getOutputStream();
				InputStream is = cliente.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {
			System.out.println("Conexion establecida.");
			
			System.out.println();

			System.out.println("Desconectando del servidor...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Desconectado del servidor.");
	}

}
