package com.java;

import java.util.Scanner;

public class cocheVelocidadOriginal {

	public static void main(String[] args) {
				
				int zonaEscolar= 40;
				int ciudad=60;
				int carretera = 100; 
				
				/*boolean zonaEscolar=false;
				boolean ciudad=true;
				boolean carretera=false;*/
		
				System.out.println("Velocidad del auto: ");	
				Scanner sc = new Scanner(System.in);
				int velocidadAuto = sc.nextInt();
				
				System.out.println("Seleccione una zona: 1-Carretera, 2-Zona escolar o 3-Ciudad: ");	
				Scanner sc1 = new Scanner(System.in);
				int zona= sc1.nextInt();
				 
				
				if(zona==1) { //if(carretera){
					//int limiteVelocidad=100;
					//if(velocidadAuto>limiteVelocidad) {
					if(velocidadAuto>carretera) {
							System.out.println("Supera la velocidad máxima en Carretera - MULTA!!!");
						}else {
							System.out.println("DESCUENTO por respetar normas vehiculares en Carretera");
						}
				}
				else if(zona==2) {
				
				/* if(zonaEscolar) {
					 
					 int limiteVelZonaEscolar=40;
					
					if (velocidadAuto>limiteVelZonaEscolar){*/
					if(velocidadAuto>zonaEscolar) {
						System.out.println("Supera la velocidad máxima en zona escolar - MULTA!!!");
					}else {
						System.out.println("DESCUENTO por respetar normas vehiculares");
					}
				}
				else { 
					/*if(zonaNormal) {
					int limiteVelCalleNormal=60;
					
				if (velocidadAuto>limiteVelCalleNormal){*/
				
					if (velocidadAuto>ciudad){
						System.out.println("Supera la velocidad máxima en calle normal - MULTA!!!");
					}else {
						System.out.println("DESCUENTO por respetar normas vehiculares en la calle");
					}
				}
								
				}
}