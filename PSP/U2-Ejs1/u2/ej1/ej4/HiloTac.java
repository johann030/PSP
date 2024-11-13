package u2.ej1.ej4;

public class HiloTac extends Thread {

	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println("TAC");
				Thread.sleep(1000);
			}
		} catch (Exception e) {

		}
	}
}