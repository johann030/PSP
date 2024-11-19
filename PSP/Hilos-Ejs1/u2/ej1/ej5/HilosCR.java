package u2.ej1.ej5;

public class HilosCR implements Runnable {

	private int c;

	public HilosCR(int c) {
		this.c = c;
		System.out.println("Creando hilo " + c);
	}

	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Hilo " + this.c + " linea " + (i));
		}

	}
}