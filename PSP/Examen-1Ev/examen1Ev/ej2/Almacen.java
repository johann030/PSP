package examen1Ev.ej2;

public class Almacen {
	private int stockIncial;

	public Almacen(int stockIncial) {
		this.stockIncial = stockIncial;
	}

	public void sinStock() {
		System.out.println("Articulo sin stock.");
	}

	public int getStockIncial() {
		return stockIncial;
	}

	public void setStockIncial(int stockIncial) {
		this.stockIncial = stockIncial;
	}

}
