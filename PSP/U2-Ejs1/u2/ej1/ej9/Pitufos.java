package u2.ej1.ej9;

public class Pitufos extends Thread {

	private String nombres;

	public Pitufos(String nombre) {
		this.nombres = nombre;
	}

	public void run() {
		for (int i = 1; i < 4; i++) {
			System.out.println(nombres + " come un " + i + " pan con queso ");
		}
		System.out.println(nombres + " termino.");
	}
}