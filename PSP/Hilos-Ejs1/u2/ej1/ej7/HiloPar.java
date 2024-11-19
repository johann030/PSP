package u2.ej1.ej7;

public class HiloPar implements Runnable {

	private int pares;
	int cont;

	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println();
			}
		}
	}
}