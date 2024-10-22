package ej5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class LanzadorMedia {
//Proceso padre
	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder(args);
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;

		// Entrada del padre --> salida del hijo
		OutputStream os;
		OutputStreamWriter osw;
		PrintWriter pw;

		try {
			Process proceso = pb.start();
			is = proceso.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			os = proceso.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);

			Scanner sc = new Scanner(System.in);
			int numeros;
			System.out.println("Introduzca el numero: ");
			numeros = sc.nextInt();
			while (numeros != 0) {
				pw.println(numeros);
				pw.flush();
				System.out.println("Dame otro numero");
				numeros = sc.nextInt();
			}
			pw.println(numeros);
			pw.flush();

			pw.close();
			osw.close();
			os.close();

			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

			br.close();
			isr.close();
			is.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}