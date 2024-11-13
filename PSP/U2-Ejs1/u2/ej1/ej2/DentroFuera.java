package u2.ej1.ej2;

public class DentroFuera {

	public static void main(String[] args) {
		HiloFor hf1 = new HiloFor();

		hf1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Estoy fuera del hilo");
		}
	}
}