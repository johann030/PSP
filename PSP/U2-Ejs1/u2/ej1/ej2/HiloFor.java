package u2.ej1.ej2;

public class HiloFor extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Estoy dentro del hilo.");
		}
	}
}