package ud2.ejemplos.EjemploProductorConsumidorDOS;

/*Tenemos un productor que va produciendo n�meros de uno en uno y una serie de consumidores que ir�n consumiendo dichos n�meros. 
 * El productor no podr� producir mas de un n�mero y los consumidores no podr�n consumir nada si no se ha producido antes.*/

public class ProductorConsumidor {
	private static Contenedor contenedor;
	private static Thread productor;
	private static Thread[] consumidores;
	private static final int CANTIDADCONSUMIDORES = 5;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		contenedor = new Contenedor();
		productor = new Thread(new Productor(contenedor, 1));
		consumidores = new Thread[CANTIDADCONSUMIDORES];

		for (int i = 0; i < CANTIDADCONSUMIDORES; i++) {
			consumidores[i] = new Thread(new Consumidor(contenedor, i));
			consumidores[i].start();
		}

		productor.start();
	}
}