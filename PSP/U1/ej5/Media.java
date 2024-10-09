package ej5;

import java.util.Scanner;

//Proceso hijo
public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double numeros;
		double sumando = 0;
		int cont = 0;
		do {
			numeros = sc.nextDouble();
			if (numeros != 0) {
				sumando = sumando + numeros;
				cont++;
			}
		} while (numeros != 0);

		Double media = sumando / cont;
		System.out.println("La media es: " + media);
		System.out.println(cont);
		System.out.println(sumando);
		sc.close();
	}
}