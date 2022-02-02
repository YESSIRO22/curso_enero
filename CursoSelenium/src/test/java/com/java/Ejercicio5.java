package com.java;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=-31;
		
		int resto=x%2;
		
		if(x>0) {
			System.out.println("El numero "+x+" es positivo.");
		}else {
			System.out.println("El numero "+x+" es negativo.");
		}
		
		if(resto==0) {
			System.out.println("El numero "+x+" es par.");
		}else {
			System.out.println("El numero "+x+" es impar.");
		}
		
	}

}
