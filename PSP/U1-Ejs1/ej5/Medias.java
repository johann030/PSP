package ej5;

import java.util.Scanner;

//Proceso hijo
public class Medias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeros;
		int sumando = 0;
		int cont = 0;
		do {
			numeros = sc.nextInt();
			if (numeros != 0) {
				sumando = sumando + numeros;
				cont++;
			}
		} while (numeros != 0);

		int media = sumando / cont;
		System.out.println("La media es: " + media);
		System.out.println(cont);
		System.out.println(sumando);
		sc.close();
	}
}