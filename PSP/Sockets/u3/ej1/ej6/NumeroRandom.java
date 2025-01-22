package u3.ej1.ej6;

public class NumeroRandom {

	public static void main(String[] args) {

		ClienteNumeroRandom cl = new ClienteNumeroRandom();
		ServidorNumeroRandom s = new ServidorNumeroRandom();
		s.servidor();
		cl.cliente();
	}
}