package com.java;

public class Operadores {

	public static void main(String[] args) {
		// operators
				//operadores aritmeticos
				int x=2;
				int y=5;
				
				int suma=x+y;
				int resta=y-x;
				int multiplicacion=x*y;
				int division=y/x;
				
				double a=2.5;
				double b=4.33;
				
				double mult2=a*b;
				
				System.out.println("Esta es la suma " + suma);
				System.out.println("Esta es la resta " + resta);
				System.out.println("Esta es la multiplicacion " + multiplicacion);
				System.out.println ("Esta es la division " +division);
				System.out.println ("la multiplicacion da " + mult2);
				
				
				//operadores unarios - incrementar y desincrementar valores
				int unario=2;
				unario ++;
				System.out.println(unario);
				
				//Operadores Relacionales
				/* igual que =
				 diferente a !=
				msyor que >
				mayor o igual >=
				menor <
				menor o igualq ue <=
				*/
				
				int oro=2;
				int oro2=3;
				
				if(oro>oro2) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				
				String msg="Hello";
				String msg2="Hola";
				
				if(msg!=msg2) { //se puede poner asi tambien (msg equals msg2)
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				
				
				//Operadores condicionales
				/*
				 AND &&
				 OR ||
				 */
				
				int oper1=2;
				int oper2=2;
				int oper3=3;
				int oper4=4;
				
				if(oper1==oper2 && oper3==oper4) {
					System.out.println ("TODOS LOS VALORES SON IGUALES");
				}else {
					System.out.println ("ALGUN VALOR ES DESIGUAL");
				}
			
				if(oper1==oper2 || oper3==oper4) {
					System.out.println ("TODOS LOS VALORES SON IGUALES");
				}else {
					System.out.println ("ALGUN VALOR ES DESIGUAL");
				}

	}

}
