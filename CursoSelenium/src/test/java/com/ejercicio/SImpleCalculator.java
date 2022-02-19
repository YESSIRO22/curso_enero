package com.ejercicio;

public class SImpleCalculator {
	
	double firstNumber;
	double secondNumber;
	
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber=firstNumber;
	}
	
	public double getSecondNumber() {
		return secondNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber=secondNumber;
	}
	
	public double getAdditionResult() {
		double suma=firstNumber+secondNumber;
		return suma;
	}
	
	public double getSubtractionResult() {
		double resta= firstNumber - secondNumber;
		return resta;
	}
	
	public double getMultiplicationResult() {
		double multiplicacion= firstNumber* secondNumber;
		return multiplicacion;
	}
	
	public double getDivisionResult() {
		if (secondNumber==0) {
			return 0;
		}else {
		double division= firstNumber / secondNumber;
		return division;
		}
	}
	
	

}
