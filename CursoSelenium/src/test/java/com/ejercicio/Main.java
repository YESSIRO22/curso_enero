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
		
	/*	System.out.println("Ingrese la altura: ");
	 * 
	 //
		sc=new Scanner(System.in);
		double alturaPared=sc.nextDouble();
		
		System.out.println("Ingrese el ancho: ");
		sc1=new Scanner(System.in);
		double anchoPared=sc1.nextDouble(); */
		
	/*	System.out.println("Ingrese el area total a pintar: ");
		sc1=new Scanner(System.in);
		double areaPared=sc1.nextDouble();
		
		System.out.println("Ingrese el area que cubre la pintura a comprar: ");
		sc2=new Scanner(System.in);
		double areaAbarcaPintura=sc2.nextDouble();
		
		/*System.out.println("Ingrese los tachos de pintura extra: ");
		sc3=new Scanner(System.in);
		int pinturasExtras=sc3.nextInt();
	
		int comprar=calculaPintura.getBucketCount(alturaPared, anchoPared, areaAbarcaPintura, pinturasExtras);
		
		int comprar=calculaPintura.getBucketCount(alturaPared, anchoPared, areaAbarcaPintura);*/
		
	/*	int comprar=calculaPintura.getBucketCount(areaPared,areaAbarcaPintura);
		
		
		if(comprar >0) {
		System.out.println("Necesita comprar "+comprar+" tachos de pintura.");
		}
		else {
			System.out.println("No necesita comprar pintura");
		}
		*/
		
		/*System.out.println("Ingrese el mes con numero: ");
		sc=new Scanner(System.in);
		int mesNumero=sc.nextInt();
		
		System.out.println("Ingrese el año: ");
		sc1=new Scanner(System.in);
		int anioNumero=sc1.nextInt();
		
		int cantidadDias=diasDelMes.getDaysInMonth(mesNumero, anioNumero);
	
		System.out.println("El mes tiene "+cantidadDias+" dias.");*/
		
		
		//metodos getters and setters
		/*
		Persona persona = new Persona();
		persona.setFirstName(""); // firstName se establece en una cadena vacía
		persona.setLastName(""); // lastName se establece en una cadena vacía
		persona.setAge(10);
		System.out.println("fullName= " + persona.getFullName());
		System.out.println("adolescente= " + persona.isTeen());
		persona.setFirstName("Juan"); // firstName se establece en John
		persona.setAge(18);
		System.out.println("fullName= " + persona.getFullName());
		System.out.println("adolescente= " + persona.isTeen());
		persona.setLastName("Smith"); // lastName se establece en Smith
		System.out.println("fullName= " + persona.getFullName());*/
		
		SImpleCalculator calculator = new SImpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());

	}

	}
