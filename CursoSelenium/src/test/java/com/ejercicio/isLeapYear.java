package com.ejercicio;

public class isLeapYear {
	
	public static boolean isLeapYear2(int anio){
		if(anio >= 1 && anio <=9999){
			if ((anio%4==0) && (anio%100!=0) || (anio%400==00)){
			return true;
			}else{
			return false;
			}
		}
		else{
		return false;
		}
	}

}
