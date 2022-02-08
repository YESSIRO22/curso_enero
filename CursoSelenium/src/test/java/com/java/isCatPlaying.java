package com.java;

import java.util.Scanner;

public class isCatPlaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean verano=true;
		int temperatura;
		
		System.out.println("Ingrese la temperatura actual: ");	
		Scanner sc = new Scanner(System.in);
		temperatura = sc.nextInt();
		
		System.out.println("Es verano? si - no: ");	
		Scanner sc1 = new Scanner(System.in);
		String esVerano = sc.next();
		
		if(esVerano=="si") {
			verano=true;
		}
		else {
			verano=false;
		}
		
		boolean gatojuega=isCatPlaying(temperatura,verano);
		
		if(gatojuega) {
		System.out.println("El gato esta jugando");
		}
		else {
		System.out.println("El gato no esta jugando");	
		}
	}
	
	public static boolean isCatPlaying(int temperatura, boolean verano) {
		
		if((!verano) && (temperatura >=25 && temperatura <=35)) {
			return true;
		}
		else if((verano) && (temperatura >=25 && temperatura <=45)){
			return true;
		}
		else {
			return false;
		}
		}
}