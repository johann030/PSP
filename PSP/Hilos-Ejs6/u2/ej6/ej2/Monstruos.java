package u2.ej6.ej2;

public class Monstruos extends Thread {
	private int comerGalletas = (int) Math.random();
	Almacen almacen;

	public synchronized void comer() {
		if (almacen.getNumGalletas() > 0) {
			almacen.setNumGalletas(almacen.getNumGalletas() - comerGalletas);
		}

		while (almacen.getNumGalletas() > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void run() {
		comer();
	}
}