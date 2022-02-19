package com.ejercicio;

public class calculaArea {
	
	public static double area (double radio){
		if(radio >0) {
		double resultado=radio*radio*(Math.PI);
		return resultado;
		}
		else
		{
			return -1;
		}
	}
//overloading	
	public static double area (double x, double y) {
		if(x >0 && y>0) {
			double resultado=x*y;
			return resultado;
		}
		else {
			return -1;
		}
	}
}
