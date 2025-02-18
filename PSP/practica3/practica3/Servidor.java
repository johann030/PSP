package practica3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor extends Thread {

	public void crearServidor() {

		System.out.println("Inicializando servidor");

		try (Scanner sc = new Scanner(System.in);
				ServerSocket server = new ServerSocket(5555);
				Socket socket = server.accept();
				OutputStream os = socket.getOutputStream();

				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {

			System.out.println("Servidor en linea.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void gestionClientes() {
		
	}

	@Override
	public void run() {

	}

}
