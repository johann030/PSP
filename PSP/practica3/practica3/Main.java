package practica3;

public class Main {
	public static void main(String[] args) {
		Servidor s = new Servidor();
		s.crearServidor();
		Clientes c = new Clientes();
		c.menuOperaciones();
	}
}