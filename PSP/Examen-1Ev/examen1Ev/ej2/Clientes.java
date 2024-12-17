package examen1Ev.ej2;

public class Clientes extends Thread {
	private String nombre;
	private Almacen almacen;

	public Clientes(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public void run() {
		consultarStock();
		comprarArticulo();
	}

	public void consultarStock() {
		System.out.println("Hay " + almacen.getStockIncial() + " unidades. El stock mostrado es orientativo.");
		comprarArticulo();
	}

	public synchronized void comprarArticulo() {
		// Me falta reducir el stock para que funcione todo
		int menos = almacen.getStockIncial();

		menos--;
		System.out.println(menos);
		if (menos == 0) {
			almacen.sinStock();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
}