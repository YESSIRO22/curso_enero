package com.java;

import java.util.Scanner;

public class hasEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nro1;
		int nro2;
		int nro3;
		boolean sumaigual;
		
		System.out.println("Ingrese un número: ");
		Scanner sc=new Scanner(System.in);
		nro1=sc.nextInt();
		
		System.out.println("Ingrese un número: ");
		Scanner sc2=new Scanner(System.in);
		nro2=sc2.nextInt();
		
		System.out.println("Ingrese un número: ");
		Scanner sc3=new Scanner(System.in);
		nro3=sc3.nextInt();
		
		sumaigual=suma(nro1,nro2,nro3);
		
		System.out.println(sumaigual);
	}
	
	public static boolean suma(int nro1,int nro2, int nro3) {
		int sumanros=nro1+nro2;
		if (sumanros==nro3) {
			return true;
		}
		else {
			return false;
		}
			
	}
	}
