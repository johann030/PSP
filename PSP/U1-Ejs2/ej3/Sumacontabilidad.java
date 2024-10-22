package ej3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Sumacontabilidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		String lineas;
		int suma = 0;
		
		String[] archivos= {"Archivos/comercio.txt"};
		
		String leerArchivos = String.join(","+archivos);
		try {
			br = new BufferedReader(new FileReader("Archivos/comercio.txt"));
			while ((lineas = br.readLine()) != null) {
				suma =  Integer.parseInt(lineas) + suma;
			}
			System.out.println(suma);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
