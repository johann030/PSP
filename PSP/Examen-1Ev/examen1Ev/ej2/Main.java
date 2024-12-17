package examen1Ev.ej2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numClientes;

		System.out.println("Introduzca el numero de clientes:");
		numClientes = sc.nextInt();

		for (int i = 0; i < numClientes; i++) {
			try {
				Almacen almacen = new Almacen(10);
				Clientes cliente = new Clientes(almacen);
				cliente.start();
				cliente.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}
}