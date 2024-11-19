package u2.ej2.ej2;

public class Cuenta {
	private int saldo, num_reintegros;

	Cuenta(int saldo, int num_reintegro) {
		this.saldo = saldo;
		this.num_reintegros = num_reintegro;
	}

	public int saldo() {
		return saldo;
	}

	public int quitarSaldo(int cantidad) {
		saldo = saldo - cantidad;
		return saldo;
	}

	public void comprobarSaldo() {
		System.out.println("Esto hay en la cuenta: " + saldo);
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNum_reintegros() {
		return num_reintegros;
	}

	public void setNum_reintegros(int num_reintegros) {
		this.num_reintegros = num_reintegros;
	}

}