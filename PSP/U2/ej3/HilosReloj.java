package ej3;

public class HilosReloj {

	public static void main(String[] args) {
		HiloTac Htac = new HiloTac();
		HiloTic Htic = new HiloTic();
		Htac.start();
		Htic.start();
	}
}