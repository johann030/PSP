package u2Cristina.ej3.ej1;

import java.util.Random;

public class Cliente implements Runnable {

	Puerta puerta;
	Almacenes almacen;
	String nombre;
	Random generador;
	final int MAX_INTENTOS = 10;

	public Cliente(Puerta p, Almacenes a, String nombre) {
		this.puerta = p;
		this.almacen = a;
		this.nombre = nombre;
		generador = new Random();
	}

	public void esperar() {
		try {
			int espera = generador.nextInt(100);
			Thread.sleep(espera);
		} catch (InterruptedException ex) {
			System.out.println("Fall� la espera");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < MAX_INTENTOS; i++) {
			if (!puerta.estaOcupada()) {
				if (puerta.intentarEntrar()) {
					esperar();
					puerta.liberarPuerta();
					if (almacen.cogerProducto()) {
						System.out.println(this.nombre + ": coge un producto! en el intento " + i);
						return;
					} else {
						System.out.println(this.nombre + ": ops, cruzo pero no cogio nada");
						return;
					} 
				} 
			} else {
				esperar();
			}

		} // Fin del for
			// Se super� el m�ximo de reintentos y abandonamos
		System.out.println(this.nombre + ": lo intento muchas veces y no pude");
	}

}