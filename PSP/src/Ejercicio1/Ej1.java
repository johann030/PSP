package Ejercicio1;

import java.io.IOException;

public class Ej1 {
	public static void main(String[] args) {
		ProcessBuilder pr = new ProcessBuilder("notepad.exe");
		try {
			for(int i = 0; i< 10; i++) {
				pr.start();
			}
			System.out.println("Acabo " + pr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		try {
//			String[] infoPr2= {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"};
//			for(int i = 0; i< 10; i++) {
//				Process pr2 = Runtime.getRuntime().exec(infoPr2);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
