package com.java;

import java.util.Scanner;

public class imprimirVerificadorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nro1;
		int nro2;
		int nro3;
		
		System.out.println("Ingrese un n�mero: ");
		Scanner sc=new Scanner(System.in);
		nro1=sc.nextInt();
		
		System.out.println("Ingrese un n�mero: ");
		Scanner sc2=new Scanner(System.in);
		nro2=sc2.nextInt();
		
		System.out.println("Ingrese un n�mero: ");
		Scanner sc3=new Scanner(System.in);
		nro3=sc3.nextInt();
		
		if((nro1>0) && (nro2>0) && (nro3>0)){
			if((nro1==nro2)&&(nro2==nro3)) {
				System.out.println("Todos los n�meros son iguales");
			}
			else if((nro1!=nro2) && (nro2!=nro3)&&(nro1!=nro3)) {
				System.out.println("Todos los n�meros son diferentes");
			}
			else {
				System.out.println("Ni todos son iguales ni diferentes");
			}
			
		}
		else {
			System.out.println("Algun valor ingresado no es v�lido.");
		}
		
	}

}
