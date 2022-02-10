package com.java;

import java.util.Scanner;

public class EjercicioSumaImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio;
		int fin;
		int sumaImpares;
		
		System.out.println("Ingrese el nro de inicio: ");
		Scanner sc=new Scanner (System.in);
		inicio=sc.nextInt();
		
		System.out.println("Ingrese el nro de fin: ");
		Scanner sc1=new Scanner (System.in);
		fin=sc1.nextInt();
			
		sumaImpares=sumOdd(inicio,fin);
		
		System.out.println("La suma de los números impares del rango ("+inicio+"-"+fin+") es "+sumaImpares);
		
	}
	
	public static int sumOdd (int inicio, int fin) {
		int suma=0;
		if(inicio>=0 && fin>=0) {
		if(inicio<=fin) {
			for (int i=inicio;i<=fin;i++){
				boolean impar=isOdd(i);
				if(impar) {
					suma=suma+i;
					}
			}
		}
			return suma;
		}else {
			return suma=-1;
		}
		}
	
	 public static boolean isOdd(int nro) {
		 int resto=nro%2;
			 if(resto==0) {
				 return false;
			 }
			 else {
				 return true;
			 }
		 }
}
