package u2.ej2.ej2;

public class Banco {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1000, 4);
		Cliente cl1 = new Cliente(cuenta, 20,2);
		Cliente cl2 = new Cliente(cuenta,2,2);
		
		cl1.getCuenta().comprobarSaldo();
		cl1.getCuenta().quitarSaldo(20);
		cl2.getCuenta().quitarSaldo(60);
		cl1.getCuenta().comprobarSaldo();
		
	}

}
