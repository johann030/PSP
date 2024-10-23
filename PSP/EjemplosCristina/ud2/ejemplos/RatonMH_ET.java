package ud2.ejemplos;

public class RatonMH_ET extends Thread {
	private String nombre;
	private int tiempoAlimentacion;

	public RatonMH_ET(String nombre, int tiempoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tiempoAlimentacion = tiempoAlimentacion;
	}

	public void comer() {
		try {
			System.out.printf("El rat�n %s ha comenzado a alimentarse%n", nombre);
			Thread.sleep(tiempoAlimentacion * 1000);
			System.out.printf("El rat�n %s ha terminado a alimentarse%n", nombre);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		this.comer();
	}

	public static void main(String[] args) {
		RatonMH_ET fievel = new RatonMH_ET("Fievel", 4);
		RatonMH_ET jerry = new RatonMH_ET("Jerry", 5);
		RatonMH_ET pinky = new RatonMH_ET("Pinky", 3);
		RatonMH_ET mickey = new RatonMH_ET("Mickey", 6);
		fievel.start();
		jerry.start();
		pinky.start();
		mickey.start();
	}
}