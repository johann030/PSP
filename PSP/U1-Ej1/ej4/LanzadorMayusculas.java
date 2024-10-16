package ej4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

//Proceso padre
public class LanzadorMayusculas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder pb;
		Process proceso;
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		String linea;

		// Entrada del padre ---> Salida del hijo
		OutputStream os;
		OutputStreamWriter osw;
		PrintWriter pw;
		Scanner sc = new Scanner(System.in);

		try {

			// creo y ejecuto el proceso
			pb = new ProcessBuilder(args);
			proceso = pb.start();

			System.out.println("Introduzca el texto:");
			String texto = sc.nextLine();
			
			// Utilizo las buffer de salida para pasar la entrada estandar al hijo(System.in)
			os = proceso.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			pw.println(texto);
			
			pw.flush();
			pw.close();
			osw.close();
			os.close();

			// Utilizo las buffer de entrada para leer la informacion que el hijo lea en
//			su salida estandar(System.out)
			
			is = proceso.getInputStream();
			// lo convertimos al tipo de dato de leido
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
	
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}