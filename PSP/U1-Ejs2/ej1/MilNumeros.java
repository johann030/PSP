package ej1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MilNumeros {
	//TODO

	public static void main(String[] args) {
		String lineas;
		BufferedReader br = null;
		int num1;
		int num2;
		int suma;
		int cont = 0;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		try {
			br = new BufferedReader(new FileReader("numeros.dat"));

			num1 = sc.nextInt();

			num2 = sc.nextInt();
			while ((lineas = br.readLine()) != null) {
				if((cont >= num1) && (cont <= num2)) {
					suma = Integer.parseInt(lineas);
					resultado = resultado + suma;
				}
				cont++;
			}

			System.out.println("La suma entre el numero " + num1 + " y el numero " + num2 + " es = " + resultado);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		sc.close();
	}
}