package com.java;

import java.util.Scanner;

public class printMegaBytesAndKiloBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kiloBytes;
		String resultado;
		
		System.out.println("Ingrese el valor de kilobytes: ");
		Scanner sc= new Scanner(System.in);
		kiloBytes=sc.nextInt();
		
		if (kiloBytes > 0 ) {
			resultado=printMegaBytesAndKiloBytes(kiloBytes);
			System.out.println(resultado);
			
		}
		else {
			System.out.println("El valor ingresado es inválido.");
		}
}
	
	public static String printMegaBytesAndKiloBytes(int kiloBytes) {
		int megaBytes=kiloBytes/1024;
		int resto=kiloBytes%1024;
		String resultado;
		
		return resultado=kiloBytes+" KB = "+megaBytes+" MB y "+resto+" KB";
		
	}
	}