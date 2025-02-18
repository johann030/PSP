package practica3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Clientes {
	private int num1, num2, resultado;

	public void conectarClientes() {
		try (Scanner sc = new Scanner(System.in);
				Socket cliente = new Socket("Localhost", 5555);
				OutputStream os = cliente.getOutputStream();
				InputStream is = cliente.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void menuOperaciones() {

		try {
			Scanner sc = new Scanner(System.in);

			String operacion;

			do {
				menu();
				operacion = sc.nextLine();

				switch (operacion) {
				case "+":
					suma();

					break;
				case "-":
					resta();

					break;
				case "*":
					multiplicacion();

					break;
				case "/":
					division();

					break;

				default:
					System.err.println("Dato dado incorrecto, escriba una de las opciones dadas.");
				}
			} while (!operacion.equalsIgnoreCase("salir"));

			sc.close();

		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void menu() {
		System.out.println("--------------------------");
		System.out.println("Suma. (+)");
		System.out.println("Resta. (-)");
		System.out.println("Multiplicacion. (*)");
		System.out.println("Division. (/)");
		System.out.println("Importante, poner el signo.");
		System.out.println("Salir.");
		System.out.println("--------------------------");
	}

	public void suma() {
		// TODO las operaciones las tiene que hacer el servidor
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("----SUMA----");
			System.out.print("Deme el primer numero: ");
			num1 = sc.nextInt();
			System.out.print("\nDeme el segundo numero: ");
			num2 = sc.nextInt();

			resultado = num1 + num2;

			System.out.println("Suma = " + resultado);
		}
	}

	public void resta() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("----RESTA----");
			System.out.print("Deme el primer numero: ");
			num1 = sc.nextInt();
			System.out.print("\nDeme el segundo numero: ");
			num2 = sc.nextInt();

			resultado = num1 - num2;

			System.out.println("Resta = " + resultado);
		}
	}

	public void division() {
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("----DIVISION----");
				System.out.print("Deme el primer numero: ");
				num1 = sc.nextInt();
				System.out.print("\nDeme el segundo numero: ");
				num2 = sc.nextInt();

				if (num2 != 0) {
					resultado = num1 / num2;

					System.out.println("Division = " + resultado);
				} else if (num2 == 0) {
					System.err.println("No se puede dividir entre 0.");
				}
			} while (num2 == 0);

		} catch (ArithmeticException e) {
			System.err.println("No se puede dividir entre 0. ");
		}
	}

	public void multiplicacion() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("----MULTIPLICACION----");
			System.out.print("Deme el primer numero: ");
			num1 = sc.nextInt();
			System.out.print("\nDeme el segundo numero: ");
			num2 = sc.nextInt();

			resultado = num1 * num2;

			System.out.println("Multiplicacion = " + resultado);
		}
	}
}