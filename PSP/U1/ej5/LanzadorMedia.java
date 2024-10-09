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
		// TODO Auto-generated method stub
		ProcessBuilder pb;
		Process proceso;
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		String linea;
		double numero;
		
		//Entrada del padre --> salida del hijo
		OutputStream os;
		OutputStreamWriter osw;
		PrintWriter pw;
		Scanner sc = new Scanner(System.in);
		
		try {
			//creo y ejectuo el proceso
			pb = new ProcessBuilder(args);
			proceso = pb.start();
			
			System.out.println("Introduzca los numeros: ");
				 do {
					 numero = sc.nextDouble();
				 }while(numero != 0);
			
			
			//utilizo los buffers de salida para pasar la entrada estandar al hijo(System.in)
			os = proceso.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			pw.println(numero);
			
			pw.flush();
			pw.close();
			osw.close();
			os.close();
			
			//Utilizo los buffers de entrada para leer la info que el hijo lea en su salida estanda(System.out)
			is = proceso.getInputStream();
			//lo convertimos al tipo de dato leido
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
			br.close();
			isr.close();
			is.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
