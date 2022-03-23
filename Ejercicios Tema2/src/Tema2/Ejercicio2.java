package Tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner num = new Scanner ( System.in ); 

int  numero ,res1 , res2 , res3 , res4 ; 

System.out.println( "Escribe un numero "); 
numero = num.nextInt(); 
res1= numero%2 ; 
res2=numero%3; 
res3=numero%5; 
res4=numero%7; 
 
if (res1==0) {
	System.out.println(numero +" es multiplo de 2" ); 
} 
if (res2==0) {
	System.out.println(numero +" es multiplo de 3" ); 
} 
if (res3==0) {
	System.out.println(numero +" es multiplo de 5" ); 
} 
if (res4==0) {
	System.out.println(numero +" es multiplo de 7" ); 
} 
  

    
	}

}
