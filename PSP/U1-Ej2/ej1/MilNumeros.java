package ej1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MilNumeros {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que permita sumar los datos de un fichero dado
		 * “numeros.dat” que contiene 1000 números enteros, cada uno de estos números se
		 * encontrará en una línea diferente. El usuario deberá decidir desde qué número
		 * hasta qué número debe sumar el programa, por lo que estos dos valores se
		 * pedirán por teclado. El programa principal mostrará la suma total.
		 */
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
			System.out.println("dentro hijo");
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