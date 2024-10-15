package ej1Correcion;

//Este es el proceso hijo
public class Divisores {

	public static void main(String[] args) {
		int num = 0;
		int divisores = 0;
		if (args.length == 0) {
			System.out.println("No ha pasado ninguna variable");
		} else {
			num = Integer.parseInt(args[0]);
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					divisores++;
				}
			}
		}
		System.out.println("El numero " + num + " tiene " + divisores + " divisores.");
	}

}
