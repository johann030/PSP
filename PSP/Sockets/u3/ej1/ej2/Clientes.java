package u3.ej1.ej2;

import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Clientes {

	public static void crearClientes() {
		Clientes[] clientes = new Clientes[4];
//		ArrayList<Clientes> clientes2 = new ArrayList<>();

		System.out.println("Conectando los clientes al servidor...");
		try (Socket Cliente = new Socket("Localhost", 5000)) {
			System.out.println("Conexion con el servidor establecida correctamente.");
			for (int i = 0; i < clientes.length; i++) {

				OutputStream os = Cliente.getOutputStream();
				String mensaje = "\nHola soy el Cliente " + i;
				os.write(mensaje.getBytes());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

//		try (Socket Cliente = new Socket("Localhost", 5000)) {
//			System.out.println("Conexion con el servidor establecida correctamente.");
//			for (Clientes Clientes : clientes2) {
//				OutputStream os = Cliente.getOutputStream();
//				String mensaje = "\nHola soy el Cliente " + Clientes;
//				os.write(mensaje.getBytes());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

	public static void main(String[] args) {
		crearClientes();
	}
}