package u3.ej2.ej2;

public class ServidorHasta5 {

	public static void main(String[] args) {
		int contraRandom;
		for (int i = 0; i < 60; i++) {
			contraRandom = (int) (Math.random() * (9999 - 1000)) + 1000;
			System.out.println(contraRandom);
		}
	}

}
