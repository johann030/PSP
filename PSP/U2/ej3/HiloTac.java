package ej3;

public class HiloTac extends Thread {
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println("TAC");
			}
		} catch (Exception e) {

		}
	}
}