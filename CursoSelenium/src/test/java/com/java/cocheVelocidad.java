package com.java;

import java.util.Scanner;

public class cocheVelocidad {

	public static void main(String[] args) {
		
				int zonaEscolar= 40;
			    int ciudad=60;
				int carretera = 100; 
				
				System.out.println("Velocidad del auto: ");	
				Scanner sc = new Scanner(System.in);
				int velocidadAuto = sc.nextInt();
				
				System.out.println("Seleccione una zona: 1-Carretera, 2-Zona escolar o 3-Ciudad: ");	
				Scanner sc1 = new Scanner(System.in);
				int zona= sc1.nextInt();
				 
				 
				switch(zona) {
				case 1:
					if(velocidadAuto>carretera) {
							System.out.println("Supera la velocidad máxima en Carretera - MULTA!!!");
						}else {
							System.out.println("DESCUENTO por respetar normas vehiculares en Carretera");
						}
					break;
				case 2:
				
					if(velocidadAuto>zonaEscolar) {
						System.out.println("Supera la velocidad máxima en zona escolar - MULTA!!!");
					}else {
						System.out.println("DESCUENTO por respetar normas vehiculares");
					}
					break;
					
				case 3: 
					if (velocidadAuto>ciudad){
						System.out.println("Supera la velocidad máxima en calle normal - MULTA!!!");
					}else {
						System.out.println("DESCUENTO por respetar normas vehiculares en la calle");
					}
					default:
						System.out.println("ERROR");
					
				}					
				}
}