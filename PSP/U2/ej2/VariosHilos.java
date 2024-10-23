package ej2;

public class VariosHilos {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			HiloC H = new HiloC(i);
			H.start();
		}
		System.out.println("Todos los hilos creados.");
	}
}