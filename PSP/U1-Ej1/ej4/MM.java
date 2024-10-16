package ej4;

import java.util.Scanner;

public class MM {
	// Proceso hijo
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String texto = sc.nextLine();
			System.out.print(texto.toUpperCase() + " ");
			sc.close();
	}
}