package ej1;

import java.io.BufferedReader;
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
		int numeros;
		int num1;
		int num2;
		int suma;
		Scanner sc = new Scanner(System.in);
		try {
			BufferedReader br = new BufferedReader(new FileReader("numeros.dat"));

			
			System.out.println("Introduzca el primer numero");
			num1 = sc.nextInt();
			System.out.println("Introduzca el segundo numero");
			num2 = sc.nextInt();
			while((lineas = br.readLine()) != null) {
				System.out.println(lineas);
				if((numeros = br.read()) != -1) {
					
				}
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
