package ud2.ejemplos.u6;

public class Buffer {
	private char contenido;
	private boolean disponible = false;

	public Buffer() {
	}
	/*
	 * public char recoger(){ if(disponible){ disponible=false; return contenido; }
	 * return ('\t'); } public void poner(char c){ contenido=c; disponible=true; }
	 */

	public synchronized char recoger() {
		while (disponible == false) {
			try {
				wait();
			} catch (InterruptedException ex) {
			}
		}
		disponible = false;
		notifyAll();
		return contenido;
	}

	public synchronized void poner(char valor) {
		while (disponible == true) {
			try {
				wait();
			} catch (InterruptedException ex) {
			}
		}
		// Puedes producir y produces
		contenido = valor;
		disponible = true;
		// notifica o libera a todos los hilos que est�n en la cola de bloqueados
		notifyAll();
	}

}