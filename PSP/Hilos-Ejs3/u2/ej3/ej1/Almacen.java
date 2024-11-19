package u2.ej3.ej1;

public class Almacen {
	private int productos;

	public Almacen(int productos) {
		this.productos = productos;
	}

	public boolean cogerProducto() {
		if (this.productos > 0) {
			this.productos--;
			return true;
		}
		return false;
	}
}