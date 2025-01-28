package u3.ej2.ej1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorConexion {
	public static void main(String[] args) {
		String linea;
		System.out.println("Iniciando servidor...");
		try (Scanner sc = new Scanner(System.in);
				ServerSocket server = new ServerSocket(5000);
				Socket socket = server.accept();
				OutputStream os = socket.getOutputStream();
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {

			System.out.println("Servidor conectado.");

			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
