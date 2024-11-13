package u1.ej2.ej1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MilNumerosLanzador {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder(args);
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;

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

			int num1, num2, resultado = 0;
			System.out.println("Introduzca el primer numero: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca el segundo numero: ");
			num2 = sc.nextInt();

			pw.println(resultado);
			
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