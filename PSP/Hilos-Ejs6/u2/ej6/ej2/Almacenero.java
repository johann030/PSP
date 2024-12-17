package u2.ej6.ej2;

public class Almacenero extends Thread {
	Almacen almacen;

	public synchronized void reponer() {
		almacen.setNumGalletas(10);
		System.out.println("He repuesto 10 galletas.");
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			reponer();
		}
	}
}