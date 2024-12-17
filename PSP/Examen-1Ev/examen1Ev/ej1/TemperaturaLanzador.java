package examen1Ev.ej1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

//Proceso padre

public class TemperaturaLanzador {

	static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ProcessBuilder pb = new ProcessBuilder(args);
		Process proceso;
		OutputStream os;
		OutputStreamWriter osw;
		PrintWriter pw;

		InputStream is;
		InputStreamReader isr;
		BufferedReader br;

		int numCiudad;
		String nombre;
		int temperatura;

		try {
			proceso = pb.start();

			// Escribir en el scanner del hijo
			os = proceso.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);

			// Pedir la cantidad de ciudades
			do {
				System.out.println("Digame el numero de la ciudades que quiere registrar la temperatura: ");
				numCiudad = sc.nextInt();
				sc.nextLine();

			} while (!(numCiudad >= 3 && numCiudad <= 10));

			// Pedir los datos
			for (int i = 0; i < numCiudad; i++) {
				System.out.println("Digame el nombre de la ciudad: ");
				nombre = sc.nextLine();

				System.out.println("Digame la temperatura en la ciudad: ");
				temperatura = sc.nextInt();
				sc.nextLine();

				pw.print(nombre);
				pw.flush();
				pw.print(temperatura);

			}

			pw.flush();
			pw.close();
			osw.close();
			os.close();

			// Leer el syso del hijo
			is = proceso.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			System.out.println("El listado de las ciudades con sus temperaturas: ");
			String lineas;
			while ((lineas = br.readLine()) != null) {
				System.out.println(lineas);
			}

			br.close();
			isr.close();
			is.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}