package u2.ej6.ej3;

public class HiloSensor extends Thread {
	private int temperatura;
	private int humedad;

	public int temperatura() {
		temperatura = (int) (Math.random() * 50) + 1;
		return temperatura;
	}

	public int humedad() {
		humedad = (int) (Math.random() * 50) + 1;
		return humedad;
	}

	@Override
	public void run() {
		temperatura();
		humedad();
	}
}