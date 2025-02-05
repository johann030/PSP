package u3.j3.ej;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente extends Thread {
	private String nombre;

	public Cliente() {

	}

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void meterCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digame su nombre: ");
		String nombreCl = sc.nextLine();
		Cliente cl = new Cliente(nombreCl);

		try (Socket cliente = new Socket("Localhost", 1313);
				OutputStream os = cliente.getOutputStream();
				InputStream is = cliente.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {

			String lineas;

			while ((lineas = br.readLine()) != null) {
				System.out.println(lineas);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

	@Override
	public void run() {
		meterCliente();
	}
}