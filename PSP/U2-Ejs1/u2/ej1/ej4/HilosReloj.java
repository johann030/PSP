package u2.ej1.ej4;

public class HilosReloj {

	public static void main(String[] args) {
		HiloTac Htac = new HiloTac();
		HiloTic Htic = new HiloTic();
		try {
			Htic.start();
			Thread.sleep(1000);
			Htac.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}