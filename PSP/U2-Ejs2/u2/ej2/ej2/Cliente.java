package u2.ej2.ej2;

public class Cliente {
	private Cuenta cuenta;
	private String nombre;
	private int cantidadRetirada, totalRetirada;

	Cliente(Cuenta cuenta, int cantidadRetirada, int totalRetirada) {
		this.cuenta = cuenta;
		this.cantidadRetirada = cantidadRetirada;
		this.totalRetirada = totalRetirada;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadRetirada() {
		return cantidadRetirada;
	}

	public void setCantidadRetirada(int cantidadRetirada) {
		this.cantidadRetirada = cantidadRetirada;
	}

	public int getTotalRetirada() {
		return totalRetirada;
	}

	public void setTotalRetirada(int totalRetirada) {
		this.totalRetirada = totalRetirada;
	}

}