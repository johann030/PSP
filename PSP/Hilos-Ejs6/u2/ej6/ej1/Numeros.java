package u2.ej6.ej1;

public class Numeros extends Thread {
	private int num1 = 0;
	private int num2 = 100;

	public int sumar() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hilo 1: " + num1);
			num1 = num1 + 1;
		}
		return num1;
	}

	public int restar() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hilo 2: " + num2);
			num2 = num2 - 1;
		}
		return num2;
	}

	public void run() {
		sumar();
		restar();

	}

}
