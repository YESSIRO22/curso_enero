package com.ejercicio;

import java.util.Scanner;
import com.ejercicio.isLeapYear;
import com.ejercicio.calculaArea;

public class Main {

	private static Scanner sc;
	private static Scanner sc1;
	
	public static void main(String[] args) {

		int anio;

		System.out.println("Ingrese un año: ");
		sc = new Scanner(System.in);
		anio=sc.nextInt();

		// isLeapYear.isLeapYear2(anio);
		boolean year=isLeapYear.isLeapYear2(anio);		

		if(year){
		System.out.println("El año ingresado es bisiesto");
		}
		else{
		System.out.println("El año ingresado no es bisiesto");
		}
		/*
		System.out.println("Ingrese el valor de radio: ");
		sc=new Scanner(System.in);
		double radioCirculo=sc.nextDouble();
		
		
		System.out.println("El area del circulo es "+calculaArea.area(radioCirculo));
		*/
		System.out.println("Ingrese la altura: ");
		sc=new Scanner(System.in);
		double alturaRectangulo=sc.nextDouble();
		
		System.out.println("Ingrese el ancho: ");
		sc1=new Scanner(System.in);
		double anchoRectangulo=sc1.nextDouble();
		
		System.out.println("El area del rectangulo es "+calculaArea.area(alturaRectangulo,anchoRectangulo));
	}

}
