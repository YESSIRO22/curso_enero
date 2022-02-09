package com.java;

import java.util.Scanner;

public class ejercicioPerroLadrando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ladrando;
		int hourOfDay;
		boolean validarHora;
		
		System.out.println("Ingrese solo la hora actual (sin minutos): ");
		Scanner sc=new Scanner(System.in);
		hourOfDay=sc.nextInt();
		
			ladrando=shouldWakeUp(hourOfDay);
		
			if(ladrando) {
				System.out.println("El perro esta ladrando, despierta");
			}
			else {
				System.out.println("El perro esta durmiendo");
			}
	}	
	

	public static boolean shouldWakeUp(int hourOfDay) {
		
		if(hourOfDay>=0 && hourOfDay <=23) {
			if(hourOfDay<8 || hourOfDay > 22){
				return true;
			}
			else {
				return false;
			}
		}
		else {
				return false;
			}
		}
}