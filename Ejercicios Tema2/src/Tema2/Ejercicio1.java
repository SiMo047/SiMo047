package Tema2;

import java.util.Scanner;

public class Ejercicio1 {
	//compara 3 numeros y te devuelve el mayor 
	static int mayor3(int num1 , int num2 , int num3 )  {
		
		if ((num1>num2)&&(num1>num3))
			return num1 ; 
		if ((num2>num1)&&(num2>num3))
			return num2 ; 
		if ((num3>num1)&&(num3>num2))
			return num3 ; 
		//en caso de que sean iguales
		System.out.println(" Son iguales ");
		return -1 ; 
		
	}
	//compara 4 numeros y te devuelve el mayor utlizando la funcion anterior .
	static int mayor4(int num1 , int num2 , int num3 , int num4 ) {
		return mayor3(mayor3(num1,num2,num3), num4 , -1); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner num = new Scanner(System.in);


 

System.out.println(mayor3(1000,1002,1002));// devuleve el myor de los 3 , con la funcion mayor3
System.out.println (mayor4(2100,2011,20112,50000)); //devuelve el mayor de los 4 , con la funcion mayor4


				
					
					
	}
	
	}

