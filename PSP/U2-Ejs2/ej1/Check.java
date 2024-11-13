package ej1;

public class Check extends Thread{
	private int numero = 10;
	public void run() {
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
	}
}