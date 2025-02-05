package u3.j3.ej;

public class SalaDeChat {
	public static void main(String[] args) {
		Cliente cl = new Cliente();
		Servidor se = new Servidor();
		se.crearServer();
		cl.run();
	}
}