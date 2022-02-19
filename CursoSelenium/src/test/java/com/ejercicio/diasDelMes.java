package com.ejercicio;

public class diasDelMes {

	public static int getDaysInMonth(int mes, int anio) {
		if ((mes>=1 && mes <=12)&&(anio>=1 && anio<=9999)) {
			boolean bisiesto=isLeapYear.isLeapYear2(anio);
			switch(mes) {
			case 1: 
				return 31;
			case 2:
				if(bisiesto) {
					return 29;
				}
				else {
					return 28;
				}
			case 3:
				return 31;
			case 4:
				return 30;
			case 5:
				return 31;
			case 6:
				return 30;	
			case 7:
				return 31;
			case 8:
				return 31;
			case 9:
				return 30;
			case 10:
				return 31;
			case 11:
				return 30;
			case 12:
				return 31;
			}
		}
		else {
			return -1;
		}
		return 0;
	}
}
