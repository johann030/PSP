package u2.ej1.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Suma10Numeros extends Thread {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> numeros = new ArrayList<>();
	int cont = 0;
	int num;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();
			cont = cont + num;
			numeros.add(num);
		}
		System.out.println(numeros);
		System.out.println("Esta es la suma total del array: " + cont);
	}
}
