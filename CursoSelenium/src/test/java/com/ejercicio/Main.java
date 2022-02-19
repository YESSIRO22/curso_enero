package com.ejercicio;

import java.util.Scanner;
import com.ejercicio.isLeapYear;
import com.ejercicio.calculaArea;
import com.ejercicio.calculaPintura;

public class Main {

	private static Scanner sc;
	private static Scanner sc1;
	private static Scanner sc2;
	private static Scanner sc3;
	
	public static void main(String[] args) {

	/*	int anio;

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
		
		System.out.println("Ingrese la altura: ");
		sc=new Scanner(System.in);
		double alturaRectangulo=sc.nextDouble();
		
		System.out.println("Ingrese el ancho: ");
		sc1=new Scanner(System.in);
		double anchoRectangulo=sc1.nextDouble();
		
		System.out.println("El area del rectangulo es "+calculaArea.area(alturaRectangulo,anchoRectangulo));
		*/
		
		System.out.println("Ingrese la altura: ");
		sc=new Scanner(System.in);
		double alturaPared=sc.nextDouble();
		
		System.out.println("Ingrese el ancho: ");
		sc1=new Scanner(System.in);
		double anchoPared=sc1.nextDouble();
		
		System.out.println("Ingrese el area que cubre la pintura a comprar: ");
		sc2=new Scanner(System.in);
		double areaAbarcaPintura=sc2.nextDouble();
		
		System.out.println("Ingrese los tachos de pintura extra: ");
		sc3=new Scanner(System.in);
		int pinturasExtras=sc3.nextInt();
		
		int comprar=calculaPintura.getBucketCount(alturaPared, anchoPared, areaAbarcaPintura, pinturasExtras);
		if(comprar >0) {
		System.out.println("Necesita comprar "+calculaPintura.getBucketCount(alturaPared, anchoPared, areaAbarcaPintura, pinturasExtras)+" tachos de pintura.");
		}
		else {
			System.out.println("No necesita comprar pintura");
		}
	}

}
