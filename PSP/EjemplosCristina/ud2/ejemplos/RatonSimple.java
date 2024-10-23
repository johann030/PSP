package ud2.ejemplos;

public class RatonSimple extends Thread {
	private String nombre;
	private int tiempoAlimentacion;
	private int alimentoConsumido;

	public RatonSimple(String nombre, int tiempoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tiempoAlimentacion = tiempoAlimentacion;
	}

	public void comer() {
		try {
			System.out.printf("El rat�n %s ha comenzado a alimentarse%n", nombre);
			Thread.sleep(tiempoAlimentacion * 1000);
			System.out.printf("El rat�n %s ha terminado a alimentarse%n", nombre);
			System.out.printf("Alimento consumido: $d%n", alimentoConsumido);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		this.comer();
	}

	public static void main(String[] args) {
		RatonMH_IR fievel = new RatonMH_IR("Fievel", 4);
		RatonMH_IR jerry = new RatonMH_IR("Jerry", 5);
		RatonMH_IR pinky = new RatonMH_IR("Pinky", 3);
		RatonMH_IR mickey = new RatonMH_IR("Mickey", 6);
		new Thread(fievel).start();
		new Thread(jerry).start();
		new Thread(pinky).start();
		new Thread(mickey).start();
	}
}
