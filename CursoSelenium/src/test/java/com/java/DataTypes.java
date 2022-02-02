package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// Datos primitivos
				byte var1=1; // numerico entero - es para dar espacio en memoria, ya no se usa
				short var2=1; //numerco entero - es para dar espacio en memoria, ya no se usa
				int var3=1; // numero entero - Automation
				long var4=1L; // numero entero largo - Automation
				float var5=1.2f; // numeros reales, espacio de 4 byte
				double var6=1.2; // numeros reales grandes, espacio de 8 byte - se usa mas
				char var7= 'a'; // caracteres en general
				boolean var8=true;
				
				//Declarar variables
				int x;
				x=10;
				
				int y =10;
			
				
				//char symbol example
				char symbol= 'c';
				
				//cadena char
				String message= "hola";
				
				//imprimir en consola
				
				System.out.println(symbol);
				System.out.println(message);
				
				//concatenation
				System.out.println(symbol+message);
				
				//concatenation
				int numero=1;
				String nombre = "Yessica";
				System.out.println(numero+nombre);
				
				System.out.println(numero+y); //suma
				System.out.println(numero+""+y); // para concatenar los numeros
				
				System.out.println("La suma de los numeros es "+( numero+ y));

	}

}
