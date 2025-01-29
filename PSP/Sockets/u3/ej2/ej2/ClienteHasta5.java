package u3.ej2.ej2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteHasta5 {
	private String usuario;
	private int contrasenia;

	public static void main(String[] args) {
		System.out.println("Conectando al servidor...");
//		ArrayList<Socket> n = new ArrayList<>(5);
		try (Scanner sc = new Scanner(System.in);
				Socket cliente = new Socket("Localhost", 5000);
				OutputStream os = cliente.getOutputStream();
				InputStream is = cliente.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {

			System.out.println("Conexion establecida.");
			for (int i = 1; i <= 5; i++) {
				Socket cl = new Socket("Localhost", 5000);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
