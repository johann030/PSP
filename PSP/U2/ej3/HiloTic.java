package ej3;

public class HiloTic extends Thread {
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println("TIC");
			}
		} catch (Exception e) {

		}
	}
}