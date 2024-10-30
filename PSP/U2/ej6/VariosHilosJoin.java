package ej6;

import ej3.HiloC;

public class VariosHilosJoin {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 5; i++) {
				HiloC H = new HiloC(i);
				H.start();
				H.join();
			}

			System.out.println("Todos los hilos creados.");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}