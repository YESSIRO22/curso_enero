package com.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class areEqualByThreeDecimalPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Ingrese el primer número: ");	
		Scanner sc = new Scanner(System.in);
		double numeroA = sc.nextDouble();
		
		System.out.println("Ingrese el segundo número: ");	
		Scanner sc1 = new Scanner(System.in);
		double numeroB = sc.nextDouble();
		
		
		boolean iguales= resultado(numeroA,numeroB);
		
		
		if (iguales) {
			System.out.println("Los numeros "+numeroA+ " y "+numeroB+ " tienen hasta 3 decimales iguales");
		}else {
			System.out.println("Los decimales de los numeros "+numeroA+ " y "+numeroB+ " son distintos");
		}
	}

	private static boolean resultado(double numeroA, double numeroB) {
		
		DecimalFormat formatoA=new DecimalFormat("#.###");	
		DecimalFormat formatoB=new DecimalFormat("#.###");
		
		if(numeroA==numeroB) {
			return true;
		}
		else if(formatoA==formatoB) {
			return true;
		}
		else {
			return false;
		}
		}
	}