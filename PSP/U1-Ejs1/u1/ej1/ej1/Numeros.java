package u1.ej1.ej1;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int divisor = 1;
		
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cont++;
			}
		}
		System.out.println("Tiene " + cont + " divisores.");
		sc.close();
	}

}
