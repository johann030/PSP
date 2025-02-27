package u2Cristina.ej3.ej1;


public class Puerta {
	boolean ocupada;

	Puerta() {
		this.ocupada = false;
	}

	public boolean estaOcupada() {
		return this.ocupada;
	}

	public synchronized void liberarPuerta() {
		this.ocupada = false;
	}

	public synchronized boolean intentarEntrar() {
		if (this.ocupada)
			return false;
		/*
		 * Si llegamos aqu�, la puerta estaba libre pero la pondremos a ocupada un
		 * tiempo y luego la volveremos a poner a "libre"
		 */
		this.ocupada = true;
		return true;
	}
}