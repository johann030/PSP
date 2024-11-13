package u2.ej2.ej2;

public class Banco {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1000, 4);
		Cliente cl1 = new Cliente(2,2);
		Cliente cl2 = new Cliente(2,2);
		
		cuenta.saldo();
		
	}

}
