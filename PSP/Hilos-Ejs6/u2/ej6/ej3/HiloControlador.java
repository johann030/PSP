package u2.ej6.ej3;

public class HiloControlador extends Thread {
	public HiloSensor HS;

	public void medir() {
		if (HS.temperatura() >= 25 && HS.humedad() >= 40) {
			System.out.println("Hace calor.");
		} else {
			System.out.println("Hace frio.");
		}
	}

	@Override
	public void run() {
		medir();
	}

}
