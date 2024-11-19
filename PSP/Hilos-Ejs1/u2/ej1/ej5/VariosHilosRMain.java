package u2.ej1.ej5;

public class VariosHilosRMain {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			HilosCR hcr = new HilosCR(i);
			Thread th = new Thread(hcr);
			th.start();
		}
	}
}