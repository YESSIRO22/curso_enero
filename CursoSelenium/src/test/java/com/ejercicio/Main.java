package com.ejercicio;

import java.util.Scanner;
import com.ejercicio.isLeapYear;

public class Main {

	private static Scanner sc;
	
	public static void main(String[] args) {

		int anio;

		System.out.println("Ingrese un a�o: ");
		sc = new Scanner(System.in);
		anio=sc.nextInt();

		// isLeapYear.isLeapYear2(anio);
		boolean year=isLeapYear.isLeapYear2(anio);		

		if(year){
		System.out.println("El a�o ingresado es bisiesto");
		}
		else{
		System.out.println("El a�o ingresado no es bisiesto");
		}
	}

}
