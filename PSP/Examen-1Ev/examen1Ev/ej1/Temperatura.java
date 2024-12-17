package examen1Ev.ej1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Proceso hijo

public class Temperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numCiudad;
		String nombre;
		int temperatura;
		int alta = 0;
		int baja = 0;
		int promedio = 0;

		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter("temperatura.txt"));

			do {
				System.out.println("Digame el numero de la ciudades que quiere registrar la temperatura: ");
				numCiudad = sc.nextInt();
				sc.nextLine();

			} while (!(numCiudad >= 3 && numCiudad <= 10));

			// Pedir los datos

			for (int i = 1; i <= numCiudad; i++) {
				System.out.println("Digame el nombre de la ciudad: ");
				nombre = sc.nextLine();

				System.out.println("Digame la temperatura en la ciudad: ");
				temperatura = sc.nextInt();
				sc.nextLine();

				bw.write(nombre + ";" + temperatura);
				bw.newLine();

				promedio = (temperatura + promedio) / i;

				// Calcular temperaturas

				if (alta < temperatura) {
					alta = temperatura;
				}

				baja = temperatura;
				if (baja > temperatura) {
					baja = temperatura;
				}
			}
			bw.write("Temperatura media: " + promedio);
			bw.newLine();
			bw.write("Temperatura mas alta: " + alta);
			bw.newLine();
			bw.write("Temperatura mas baja: " + baja);

			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
